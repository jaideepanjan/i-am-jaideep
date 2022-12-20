package com.hp.amezing.service;

import com.hp.amezing.dto.TheaterDTO;
import com.hp.amezing.exceptions.InvalidTheaterDataException;
import com.hp.amezing.exceptions.SpaceOutOfBoundaryException;

public interface TheaterService {
	
	boolean validateAndSave(TheaterDTO dto) throws InvalidTheaterDataException,SpaceOutOfBoundaryException;

}
