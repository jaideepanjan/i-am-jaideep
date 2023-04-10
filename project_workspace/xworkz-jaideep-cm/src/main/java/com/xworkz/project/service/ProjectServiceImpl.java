package com.xworkz.project.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.entity.ProjectEntity;
import com.xworkz.project.repositary.ProjectRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepo projectRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	String reSetPassword = DefaultPasswordGenerator.generator(6);

	public ProjectServiceImpl() {
		log.info("Created " + this.getClass().getSimpleName());
	}

//	private Set<ConstraintViolation<ProjectDto>> validate(ProjectDto projectDto) {
//		ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
//		Validator validator = validationFactory.getValidator();
//		Set<ConstraintViolation<ProjectDto>> vailation = validator.validate(projectDto);
//		return vailation;
//	}

	@Override
	public Set<ConstraintViolation<ProjectDto>> validateAndSave(ProjectDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Long userIdCount = this.projectRepo.findByUserId(dto.getUserId());
		Long emailCount = this.projectRepo.findByEmail(dto.getEmail());
		Long mobileNumCount = this.projectRepo.findByMobile(dto.getMobileNumber());

		log.error("userIdCount" + userIdCount);
		log.error("emailCount" + emailCount);
		log.error("mobileNumCount" + mobileNumCount);

		Set<ConstraintViolation<ProjectDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			log.error("Violation in dto " + dto);
			return violations;
		}
		if (!dto.getPassword().equals(dto.getConfirmPassword())) {
			return null;
		}

		if (userIdCount == 0 && mobileNumCount == 0 && emailCount == 0) {

			log.info("Violation is not There in dto, can Save the data");

			ProjectEntity entity = new ProjectEntity();
			// entity.setSignUpId(dto.getId());
			entity.setUserId(dto.getUserId());
			entity.setEmail(dto.getEmail());
			entity.setMobileNumber(dto.getMobileNumber());
			entity.setPassword(dto.getPassword());
			entity.setCreatedBy(dto.getUserId());
			entity.setCreatedDate(LocalDateTime.now());
			entity.setAcceptAgreement(dto.isAcceptAgreement());

			boolean saved = this.projectRepo.save(entity);
			log.info("Entity Data is Saved " + saved);

			if (saved) {
				boolean sent = this.sendMail(dto.getEmail());
				log.info("Email sent -:" + sent);

			}

		}
		return Collections.emptySet();

	}

	@Override
	public boolean sendMail(String email) {

		String portNumber = "567";
		String hostName = "smtp.office365.com";
		final String fromEmail = "amul.17@outlook";
		final String password = "Amulanju@17";
		String to = email;

		Properties prop = new Properties();

		prop.put("mail.smtp.host", hostName);
		prop.put("mail.smtp.prop", portNumber);
		prop.put("mail.smtp.starttls.enable", true);
		prop.put("mail.debug", true);
		prop.put("mail.smtp.auth", true);
		prop.put("mail.transport.protocal", "smtp");

		Session session = Session.getInstance(prop, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);

			}
		});

		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject("Registration completed");
			message.setText("Thanks for registration");
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			Transport.send(message);
			log.info("mail sent sucessfully");
		} catch (MessagingException me) {
			me.printStackTrace();
		}

		return true;
	}

	@Override
	public List<ProjectDto> findAll() {
		List<ProjectEntity> entity = this.projectRepo.findAll();
		List<ProjectDto> dto = new ArrayList<ProjectDto>();
		for (ProjectEntity enty : entity) {
			ProjectDto dto1 = new ProjectDto();
			BeanUtils.copyProperties(enty, dto1);
			dto.add(dto1);
		}

		return dto;
	}

	@Override
	public Long findByUserId(String userId) {
		Long userIdCount = this.projectRepo.findByUserId(userId);
		return userIdCount;
	}

	@Override
	public Long findByEmail(String email) {
		Long emailCount = this.projectRepo.findByEmail(email);
		log.error("find by email");
		return emailCount;
	}

	@Override
	public Long findByMobile(Long mobileNumber) {
		Long mobileNumCount = this.projectRepo.findByMobile(mobileNumber);
		return mobileNumCount;
	}

	@Override
	public ProjectDto signIn(String userId, String password) {
		ProjectEntity entity = this.projectRepo.signIn(userId, password);
		ProjectDto dto = new ProjectDto();
		dto.setUserId(entity.getUserId());
		dto.setPassword(entity.getPassword());
		
		if(entity.getLoginCount()>=3) {
			log.info("Running login count condition");
			return dto;
		}
		
		

		if (dto.getUserId().equals(userId) && dto.getPassword().equals(password)) {
			return dto;
		} else {
			this.projectRepo.loginCount(userId, entity.getLoginCount() + 1);

			log.info("count of login" + entity.getLoginCount() + 1);
			return null;

		}

	}
	
	@Override
	public ProjectDto reSetPassword(String email) {
		log.info("Running reSetPassword ");
		
		ProjectEntity entity=this.projectRepo.reSetPassword(email);
		
		if(entity!=null) {
			entity.setPassword(passwordEncoder.encode(reSetPassword));
			entity.setUpdatedBy("System");
			entity.setUpdatedDate(LocalDateTime.now());
			entity.setLoginCount(0);
			entity.setResetPassword(true);
			boolean update=this.projectRepo.update(entity);
			
			if (update) {
				sendMail(entity.getEmail());
			}
			log.info("updated"+update);
			
			ProjectDto updateDTO=new ProjectDto();
			BeanUtils.copyProperties(entity, updateDTO);
			return updateDTO;
		}
		
		return ProjectService.super.reSetPassword(email);
	}
	
	@Override
	public ProjectDto updatePassword(String userId, String password, String confirmPassword) {


		ProjectEntity upEntity=new ProjectEntity();
		
		if(password.equals(confirmPassword)) {
			boolean passwordUpdate=this.projectRepo.updatePassword(userId, passwordEncoder.encode(password), false);
			log.info("paswordUpdated"+passwordUpdate);
		}
		
		
		return ProjectService.super.updatePassword(userId, password, confirmPassword);
	}
	
	public final static class DefaultPasswordGenerator{
		private static final String[] chChategories=new String[] {"qwertyuiopasdfghjklzxcvbnm","QWERTYUIOPASDFGHJKLZXCVBNM","0123456789"};

		public static String generator(int length) {
			StringBuilder password=new StringBuilder(length);
			Random random = new Random(System.nanoTime());
			
			for(int i=0; i<length;i++) {			
				String chCategory = chChategories[random.nextInt(chChategories.length)];
				int position=random.nextInt(chCategory.length());
				password.append(chCategory.charAt(position));
			}
			return new String(password);
		}
	}
	
	

}
