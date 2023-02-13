package com.xworkz.sirima.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.xworkz.sirima.dto.BakeryDTO;
import com.xworkz.sirima.repositaryes.BekaryRepositary;

@Service
public class BekaryServiceImpl implements BekaryService {
	
	@Autowired
	private BekaryRepositary bekaryRepositary;

	
	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("Running validateAndSave");
		boolean save=this.bekaryRepositary.save(dto);
		System.out.println("saved"+save);
		return false;
	}
	

	

}
