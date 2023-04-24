package com.xworkz.vidi.collection.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.vidi.collection.dto.SnakeDTO;
import com.xworkz.vidi.collection.service.SnakeService;

public class SnakeRepoImpl implements SnakeRepo {
	
	private SnakeService snakeService;

	private Collection<SnakeDTO> snakeDTOs;

	public SnakeRepoImpl(Collection<SnakeDTO> snakeDTOs) {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(SnakeDTO snDTO) {
	boolean	 repo=this.snakeService.validateAndSave(snDTO);
	
	
	
	
		return false;
	}
	
	

}
