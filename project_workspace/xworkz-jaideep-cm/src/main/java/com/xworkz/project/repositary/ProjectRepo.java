package com.xworkz.project.repositary;

import java.util.Collections;
import java.util.List;

import com.xworkz.project.dto.ProjectDto;
import com.xworkz.project.entity.ProjectEntity;

public interface ProjectRepo {

	boolean save(ProjectEntity entity);

	default List<ProjectEntity> findAll() {
		return Collections.emptyList();
	}

	default Long findByUserId(String userId) {
		return null;
	}

	default Long findByEmail(String email) {
		return null;
	}

	default Long findByMobile(Long number) {
		return null;
	}

	default ProjectEntity signIn(String userId, String password) {
		return null;
	}
	
	default ProjectEntity reSetPassword(String email) {
		return null;
	}
	
	boolean update(ProjectEntity entity);
	
	boolean updatePassword(String userId, String password,Boolean resetPassword);

	boolean loginCount(String userId,int count);
}
