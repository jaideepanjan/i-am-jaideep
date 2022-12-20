package com.hp.amezing.repository;

import com.hp.amezing.dto.TheaterDTO;
import com.hp.amezing.exceptions.InvalidTheaterDataException;
import com.hp.amezing.exceptions.SpaceOutOfBoundaryException;

public class TheaterRepoImpl implements TheaterRepo {
	
	private TheaterDTO[] style=new TheaterDTO[8];
	private int index=0;

	@Override
	public boolean saving(TheaterDTO dto) throws InvalidTheaterDataException {
		if(this.index>=this.style.length) {
			System.out.println("Exception is started");
			throw new InvalidTheaterDataException(); 
		}
		this.style[this.index]=dto;
		System.out.println("style : "+dto+"index "+this.index);
		index++;
		return false;
	}

}
