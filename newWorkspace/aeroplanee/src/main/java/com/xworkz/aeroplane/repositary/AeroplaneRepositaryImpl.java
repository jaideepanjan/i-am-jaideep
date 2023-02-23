package com.xworkz.aeroplane.repositary;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;

@Repository

public class AeroplaneRepositaryImpl implements AeroplaneRepositary {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AeroplaneRepositaryImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(AeroplaneEntity entity) {
		System.out.println("running save in dao");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(entity);
		et.commit();
		em.close();

		return false;

	}
	@Override
	public AeroplaneEntity findById(int id) {
		System.out.println("find by id in dao" + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		AeroplaneEntity fromDb = entityManager.find(AeroplaneEntity.class, id);
		entityManager.close();
		return fromDb;

	}

}
