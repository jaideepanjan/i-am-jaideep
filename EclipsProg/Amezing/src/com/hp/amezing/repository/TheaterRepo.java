package com.hp.amezing.repository;

import com.hp.amezing.dto.TheaterDTO;
import com.hp.amezing.exceptions.InvalidTheaterDataException;

public interface TheaterRepo {
	
	boolean saving(TheaterDTO dto)throws InvalidTheaterDataException;

}
