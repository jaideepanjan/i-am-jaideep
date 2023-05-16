package com.xworkz.validation.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.validation.dto.AmbulanceDTO;
import com.xworkz.validation.dto.PoliceStationDTO;

public class AmbulanceRepositoryImpl implements AmbulanceRepository {

	
	public AmbulanceRepositoryImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	private Collection<AmbulanceDTO> dtos= new ArrayList<>();
	
	@Override
	public boolean save(AmbulanceDTO dto) {
		System.out.println("Running save method in Repository Impl");
		return this.dtos.add(dto);
	}

}
