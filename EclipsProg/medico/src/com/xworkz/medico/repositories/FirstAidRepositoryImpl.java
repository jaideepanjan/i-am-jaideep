package com.xworkz.medico.repositories;

import org.springframework.stereotype.Component;

import com.xworkz.medico.dto.FirstAidDTO;


@Component
public class FirstAidRepositoryImpl implements FirstAidRepositary {

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("Data starting to save");
		return true;
	}

}
