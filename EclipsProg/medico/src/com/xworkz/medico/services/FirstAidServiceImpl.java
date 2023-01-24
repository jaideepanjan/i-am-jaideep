package com.xworkz.medico.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.medico.dto.FirstAidDTO;
import com.xworkz.medico.repositories.FirstAidRepositary;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class FirstAidServiceImpl implements FirstAidService {

	@Autowired
	private FirstAidRepositary firstAidRepositary;
	@Autowired
	private Validator validator;

	
	public FirstAidServiceImpl(Validator validator) {
		super();
		this.validator = validator;
	}
	
	public void setFirstAidRepositary(FirstAidRepositary firstAidRepositary) {
		this.firstAidRepositary = firstAidRepositary;
	}

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("valiodation is started");
		System.out.println("dto is : "+dto);
		
		Set<ConstraintViolation<FirstAidDTO>> violation=this.validator.validate(dto);
		
		if(!violation.isEmpty()) {
			System.out.println("there is Error");
			violation.forEach(e -> System.err.println(e.getMessage()) );
			return false;
		}
		else {
			System.out.println("There is no error");
			boolean saved=firstAidRepositary.save(dto);
			System.out.println("Dta saved "+saved);
		return saved;
		}
	}

}
