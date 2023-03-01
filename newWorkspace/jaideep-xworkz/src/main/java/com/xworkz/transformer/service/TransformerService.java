package com.xworkz.transformer.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.transformer.dto.TransformerDTO;

public interface TransformerService {

	Set<ConstraintViolation<TransformerDTO>> ValidateAndSave(TransformerDTO dto);

	default TransformerDTO findById(int id) {
		return null;

	}
	
	default List<TransformerDTO> findByBrand(String brand){
		return Collections.emptyList();
	}

}
