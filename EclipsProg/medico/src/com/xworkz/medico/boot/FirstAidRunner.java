package com.xworkz.medico.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.medico.configuration.MainConfiguration;
import com.xworkz.medico.dto.FirstAidDTO;
import com.xworkz.medico.services.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
		FirstAidService firstAidService = context.getBean(FirstAidService.class);

		FirstAidDTO dto = new FirstAidDTO();
		dto.setHospital("abcdehgtf");
		dto.setType("xyzse");
		dto.setPrice(5623);

		boolean saved = firstAidService.validateAndSave(dto);
		System.out.println(saved);

	}

}
