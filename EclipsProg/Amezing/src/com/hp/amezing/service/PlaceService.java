package com.hp.amezing.service;

import com.hp.amezing.dto.PlaceDTO;
import com.hp.amezing.exceptions.InvalidPlaceDataException;
import com.hp.amezing.exceptions.SpaceOutOfBoundaryException;

public interface PlaceService {
	boolean validateAndSave(PlaceDTO dto) throws InvalidPlaceDataException,SpaceOutOfBoundaryException;

}
