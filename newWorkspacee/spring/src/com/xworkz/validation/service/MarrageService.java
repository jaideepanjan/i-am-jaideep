package com.xworkz.validation.service;

import com.xworkz.validation.dto.AmbulanceDTO;
import com.xworkz.validation.dto.MarriageDTO;

public interface MarrageService {
	
	boolean validateAndSave(MarriageDTO dto);

}
