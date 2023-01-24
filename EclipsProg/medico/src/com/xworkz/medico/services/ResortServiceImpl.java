package com.xworkz.medico.services;

import java.sql.Savepoint;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.medico.dto.ResortDTO;
import com.xworkz.medico.repositories.ResortRepository;

@Component
public class ResortServiceImpl implements ResortService {
	
	@Autowired
	private ResortRepository resortRepository;
	private Validator validator;
	
	
@Autowired
	public ResortServiceImpl(Validator validator) {
		super();
		this.validator = validator;
	}
	
	public void setResortRepository(ResortRepository resortRepository) {
		this.resortRepository = resortRepository;
	}



	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Validation is started");
		System.out.println("dto "+dto);
		
		Set<ConstraintViolation<ResortDTO>> violation=this.validator.validate(dto);
		if(!violation.isEmpty()) {
			System.out.println("There is error");
			violation.forEach(e -> System.err.println(e.getMessage()));
			return false;
		}
		else {
			System.out.println("There is no error");
			boolean saved=resortRepository.save(dto);
			System.out.println("Data saved "+saved);
		return false;
		}
	}

}
