package com.xworkz.project.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.fasterxml.jackson.databind.Module;
import com.xworkz.project.dto.ProjectDTO;

public interface ProjectService {
	
	Set<ConstraintViolation<ProjectDTO>> validateAndSave(ProjectDTO dto);
	
	// boolean sendMail(String email,String text);

}
