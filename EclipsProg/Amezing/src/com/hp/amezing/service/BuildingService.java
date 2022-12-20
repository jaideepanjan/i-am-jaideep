package com.hp.amezing.service;

import com.hp.amezing.dto.BuildingDTO;
import com.hp.amezing.exceptions.InvalidBuildingDataException;

public interface BuildingService {
	
	boolean validateSaved(BuildingDTO dto) throws InvalidBuildingDataException;
	
	

}
