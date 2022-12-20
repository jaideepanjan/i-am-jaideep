package com.hp.amezing.repository;

import com.hp.amezing.dto.RailwayStationDTO;
import com.hp.amezing.exceptions.InvalidRailwayStationDataException;

public interface RailwayStationRepo {
	
	boolean saving(RailwayStationDTO dto) throws InvalidRailwayStationDataException;

}
