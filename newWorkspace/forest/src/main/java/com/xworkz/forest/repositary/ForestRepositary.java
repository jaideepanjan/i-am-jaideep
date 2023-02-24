package com.xworkz.forest.repositary;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.forest.dto.ForestDTO;

public interface ForestRepositary {
	
	Set<ConstraintViolation<ForestDTO>> save(ForestDTO forestDTO);
	

}
