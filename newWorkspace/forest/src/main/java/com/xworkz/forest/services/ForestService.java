package com.xworkz.forest.services;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.forest.dto.ForestDTO;

public interface ForestService {
	
	Set<ConstraintViolation<ForestDTO>>  validateAndSave(ForestDTO forestDTO);
	
	

}
