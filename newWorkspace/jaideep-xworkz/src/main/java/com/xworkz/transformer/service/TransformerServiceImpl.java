package com.xworkz.transformer.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.transformer.dto.TransformerDTO;
import com.xworkz.transformer.entity.TransformerEntity;
import com.xworkz.transformer.repositary.TransformerRepositry;

@Service
public class TransformerServiceImpl implements TransformerService {

	@Autowired
	private TransformerRepositry repositry;

	public TransformerServiceImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public TransformerDTO findById(int id) {
		if (id > 0) {
			TransformerEntity entity = this.repositry.findById(id);

			if (entity != null) {
				System.out.println("entity is found in theservice for id" + id);
				TransformerDTO dto = new TransformerDTO();
				dto.setType(entity.getType());
				dto.setPhases(entity.getPhase());
				dto.setQualityStandards(entity.getQualityStandards());
				dto.setCoilType(entity.getCoilType());
				dto.setKva(entity.getKva());
				dto.setWeight(entity.getWeight());
				dto.setTypeOfCooling(entity.getTypeOfCooling());
				dto.setCost(entity.getCost());

				return dto;
			}
		}
		return TransformerService.super.findById(id);
	}

	@Override
	public Set<ConstraintViolation<TransformerDTO>> ValidateAndSave(TransformerDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TransformerDTO>> constraintViolations = validator.validate(dto);

		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.out.println("constraintViolations in dto " + dto);
			return constraintViolations;
		} else {
			System.out.println("constraintViolations does not exist data is good " + dto);

			TransformerEntity entity = new TransformerEntity();

			entity.setPhase(dto.getPhases());
			entity.setQualityStandards(dto.getQualityStandards());
			entity.setCoilType(dto.getCoilType());
			entity.setKva(dto.getKva());
			entity.setWeight(dto.getWeight());
			entity.setTypeOfCooling(dto.getTypeOfCooling());
			entity.setType(dto.getType());
			entity.setCost(dto.getCost());

			this.repositry.save(entity);

			return Collections.emptySet();
		}

	}

}
