package com.hp.amezing.repository;

import com.hp.amezing.dto.PlaceDTO;
import com.hp.amezing.exceptions.InvalidPlaceDataException;

public interface PlaceRepo {
	
	boolean saving(PlaceDTO dto) throws InvalidPlaceDataException;
}
