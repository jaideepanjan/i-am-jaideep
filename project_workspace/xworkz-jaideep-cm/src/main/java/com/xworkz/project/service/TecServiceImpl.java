package com.xworkz.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.project.entity.ProjectEntity;
import com.xworkz.project.entity.TechnologyEntity;
import com.xworkz.project.repositary.ProjectRepo;
import com.xworkz.project.repositary.TecRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TecServiceImpl implements TecService {

	@Autowired
	private TecRepository repositary;
	
	@Autowired
	private ProjectRepo proRepo;

	@Override
	public List<TechnologyEntity> search(String name, String language, String version, String owner, String supportFrom,
			String supportTo, String license, String openSource, String osType, String userId) {
		log.info("Running search in service impl");

		ProjectEntity entity = this.proRepo.signIn(userId);
		log.info("UserId--"+userId);
		

		List<TechnologyEntity> list = repositary.search(name, language, version, owner, supportFrom, supportTo, license,
				openSource, osType, userId);
		log.info("List" + list);
		return list;
	}

}
