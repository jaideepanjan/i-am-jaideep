package com.xworkz.jet.service;

import com.xworkz.jet.dto.JetDTO;
import com.xworkz.jet.exception.InvalidJetDataException;

public interface JetService {
	
	boolean validateAndSave(JetDTO dto) throws InvalidJetDataException;
	


}
