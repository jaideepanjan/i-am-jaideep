package com.xworkz.validation.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.validation.dto.PoliceStationDTO;
import com.xworkz.validation.dto.ShowroomDTO;

public class ShowRoomRepositoryImpl implements ShowRoomRepository {
	
	
	public ShowRoomRepositoryImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	private Collection<ShowroomDTO> dtos= new ArrayList<>();

	@Override
	public boolean save(ShowroomDTO dto) {
		System.out.println("Running save method in repo impl");
		return this.dtos.add(dto);
	}
	
	

}
