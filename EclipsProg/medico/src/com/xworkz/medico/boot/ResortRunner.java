package com.xworkz.medico.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.medico.configuration.MainConfiguration;
import com.xworkz.medico.dto.ResortDTO;
import com.xworkz.medico.repositories.ResortRepository;
import com.xworkz.medico.services.ResortService;

public class ResortRunner {

	public static void main(String[] args) {


		ApplicationContext context=new AnnotationConfigApplicationContext(MainConfiguration.class);
		ResortService resortService=context.getBean(ResortService.class);
		boolean saved=resortService.validateAndSave(new ResortDTO());
		System.out.println(saved);

	}

}
