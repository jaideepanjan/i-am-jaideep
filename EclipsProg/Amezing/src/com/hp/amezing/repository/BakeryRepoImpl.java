package com.hp.amezing.repository;

import com.hp.amezing.dto.BakeryDTO;
import com.hp.amezing.exceptions.InvalidBakeryDataException;

public class BakeryRepoImpl implements BekaryRepo  {
	
	private BakeryDTO[] dtos =new BakeryDTO[4];
	private int index=0;
	

	@Override
	public boolean saved(BakeryDTO dto) throws InvalidBakeryDataException {
		System.out.println("Checking the repositary condition");
		if(this.index>=this.dtos.length) {
			System.err.println("Exception is Initiated");
			throw new InvalidBakeryDataException();
		}
		dtos[index]=dto;
		index++;
		return false;
	}

}
