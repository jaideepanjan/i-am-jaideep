package com.xworkz.validation.service;

import com.xworkz.validation.dto.AmbulanceDTO;
import com.xworkz.validation.dto.ShowroomDTO;

public interface ShowRoomService {
	boolean validateAndSave(ShowroomDTO dto);

}
