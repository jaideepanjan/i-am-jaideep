package com.xworkz.project.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.repositary.ProjectRepo;
import com.xworkz.project.service.ProjectService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	public ProjectController() {
		log.info("Created" + this.getClass().getSimpleName());
	}

	@PostMapping("/ivar")
	public String onSignUp(ProjectDto dto, Model model) {

		Set<ConstraintViolation<ProjectDto>> violations = this.projectService.validateAndSave(dto);

		if (violations.isEmpty() && violations != null && dto != null) {
			model.addAttribute("message", "Registration  sucessfully");
			log.info("No violation in Controller go to success page" + dto);
			return "Signup";
		}

		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		model.addAttribute("message", "data not saved ");

		log.info("dto " + dto);
		log.info("Violation in Controller");

		return "Signup";

	}

	@PostMapping("/aj")
	public String userSignIn(String userId, String password, Model model) {

		try {

			ProjectDto dto = this.projectService.signIn(userId, password);
			log.info("Login count" + dto.getLoginCount());

			if (dto.getLoginCount() >= 3) {
				model.addAttribute("msg", "account locked reset password ");
				return "SignIn";
			}

			if (dto != null) {

				if (dto.getResetPassword() == true) {
					model.addAttribute("userId", dto.getUserId());
					return "UpdatePassword";
				}

				log.info("User ID and password is matched");
				model.addAttribute("userID", dto.getUserId());
				return "LoginSucess";
			}
		} catch (Exception ex) {
			ex.getMessage();
		}
		model.addAttribute("match", "UserID OR Password is not matching");
		return "SignIn";

	}
	
	@PostMapping("/reSet")
	public String reSetPassword(String email,Model model) {
		ProjectDto dto=this.projectService.reSetPassword(email);
		
		if(dto.getResetPassword()==true) {
			model.addAttribute("msg", "Password reset sucessfully please login");
			return "ResetPassword";
		}
		return "ResetPassword";
	}
	
	@PostMapping("/updatePassword")
	public String updatePassword(String userId,String password,String confirmPassword) {
		this.projectService.updatePassword(userId, password, confirmPassword);
		return "Sucess";
		
	}
}
