package com.xworkz.transformer.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.transformer.dto.TransformerDTO;
import com.xworkz.transformer.entity.TransformerEntity;

public interface TransformerService {

	Set<ConstraintViolation<TransformerDTO>> ValidateAndSave(TransformerDTO dto);

	Set<ConstraintViolation<TransformerDTO>> ValidateAndUpdate(TransformerDTO dto);

	default TransformerDTO findById(int id) {
		return null;

	}

	default List<TransformerDTO> findByBrand(String brand) {
		return Collections.emptyList();
	}

	boolean deleteById(int id);

	default List<TransformerDTO> displayAll(){
		return Collections.emptyList();
	}
	
	default List<TransformerDTO> searchByTwo(String qualityStandards,String typeOfCooling){
		return Collections.emptyList();
	}

}
