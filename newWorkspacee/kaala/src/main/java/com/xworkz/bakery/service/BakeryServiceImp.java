package com.xworkz.bakery.service;

import com.xworkz.bakery.dto.BakeryDTO;

public class BakeryServiceImp implements BakeryService {
	
	public BakeryServiceImp() {
	System.out.println("Created"+this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("Running validateAndSave method");
		
		return false;
	}

	

	
	

}
