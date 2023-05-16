package com.xworkz.project.service;

import java.util.List;

import com.xworkz.project.entity.TechnologyEntity;

public interface TecService {
	
	
	default List<TechnologyEntity> search(String name, String language, String version, String owner,
			String supportFrom, String supportTo, String license, String openSource,String osType,String userId) {
		return null;
	}

}
