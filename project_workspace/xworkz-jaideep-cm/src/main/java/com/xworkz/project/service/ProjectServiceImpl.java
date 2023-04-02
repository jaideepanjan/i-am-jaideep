package com.xworkz.project.service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Properties;
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

import org.springframework.beans.factory.annotation.Autowired;
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

	public ProjectServiceImpl() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ProjectDto>> validateAndSave(ProjectDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ProjectDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violation in dto " + dto);
			return violations;
		} else {
			log.info("Violation is not There in dto, can Save the data");

			ProjectEntity entity = new ProjectEntity();
			// entity.setSignUpId(dto.getId());
			entity.setUserId(dto.getUserId());
			entity.setEmail(dto.getEmail());
			entity.setMobileNumber(dto.getMobileNumber());
			entity.setPassword(dto.getPassword());
			entity.setCreatedBy(dto.getUserId());
			entity.setCreatedDate(LocalDateTime.now());

			boolean saved = this.projectRepo.save(entity);
			log.info("Entity Data is Saved " + saved);

			return Collections.emptySet();
		}
	}

//	@Override
//	public boolean sendMail(String email) {
//
//		String portNumber = "567";
//		String hostName = "smtp.gmail.com";
//		String fromEmail = "sangeetha642@outlook";
//		String password = "bhadravathi";
//		String to = email;
//
//		Properties prop = new Properties();
//
//		prop.put("mail.smtp.host", hostName);
//		prop.put("mail.smtp.prop", portNumber);
//		prop.put("mail.smtp.starttls.enable", true);
//		prop.put("mail.debug", true);
//		prop.put("mail.smtp.auth", true);
//		prop.put("mail.transport.protocal", "smtp");
//
//		Session session = Session.getInstance(prop, new Authenticator() {
//
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(fromEmail, password);
//
//			}
//		});
//
//		MimeMessage message = new MimeMessage(session);
//		try {
//			message.setFrom(new InternetAddress(fromEmail));
//			message.setSubject("Registration completed");
//			message.setText("Thanks for registration");
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//			Transport.send(message);
//			log.info("mail sent sucessfully");
//		} catch (MessagingException me) {
//			me.printStackTrace();
//		}
//
//		return true;
//	}

}
