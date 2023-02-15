package com.xworkz.muddu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.muddu.dto.EggAppDTO;
import com.xworkz.muddu.repositary.EggRepository;


@Service
public class EggServiceImp implements EggService {
	
	@Autowired
	private EggRepository eggRepository;
	
	public EggServiceImp() {
		System.out.println("Running EggServiceImp");
	}

	@Override
	public boolean validateAndSave(EggAppDTO dto) {
		System.out.println("Running validate and save in service "+dto);
		
		boolean saved=this.eggRepository.save(dto);
		System.out.println("Saved "+saved);
		return saved;
	}

}
