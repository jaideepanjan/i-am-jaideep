package com.hp.amezing.repository;

import com.hp.amezing.dto.RailwayStationDTO;
import com.hp.amezing.exceptions.InvalidBuildingDataException;
import com.hp.amezing.exceptions.InvalidRailwayStationDataException;

public class RailwayStatioRepoImpl implements RailwayStationRepo {

	private RailwayStationDTO[] place=new RailwayStationDTO[8];
	private int index=0;
	
	@Override
	public boolean saving(RailwayStationDTO dto) throws InvalidRailwayStationDataException {
		if(this.index>=this.place.length) {
			System.out.println("Exception is started");
		throw new InvalidRailwayStationDataException();
		}
		this.place[this.index]=dto;
		System.out.println("Place : "+dto+"index "+this.index);
		index++;
	
		return false;
	}

}
