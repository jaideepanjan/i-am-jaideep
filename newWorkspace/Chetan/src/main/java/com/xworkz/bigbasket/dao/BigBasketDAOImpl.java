package com.xworkz.bigbasket.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bigbasket.entity.BigBasketEntity;


@Repository
public class BigBasketDAOImpl implements BigBasketDAO {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public BigBasketDAOImpl() {
		System.out.println("creating" + this.getClass().getSimpleName());
	}
	@Override
	public boolean save(BigBasketEntity entity) {

		System.out.println("running save in dao");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(entity);
		et.commit();
		em.close();

		return false;
	}
}


