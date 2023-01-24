package com.xworkz.soldier.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dao.SoldierDAO;
import com.xworkz.soldier.dto.SoldierDTO;

import io.quarkus.hibernate.validator.runtime.jaxrs.QuarkusRestViolationExceptionMapper.ViolationReport.Violation;

public class SoldierServiceImp implements SoldierService {
	
	private SoldierDAO soldierDAO;
	
	public SoldierServiceImp() {
		System.out.println("Running the SoldierServiceImp no-argument constructor");
	}
	

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("datas of dto = "+dto);
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations=validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.out.println("errors are in the dto");
			violations.forEach(e->System.out.println(e.getMessage()));
			return false;
		}else {
			System.out.println("no errors in the dto");
			boolean save =soldierDAO.save(dto);
			System.out.println("after validating the dto in repositary"+save);
		return save;
		}
		
				
	}


	public void setSoldierDAO(SoldierDAO soldierDAO) {
		this.soldierDAO = soldierDAO;
	}
}
