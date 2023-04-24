package com.xworkz.project.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.xdevapi.Schema.Validation;
import com.xworkz.project.dto.ProjectDTO;
import com.xworkz.project.repository.ProjectRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProjectServiceImpl implements ProjectService {
	
	
	public ProjectServiceImpl() {
		log.info("Created"+this.getClass().getSimpleName());
	}
	
	@Autowired
	private ProjectRepository projectRepository;
	
	
	
	@Override
	public Set<ConstraintViolation<ProjectDTO>> validateAndSave(ProjectDTO dto) {
		log.info("Running validateAndSave in service");
		
		
		return null;
	}

//	@Override
//	public boolean sendMail(String email, String text) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
