package com.xworkz.project.repositary;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.project.entity.TechnologyEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class TecRepositoryImpl implements TecRepository  {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public List<TechnologyEntity> search(String name, String language, String version, String owner, String supportFrom,
			String supportTo, String license, String openSource,String osType,String userId) {
		log.info("Running tecnology Search in repo impl ");
		
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		
		try {
			
			Query query=entityManager.createNamedQuery("searchTech");
			query.setParameter("t_name", name);
			query.setParameter("t_lang", language);
			query.setParameter("t_version", version);
			query.setParameter("t_owner", owner);
			query.setParameter("t_suppoetfrom", supportFrom);
			query.setParameter("t_suppoetTo", supportTo);
			query.setParameter("t_licenseNo", license);
			query.setParameter("t_openSource", openSource);
			query.setParameter("t_osType", osType);
			query.setParameter("t_UserId", userId);
			
			List<TechnologyEntity> list =query.getResultList();
			log.info("process done"+list);
			return list;
		}finally {
			entityManager.close();
		}
		
		
	}

}
