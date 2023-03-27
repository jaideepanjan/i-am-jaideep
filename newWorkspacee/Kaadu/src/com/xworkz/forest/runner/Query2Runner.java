package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forest.entity.ForestEntity;

public class Query2Runner {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager = factory.createEntityManager();
		Query query=manager.createNamedQuery("findByState");
     Object  obj= query.getSingleResult();
     ForestEntity entity=(ForestEntity)obj;
     System.out.println(entity);
     manager.close();

	}

}
