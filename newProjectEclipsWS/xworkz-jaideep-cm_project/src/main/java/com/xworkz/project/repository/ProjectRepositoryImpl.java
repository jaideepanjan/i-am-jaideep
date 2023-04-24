package com.xworkz.project.repository;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.ProjectEntity;
import com.xworkz.project.service.ProjectService;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ProjectRepositoryImpl implements ProjectRepository {
	
	
	@Autowired
	private ProjectService projectService;
	
	
	public ProjectRepositoryImpl() {
		log.info("Created"+this.getClass().getSimpleName());
	}


	@Override
	public boolean save(ProjectEntity entity) {
		log.info("Running Save method in repository");
		
		EntityManagerFactory factory;
		
		return false;
	}
	
	
	
	
	

}
