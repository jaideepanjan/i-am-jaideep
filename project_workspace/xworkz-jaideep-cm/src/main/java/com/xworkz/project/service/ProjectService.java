package com.xworkz.project.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.project.dto.ProjectDto;

public interface ProjectService {
	
	Set<ConstraintViolation<ProjectDto>> validateAndSave(ProjectDto dto);
	
//	boolean sendMail(String email);

}
