package com.xworkz.medico.repositories;

import org.springframework.stereotype.Component;

import com.xworkz.medico.dto.MissileDTO;

@Component
public class MissileRepositoryImpl implements MissileRepositary {

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("Data started to store");
		return false;
	}

}
