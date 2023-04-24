package com.xworkz.project.repositary;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xworkz.project.entity.ProjectEntity;
import com.xworkz.project.entity.TechnologyEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ProjectRepoImpl implements ProjectRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public ProjectRepoImpl() {
		log.info("Created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(ProjectEntity entity) {
		log.info("Running save in Repository");
		log.info("Entity in repo" + entity);

		EntityManager em = this.entityManagerFactory.createEntityManager();

		try {
			log.info("doing transaction in repoImpl in try block ");
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(entity);
			et.commit();
			log.info("transaction completed");
			return true;
		} finally {
			em.close();
		}

	}

	@Override
	public List<ProjectEntity> findAll() {
		EntityManager manajer = this.entityManagerFactory.createEntityManager();

		try {
			Query query = manajer.createNamedQuery("findAll");
			List<ProjectEntity> list = query.getResultList();
			log.info("total size found in repo" + list.size());
			return list;
		} finally {
			manajer.close();
		}
	}

	@Override
	public Long findByUserId(String userId) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByUserId");
			query.setParameter("userBy", userId);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			return value;

		} finally {
			manager.close();
		}
	}

	@Override
	public Long findByEmail(String email) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByEmail");
			query.setParameter("emailBy", email);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			return value;

		} finally {
			manager.close();
		}

	}

	@Override
	public Long findByMobile(Long number) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByMobile");
			query.setParameter("mobileBy", number);
			Object object = query.getSingleResult();
			Long value = (Long) object;
			System.out.println(value);
			return value;

		} finally {
			manager.close();
		}
	}

	@Override
	public ProjectEntity signIn(String userId) {
		log.info("Running Sign In in repo impl");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		log.info("Entity maneger created ");
		try {
			log.info("running in try block");
			Query query = manager.createNamedQuery("uIdandPsw");
			query.setParameter("uId", userId);
			
			Object object = query.getSingleResult();
			ProjectEntity entity = (ProjectEntity) object;
			log.info("" + entity);
			log.info("try block process completed");
			return entity;
		} finally {
			manager.close();
		}

	}

	@Override
	public boolean loginCount(String userId, int count) {
		log.info("count : " + count);

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			
			log.info("Running login count in repo impl");

			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			log.info("Transaction started");

			Query query = manager.createNamedQuery("updateLoginCount");
			query.setParameter("uID",userId );
			query.setParameter("cut",count );					
			query.executeUpdate();
			transaction.commit();
			log.info("Transaction completed");
			return true;

		} finally {
			manager.close();
		}

	}

	@Override
	public ProjectEntity reSetPassword(String email) {

		EntityManager manager = this.entityManagerFactory.createEntityManager();

		try {
			log.info("Running reset password in try block of repo impl ");
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			
			Query query = manager.createNamedQuery("reEmail");
			Query em=query.setParameter("eId", email);
		System.out.println("dont know what is this : "+em);
			Object object = query.getSingleResult();
			ProjectEntity entity = (ProjectEntity) object;
			log.info("" + entity);
			log.info("Running reset password completed in try block of repo impl  ");
			return entity;

		} finally {
			manager.close();
		}

	}

	@Override
	public boolean update(ProjectEntity entity) {

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			log.info("Running update try block in repo impl");
			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			log.info("Running update completed try block in repo impl");
			return true;

		} finally {
			manager.close();
		}

	}

	@Override
	public boolean updatePassword(String userId, String password, Boolean resetPassword) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();

			Query query = manager.createNamedQuery("updatePassword");
			query.setParameter("uu", userId);
			query.setParameter("up", password);
			query.setParameter("urp", resetPassword);
			query.executeUpdate();
			transaction.commit();
			return true;

		} finally {
			manager.close();
		}

	}
	
	
	@Override
	public boolean techSave(TechnologyEntity techEntity) {
		log.info("Running technology save in repo impl");
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(techEntity);
			transaction.commit();		
		return true;
		}finally {
			manager.close();
		}
	}

}
