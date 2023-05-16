package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.validation.dto.AmbulanceDTO;
import com.xworkz.validation.dto.MarriageDTO;
import com.xworkz.validation.repository.MarriageRepository;

public class MarrageServiceImpl implements MarrageService {
	
	public MarrageServiceImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	private MarriageRepository repo;
	
	public MarrageServiceImpl(MarriageRepository repository) {
		this.repo=repository;
	}

	@Override
	public boolean validateAndSave(MarriageDTO dto) {
		System.out.println("Running validate and save in MarrageServiceImpl");
		
		if(dto!=null) {
			ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
			Validator validator= factory.getValidator();
			
			Set<ConstraintViolation<MarriageDTO>> violations=validator.validate(dto);
			System.out.println(violations.size());
			
			violations.forEach(v->System.out.println(v.getPropertyPath()+" "+v.getMessage()));
			if(violations!=null && !violations.isEmpty()) {
				System.out.println("no violation in dto can save to repository");
			return this.repo.save(dto); 
					}
			}else {
				System.err.println("Dto is null");
			}
		
		return false;
	}

}
