package com.xworkz.validation.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.validation.dto.MarriageDTO;
import com.xworkz.validation.dto.PoliceStationDTO;

public class MarriageRepositoryImpl implements MarriageRepository {

	public MarriageRepositoryImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	private Collection<MarriageDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(MarriageDTO dto) {
		System.out.println("Running save method in marrage repositary impl");
		return this.dtos.add(dto);
	}

}
