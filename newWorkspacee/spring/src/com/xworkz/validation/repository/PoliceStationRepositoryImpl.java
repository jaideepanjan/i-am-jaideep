package com.xworkz.validation.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.validation.dto.PoliceStationDTO;
import com.xworkz.validation.service.PoliceStationService;

public class PoliceStationRepositoryImpl implements PoliceStationRepository {
	
 
	private Collection<PoliceStationDTO> psDTo= new ArrayList<>();
	
	public PoliceStationRepositoryImpl() {
		System.out.println("Created"+getClass().getSimpleName());
	}

	@Override
	public boolean save(PoliceStationDTO dto) {
		System.out.println("Running save method inPoliceStation Service implimentation");
		return this.psDTo.add(dto);
	}
	
	

}
