package com.xworkz.project.repositary;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.project.entity.TechnologyEntity;

public interface TecRepository {

	default List<TechnologyEntity> search(String name, String language, String version, String owner,
			String supportFrom, String supportTo, String license, String openSource,String osType,String userId) {
		return null;
	}
	
	default TechnologyEntity getByUser(String userId) {
		return null;
	}

}
