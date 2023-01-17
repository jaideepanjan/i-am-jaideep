package com.xworkz.spring.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.spring.dto.SoldureDTO;

public class SoldureServiceImp implements SoldureService {

	@Override
	public boolean soldure(SoldureDTO dto) {
		System.out.println("Running the soldure test");
		System.out.println("DTO accessed are = "+dto);
		
		ValidatorFactory factory=new Validation().buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoldureDTO>> violations=validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.out.println("error present in the dto datas");
			violations.forEach(e->System.out.println(e.getMessage()));
			return false;			
		}
		else {
			System.out.println("there are no errors in the dto data all are matched the validation requirements");
		return false;
		}
		
		
		
	}

}
