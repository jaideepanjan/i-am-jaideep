package com.hp.amezing.service;

import com.hp.amezing.dto.RailwayStationDTO;
import com.hp.amezing.exceptions.InvalidRailwayStationDataException;
import com.hp.amezing.exceptions.SpaceOutOfBoundaryException;

public interface RailwayStationService {
	boolean validateAndSave(RailwayStationDTO dto) throws InvalidRailwayStationDataException,SpaceOutOfBoundaryException;

}
