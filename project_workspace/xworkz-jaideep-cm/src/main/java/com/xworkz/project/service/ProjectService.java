package com.xworkz.project.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.entity.TechnologyEntity;

public interface ProjectService {
	
	Set<ConstraintViolation<ProjectDto>> validateAndSave(ProjectDto dto);
	
	boolean sendMail(String email,String text);
	
	default List<ProjectDto> findAll(){
		return Collections.emptyList();
	}
	
	default Long findByUserId(String userId) {
		return null;
	}
	
	default Long findByEmail(String email) {
		return null;
	}
	
	default Long findByMobile(Long mobileNumber) {
		return null;
	}
	
	default ProjectDto signIn(String userId,String password) {
		return null;
	}
	
	default ProjectDto reSetPassword(String email) {
		return null;
	}
	
	default ProjectDto updatePassword(String userId,String password,String confirmPassword) {
		return null;
	}
	
	default ProjectDto updateProfile(String userId, String email, Long mobileNumber, String imagePath) {
		return null;
	}
	
	default ProjectDto technology(String userId,TechnologyEntity tecEnty) {
		return null;
	}
	
	default List<TechnologyEntity> techView(String userId){
		return null;
	}

}
