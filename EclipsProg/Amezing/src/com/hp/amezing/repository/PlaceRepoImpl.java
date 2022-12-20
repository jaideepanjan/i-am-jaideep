package com.hp.amezing.repository;

import com.hp.amezing.dto.PlaceDTO;
import com.hp.amezing.exceptions.InvalidPlaceDataException;

public class PlaceRepoImpl implements PlaceRepo  {
	
	private PlaceDTO[] payana=new PlaceDTO[10];
	private int index=0;

	@Override
	public boolean saving(PlaceDTO dto) throws InvalidPlaceDataException {
		if(this.index>=this.payana.length) {
			System.out.println("Exception is started");
			throw new InvalidPlaceDataException();
		}
		this.payana[this.index]=dto;
		System.out.println("Payana : "+dto+" index "+this.index);
		index++;
		return false;
	}

}
