package com.xworkz.medico.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.medico.configuration.MainConfiguration;
import com.xworkz.medico.dto.MissileDTO;
import com.xworkz.medico.services.MissileService;

public class MissileRunner {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MainConfiguration.class);
		MissileService missileService=context.getBean(MissileService.class);
		boolean saved =missileService.validateAndSave(new MissileDTO());
		System.out.println(saved);
	}

}
