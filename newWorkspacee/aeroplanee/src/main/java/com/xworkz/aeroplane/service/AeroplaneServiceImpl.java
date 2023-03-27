package com.xworkz.aeroplane.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.entity.AeroplaneEntity;
import com.xworkz.aeroplane.repositary.AeroplaneRepositary;

@Service
public class AeroplaneServiceImpl implements AeroplaneService {

	@Autowired
	private AeroplaneRepositary repositary;

	public AeroplaneServiceImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public AeroplaneDTO findById(int id) {
		if (id > 0) {
			AeroplaneEntity entity = this.repositary.findById(id);
			if (entity != null) {
				System.out.println("entity is found in theservice for id" + id);
				AeroplaneDTO dto = new AeroplaneDTO();
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setCountry(entity.getCountry());
				dto.setType(entity.getType());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return AeroplaneService.super.findById(id);
	}

	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO aeroplaneDTO) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroplaneDTO>> constraintViolations = validator.validate(aeroplaneDTO);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations is in dto " + aeroplaneDTO);
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exist data is good " + aeroplaneDTO);
			AeroplaneEntity entity = new AeroplaneEntity();
			entity.setName(aeroplaneDTO.getName());
			entity.setCost(aeroplaneDTO.getCost());
			entity.setCompany(aeroplaneDTO.getCompany());
			entity.setType(aeroplaneDTO.getType());
			entity.setCountry(aeroplaneDTO.getCountry());

			this.repositary.save(entity);
			return Collections.emptySet();
		}

	}

}
