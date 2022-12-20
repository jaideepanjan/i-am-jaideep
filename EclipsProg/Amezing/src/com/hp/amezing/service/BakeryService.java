package com.hp.amezing.service;

import com.hp.amezing.dto.BakeryDTO;
import com.hp.amezing.exceptions.InvalidBakeryDataException;
import com.hp.amezing.exceptions.SpaceOutOfBoundaryException;

public interface BakeryService {
	boolean validateAndSave(BakeryDTO dto) throws InvalidBakeryDataException,SpaceOutOfBoundaryException;

}
