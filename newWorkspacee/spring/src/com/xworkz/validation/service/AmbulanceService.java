package com.xworkz.validation.service;

import com.xworkz.validation.dto.AmbulanceDTO;

public interface AmbulanceService {
	
	boolean validateAndSave(AmbulanceDTO dto);

}
