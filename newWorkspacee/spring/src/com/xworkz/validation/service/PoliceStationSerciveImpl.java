package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.validation.dto.PoliceStationDTO;
import com.xworkz.validation.repository.PoliceStationRepository;

public class PoliceStationSerciveImpl implements PoliceStationService {
	
	public PoliceStationSerciveImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	private PoliceStationRepository psRepo;
	
	public PoliceStationSerciveImpl(PoliceStationRepository repository) {
		this.psRepo=repository;
	}
	

	@Override
	public boolean validateAndSave(PoliceStationDTO dto) {
		System.out.println("Running validate and save in service impl");
		
		if(dto!=null) {
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator= factory.getValidator();
		
		Set<ConstraintViolation<PoliceStationDTO>> violations=validator.validate(dto);
		System.out.println(violations.size());
		
		violations.forEach(v->System.out.println(v.getPropertyPath()+" "+v.getMessage()));
		if(violations!=null && !violations.isEmpty()) {
			System.out.println("no violation in dto can save to repository");
		return this.psRepo.save(dto); 
				}
		}else {
			System.err.println("Dto is null");
		}
		
		return false;
	}
	
	

}
