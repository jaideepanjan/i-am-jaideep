package com.xworkz.transformer.repositary;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.transformer.dto.TransformerDTO;
import com.xworkz.transformer.entity.TransformerEntity;

@Repository
public class TransformerRepoImpl implements TransformerRepositry {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public TransformerRepoImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(TransformerEntity entity) {
		System.out.println("Running save method ");
		EntityManager factory = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = factory.getTransaction();

		transaction.begin();
		factory.persist(entity);
		transaction.commit();
		factory.close();
		return false;
	}
	
	

	@Override
	public TransformerEntity findById(int id) {
		System.out.println("find by id in dao" + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		
		try{
			TransformerEntity fromDb = entityManager.find(TransformerEntity.class, id);
		return fromDb;
		}
		finally {
		entityManager.close();
		}
	}

	@Override
	public List<TransformerEntity> findByBrand(String brand) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();

		try {
			Query query = manager.createNamedQuery("findByBrand");
			query.setParameter("brand", brand);
			List<TransformerEntity> list = query.getResultList();
			System.out.println("Total list : " + list.size());
			return list;
		} finally {
			manager.close();
		}

	}

	@Override
	public boolean update(TransformerEntity entity) {
		System.out.println("Running update in repo  ");
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;
		}
		finally {
			manager.close();
		}
		
		}

	@Override
	public boolean deleteById(int id) {
		System.out.println("Running in deleteById in repositary");
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			TransformerEntity entity=manager.find(TransformerEntity.class, id);
			manager.remove(entity);
			System.out.println("Enter Repositary in "+entity);
			transaction.commit();
			return true;			
		}
		finally {
			manager.close();
		}
		
		
	}
	

	@Override
	public List<TransformerEntity> displayAll() {
		System.out.println("Running displayAll in repository ");
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		
		try {
			Query query=manager.createNamedQuery("displayAll");
			List list=query.getResultList();
			list.forEach(e-> System.out.println(e));
			return list;
			
		}
		catch(PersistenceException per) {
			per.printStackTrace();
		}
		finally {
			manager.close();
		}
		return TransformerRepositry.super.displayAll();
	}
	
	
	@Override
	public List<TransformerEntity> searchByTwo(String qualityStandards, String typeOfCooling) {
		System.out.println("Running searchByTwo innrepositary");
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		
		try {
			Query query=manager.createNamedQuery("findByTwo");
					query.setParameter("qs", qualityStandards);
					query.setParameter("toc", typeOfCooling);
					List list=query.getResultList();
			list.forEach(g->System.out.println(g));
			return list;
		}
		catch(PersistenceException pe) {
			pe.printStackTrace();
		}
		finally {
			manager.close();
		}
		return TransformerRepositry.super.searchByTwo(qualityStandards, typeOfCooling);
	}

}
