package com.xworkz.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.project.service.ProjectService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@EnableWebMvc
@RequestMapping("/")
public class AjaxController {
	
	
	@Autowired
	public ProjectService projectService;
	
	
	
	public AjaxController() {
		log.info("Created"+this.getClass().getSimpleName());
	}
	
	
	
	
	
	
	
	
	

}
