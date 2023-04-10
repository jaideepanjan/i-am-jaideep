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

			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(entity);
			et.commit();
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
	public ProjectEntity signIn(String userId, String password) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByUserIdAndPassword");
			query.setParameter("uId", userId);
			query.setParameter("pswd", password);
			Object object = query.getSingleResult();
			ProjectEntity entity = (ProjectEntity) object;
			log.info("" + entity);
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

			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();

			Query query = manager.createNamedQuery("updateLoginCount");
			query.setParameter("userId", userId);
			query.setParameter("count", count);
			query.executeUpdate();
			transaction.commit();
			return true;

		} finally {
			manager.close();
		}

	}
	@Override
	public ProjectEntity reSetPassword(String email) {
		
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		
		try {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			
			Query query=manager.createNamedQuery("email");
			query.setHint("id", email);
			Object object=query.getSingleResult();
			ProjectEntity entity=(ProjectEntity)object;
			log.info(""+entity);
			return entity;
			
		}finally {
			manager.close();			
		}
		 
		
	}

	@Override
	public boolean update(ProjectEntity entity) {

		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;

		} finally {
			manager.close();
		}

	}

	@Override
	public boolean updatePassword(String userId, String password, Boolean resetPassword) {
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			
			Query query=manager.createNamedQuery("updatePassword");
			query.setParameter("uu", userId);
			query.setParameter("up", password);
			query.setParameter("urp", resetPassword);
			query.executeUpdate();
			transaction.commit();
			return true;
			
			}finally {
				manager.close();
		}
		
	}

}
