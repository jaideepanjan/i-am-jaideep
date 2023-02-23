package com.xworkz.bag.service;

import java.util.Set;


import org.springframework.stereotype.Service;

import com.xworkz.bag.dto.BagDTO;


public interface BagService {
	
     	boolean validateAndSave(BagDTO dto);

}
