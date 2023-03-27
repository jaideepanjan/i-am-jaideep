package com.xworkz.bigbasket.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.bigbasket.dto.BigBasketDTO;

public interface BigBasketService {
	
	Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO dto);

}
