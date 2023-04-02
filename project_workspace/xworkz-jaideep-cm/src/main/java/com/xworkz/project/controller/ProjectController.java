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

	@PostMapping("ivar")
	public String onSignUp(ProjectDto dto, Model model) {
		
		Set<ConstraintViolation<ProjectDto>> violations = this.projectService.validateAndSave(dto);
		
		if(violations.isEmpty()) {
			model.addAttribute("message", "data saved sucessfully");
			log.info("No violation in Controller go to success page");
			return "Signup";
		}
		
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		model.addAttribute("message", "data not saved ");
		
		log.info("dto " + dto);
		log.info("Violation in Controller");
		
		return "Signup";

}
}
