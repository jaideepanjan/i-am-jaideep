package com.hp.amezing.repository;

import com.hp.amezing.dto.BuildingDTO;
import com.hp.amezing.exceptions.InvalidBuildingDataException;

public class BuildingRepoImp implements BuildingRepo{
	
	
	private BuildingDTO[] ground=new BuildingDTO[10];
	private int index=0;

	@Override 
	public boolean maintance(BuildingDTO dto) throws InvalidBuildingDataException {
		if(this.index>=this.ground.length) {
			System.out.println("Exception is started");
			throw new InvalidBuildingDataException(); 
		}
		this.ground[this.index]=dto;
		System.out.println("ground : "+dto+"index "+this.index);
		index++;
		return false;
	}
	
	

}
