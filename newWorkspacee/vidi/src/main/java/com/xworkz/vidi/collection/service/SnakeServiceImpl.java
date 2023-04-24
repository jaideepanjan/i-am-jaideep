package com.xworkz.vidi.collection.service;

import com.xworkz.vidi.collection.dto.SnakeDTO;
import com.xworkz.vidi.collection.repository.SnakeRepo;

public class SnakeServiceImpl implements SnakeService {
	
	
	private SnakeRepo snakeRepo;
	
	public SnakeServiceImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(SnakeDTO dto) {

if(dto!=null) {
	return snakeRepo.save(dto);
}
		
		return false;
	}
	
	
	

}
