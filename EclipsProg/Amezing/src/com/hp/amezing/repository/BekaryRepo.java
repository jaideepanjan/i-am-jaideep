package com.hp.amezing.repository;


import com.hp.amezing.dto.BakeryDTO;
import com.hp.amezing.exceptions.InvalidBakeryDataException;


public interface BekaryRepo {
	boolean saved(BakeryDTO dto)throws InvalidBakeryDataException;

}
