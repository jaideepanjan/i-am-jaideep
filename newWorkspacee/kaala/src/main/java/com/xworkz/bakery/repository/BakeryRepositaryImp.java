package com.xworkz.bakery.repository;

import com.xworkz.bakery.dto.BakeryDTO;

public class BakeryRepositaryImp implements BakeryRepositary {
	
	public BakeryRepositaryImp() {
		System.out.println("Cfeated"+this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BakeryDTO dto) {
		System.out.println("Running save method");
		
		return false;
	}

}
