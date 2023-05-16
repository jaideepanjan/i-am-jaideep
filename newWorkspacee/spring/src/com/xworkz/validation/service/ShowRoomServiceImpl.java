package com.xworkz.validation.service;

import java.util.Collection;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.validation.dto.PoliceStationDTO;
import com.xworkz.validation.dto.ShowroomDTO;
import com.xworkz.validation.repository.ShowRoomRepository;

public class ShowRoomServiceImpl implements ShowRoomService {
	
	public ShowRoomServiceImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	private ShowRoomRepository repo;
	
	public ShowRoomServiceImpl(ShowRoomRepository repository) {
		this.repo=repository;
	}

	@Override
	public boolean validateAndSave(ShowroomDTO dto) {


		if(dto!=null) {
			
			ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
			Validator validator= factory.getValidator();
			
			Set<ConstraintViolation<ShowroomDTO>> violations=validator.validate(dto);
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
