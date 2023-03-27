package com.xworkz.bag.repositary;

import org.springframework.stereotype.Repository;

import com.xworkz.bag.dto.BagDTO;

@Repository
public class BagRepositoryImp implements BagRepositary {
	
	public BagRepositoryImp() {
		System.out.println("Created"+this.getClass().getSimpleName());	
		}

	@Override
	public boolean save(BagDTO dto) {
		System.out.println("Running save method");
		return false;
	}

}
