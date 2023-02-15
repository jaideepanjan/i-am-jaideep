package com.xworkz.muddu.repositary;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.muddu.dto.EggAppDTO;

@Repository
public class EggRepositoryImp implements EggRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public EggRepositoryImp() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(EggAppDTO dto) {
		System.out.println("Running save in egg repositary");
		
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		entityManager.clear();
		return false;
	}

}
