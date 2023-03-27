package com.xworkz.bag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.cj.xdevapi.Schema.Validation;
import com.xworkz.bag.dto.BagDTO;
import com.xworkz.bag.repositary.BagRepositoryImp;


@Service
public class BagServiceImpl implements BagService {
	
	@Autowired
	private BagRepositoryImp bagRepositoryImp;
	
	public BagServiceImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BagDTO dto) {
		System.out.println("Running validateAndSave method");
		boolean saved=this.bagRepositoryImp.save(dto);
	 
		return saved;
	}

}
