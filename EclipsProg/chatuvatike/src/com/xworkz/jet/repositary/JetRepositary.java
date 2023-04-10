package com.xworkz.jet.repositary;

import com.xworkz.jet.dto.JetDTO;

public interface JetRepositary {
	
	boolean save(JetDTO dto);

	boolean isExist(JetDTO dto);
}
