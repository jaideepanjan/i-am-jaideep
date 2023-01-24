package com.xworkz.medico.repositories;

import org.springframework.stereotype.Component;

import com.xworkz.medico.dto.ResortDTO;

@Component
public class ResortRepositoryImpl implements ResortRepository {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Data started to store");
		return true;
	}
	
	

}
