package com.xworkz.project.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Base64.Decoder;
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
import com.xworkz.project.entity.TechnologyEntity;
import com.xworkz.project.repositary.ProjectRepo;

import ch.qos.logback.core.encoder.Encoder;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepo projectRepo;

	@Autowired
	private PasswordEncoder encoder;

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

		log.info("userIdCount" + userIdCount);
		log.info("emailCount" + emailCount);
		log.info("mobileNumCount" + mobileNumCount);

		Set<ConstraintViolation<ProjectDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			log.error("No Violation in dto ");
			return violations;
		}
		if (!dto.getPassword().equals(dto.getConfirmPassword())) {
			return null;
		} else {

//		if (userIdCount == 0 && mobileNumCount == 0 && emailCount == 0) {

			log.info("Violation is not  in dto, can Save the data");

			ProjectEntity entity = new ProjectEntity();
			// entity.setSignUpId(dto.getId());
			entity.setUserId(dto.getUserId());
			entity.setEmail(dto.getEmail());
			entity.setMobileNumber(dto.getMobileNumber());
//			entity.setPassword(dto.getPassword());
			entity.setCreatedBy(dto.getUserId());
			entity.setCreatedDate(LocalDateTime.now());
			entity.setAcceptAgreement(dto.isAcceptAgreement());
			entity.setResetPassword(false);
			entity.setPassword(encoder.encode(dto.getPassword()));

			boolean saved = this.projectRepo.save(entity);
			log.info("Entity Data is Saved " + saved);

			if (saved) {

				boolean sent = this.sendMail(dto.getEmail(), "Thank you and your registeration is completed");
				log.info("message sent sucessfully");
			}
			log.info("Saved in repo : " + saved);

			return Collections.emptySet();

		}
	}

	@Override
	public boolean sendMail(String email, String text) {

		log.info("Running Send mail in service impl");

		//String portNumber = "587";// 485,587,25
		String hostName = "smtp.office365.com";
		 String fromEmail = "amul.17@outlook.com";
		 String password = "Amulanju@17";
		String to = email;

		Properties prop = new Properties();

		prop.put("mail.smtp.host", hostName);
		prop.put("mail.smtp.prot", 587);
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.debug", "true");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.ssl.trust", "smtp.office365.com");
		prop.put("mail.transport.protocal", "smtp");
		log.info("Email session will start(authentication) ");
		Session session = Session.getInstance(prop, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				log.info("Running getPasswordAuthentication in session (while mail sending) ");
				return new PasswordAuthentication(fromEmail, password);

			}
		});
		log.info("Email session completed(authentication) ");

		MimeMessage message = new MimeMessage(session);
		try {
			log.info("Running MimeMessage after session completed while sending mail");
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject("Registration Sucessful");
			message.setText(text);
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
		log.info("Running Sign method in Service impl");

		ProjectEntity entity = this.projectRepo.signIn(userId);

		ProjectDto dto = new ProjectDto();
//		dto.setUserId(entity.getUserId());
//		dto.setPassword(entity.getPassword());
		BeanUtils.copyProperties(entity, dto);
		log.info("Copying the properties ");

		log.info("matching--" + encoder.matches(password, entity.getPassword()));
//		log.info("Time matching--" + entity.getPasswordChangedTime().isAfter(LocalTime.now()));
//		log.info("Now Present Time--" + LocalTime.now());
//		log.info("PasswordChangedTime--" + entity.getPasswordChangedTime());

		// log.info("Time " +
		// LocalTime.now().isBefore(entity.getPasswordChangedTime()));

		if (entity.getLoginCount() >= 3) {
			log.info("Running login count condition");
			return dto;
		}

//		dto.getPassword().matches(password)

		if (dto.getUserId().matches(userId) && encoder.matches(password, entity.getPassword())) {
			log.info("Running userId matching and password matching");
			return dto;
		} else {
			log.info("not matched so running login count");
			this.projectRepo.loginCount(userId, entity.getLoginCount() + 1);

			log.info("count of login" + entity.getLoginCount() + 1);
			return null;

		}

	}

	@Override
	public ProjectDto reSetPassword(String email) {

		log.info("Running reSetPassword in service impl");

		ProjectEntity entity = this.projectRepo.reSetPassword(email);

		if (entity != null) {
			log.info("entity is not empty ");
			log.info("email found in entity " + email);
			entity.setPassword(encoder.encode(reSetPassword));
			entity.setUpdatedBy("System");
			entity.setUpdatedDate(LocalDateTime.now());
			entity.setLoginCount(0);
			entity.setResetPassword(true);
			entity.setPasswordChangedTime(LocalTime.now().plusSeconds(240));
			boolean update = this.projectRepo.update(entity);
			log.info("(Running in service impl) updation in entity completed ");

			if (update) {
				log.info("updating done sending mail");
				boolean sendEmail = this.sendMail(entity.getEmail(),
						"Please Log in using OTP and re set your Password with in 240 Seconds ,Your OTP is : "
								+ reSetPassword);
				log.info("mail sent ");
				log.info("OTP is : "+reSetPassword);
			}
			log.info("updated" + update);

			ProjectDto updateDTO = new ProjectDto();
			BeanUtils.copyProperties(entity, updateDTO);
			return updateDTO;
		}
		log.info("Email not found : " + email);
		return ProjectService.super.reSetPassword(email);
	}

	@Override
	public ProjectDto updatePassword(String userId, String password, String confirmPassword) {

		ProjectEntity upEntity = new ProjectEntity();

		if (password.equals(confirmPassword)) {
			boolean passwordUpdate = this.projectRepo.updatePassword(userId, encoder.encode(password), false);
			log.info("paswordUpdated" + passwordUpdate);
		}

		return ProjectService.super.updatePassword(userId, password, confirmPassword);
	}

	public final static class DefaultPasswordGenerator {
		private static final String[] chChategories = new String[] { "qwertyuiopasdfghjklzxcvbnm",
				"QWERTYUIOPASDFGHJKLZXCVBNM", "0123456789" };

		public static String generator(int length) {
			StringBuilder password = new StringBuilder(length);
			Random random = new Random(System.nanoTime());

			for (int i = 0; i < length; i++) {
				String chCategory = chChategories[random.nextInt(chChategories.length)];
				int position = random.nextInt(chCategory.length());
				password.append(chCategory.charAt(position));
			}
			return new String(password);
		}
	}
	
	@Override
	public ProjectDto updateProfile(String userId, String email, Long mobileNumber, String imagePath) {
		log.info("Inside update profile method");
		
			ProjectEntity upEntity = this.projectRepo.reSetPassword(email);
			log.info("userId: " + userId + "email: " + email + "mobile: " + mobileNumber + "image name: "+ 										imagePath);

			upEntity.setUserId(userId);
			upEntity.setMobileNumber(mobileNumber);
			upEntity.setPicName(imagePath);
			boolean updated = this.projectRepo.update(upEntity);
			log.info("updated--" + updated);
			return ProjectService.super.updateProfile(userId, email, mobileNumber, imagePath);
		}
	
	@Override
	public ProjectDto technology(String userId, TechnologyEntity tecEnty) {
		log.info("Running technologyes in service impl");
		
	ProjectEntity entity=this.projectRepo.signIn(userId);
	//entity.setCreatedBy(userId);
	tecEnty.setProjectEntity(entity);
	tecEnty.setCreatedBy(userId);
	tecEnty.setCreatedDate(LocalDateTime.now());
	log.info("accessing entity "+entity);
	boolean saved=this.projectRepo.techSave(tecEnty);
	log.info("Technologyes saved in data base : "+saved);
		
		return ProjectService.super.technology(userId, tecEnty);
	}
	
	@Override
	public List<TechnologyEntity> techView(String userId) {
		log.info("Running view technology in service impl ");
		ProjectEntity entity=this.projectRepo.signIn(userId);
		List<TechnologyEntity> technologyes=entity.getTechnologyes();
		log.info("Getting technologyes as per user id : "+userId+"  : "+technologyes);
		
		return technologyes;
	}

}
