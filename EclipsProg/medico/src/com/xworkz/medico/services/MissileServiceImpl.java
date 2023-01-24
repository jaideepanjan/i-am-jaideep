package com.xworkz.medico.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.medico.dto.MissileDTO;
import com.xworkz.medico.repositories.MissileRepositary;

import lombok.ToString;

@Component
public class MissileServiceImpl implements MissileService {

	@Autowired
	private MissileRepositary missileRepositary;
	private Validator validator;

	public MissileServiceImpl(Validator validator) {
		super();
		this.validator = validator;
	}

	public void setMissileRepositary(MissileRepositary missileRepositary) {
		this.missileRepositary = missileRepositary;
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("Data validation Started ");
		System.out.println("DTO " + dto);

		Set<ConstraintViolation<MissileDTO>> violation = this.validator.validate(dto);
		if (!violation.isEmpty()) {
			System.out.println("there is error");
			violation.forEach(e -> System.err.println(e.getMessage()));
			return false;			
		}
		else {
			System.out.println("There is no error");
			boolean saved=missileRepositary.save(dto);
			System.out.println("Data saved "+saved);
		return true;
		}
	}
}
