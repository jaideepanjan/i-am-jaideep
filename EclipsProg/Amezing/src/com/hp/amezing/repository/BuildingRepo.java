package com.hp.amezing.repository;

import com.hp.amezing.dto.BuildingDTO;
import com.hp.amezing.exceptions.InvalidBuildingDataException;

public interface BuildingRepo {
	
	boolean maintance(BuildingDTO dto) throws InvalidBuildingDataException;

}
