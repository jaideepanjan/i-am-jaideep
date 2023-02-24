package com.xworkz.forest.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.forest.entity.ForestEntity;



public class InsertRunner {

	public static void main(String[] args) {
		System.out.println("Running main method for inserting data to database");
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("com.xworkz.forest");
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction=  manager.getTransaction();
		
		
		ForestEntity entity=new ForestEntity(1, "Bandipura National Forest", "Karnataka", 874, "Dry Decious Forest");
		ForestEntity entity1=new ForestEntity(2, "Amazon RainForest", "South America", 2.2, "RainForest");
		ForestEntity entity2=new ForestEntity(3, "Tongass National forest", "US", 16.7, "Tree Forest");
		ForestEntity entity3=new ForestEntity(4, "Congo rainforest", "South Africa", 3.7, "rainforests and swamps");
		ForestEntity entity4=new ForestEntity(5, "Sango Bamboo Forest", "Kyoto", 874, "Bamboo Forest");
		ForestEntity entity5=new ForestEntity(6, "Kaziranga National Park", "Assam", 16, " Broadleaf forests");
		ForestEntity entity6=new ForestEntity(7, "Periyar National Park", "Kerala", 297, "Tree forest");
		ForestEntity entity7=new ForestEntity(8, "Gir National Park", "Gujarat,", 1410, "Birds Forest");
		ForestEntity entity8=new ForestEntity(9, "Jim Corbett National Park", "Uttarakhand", 1318, "Wildlife sanctuary");
		ForestEntity entity9=new ForestEntity(10, "Kanha Tiger Reserve", "Madhya Pradesh", 940, "Grassland");
		
		
		transaction.begin();
		manager.persist(entity);
		manager.persist(entity1);
		manager.persist(entity2);
		manager.persist(entity3);
		manager.persist(entity4);
		manager.persist(entity5);
		manager.persist(entity6);
		manager.persist(entity7);
		manager.persist(entity8);
		manager.persist(entity9);
		
		
		
		transaction.commit();

	}

}
