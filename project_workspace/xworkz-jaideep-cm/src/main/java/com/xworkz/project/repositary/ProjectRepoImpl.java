package com.xworkz.project.repositary;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xworkz.project.entity.ProjectEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ProjectRepoImpl implements ProjectRepo {
	
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public ProjectRepoImpl() {
		log.info("Created"+this.getClass().getSimpleName());
	}
	
	
	
	@Override
	public boolean save(ProjectEntity entity) {
		log.info("Running save in Repository");
		log.info("Entity in repo"+entity);
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		
		return false;
	}
	
	

}
