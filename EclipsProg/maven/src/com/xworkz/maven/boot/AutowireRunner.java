package com.xworkz.maven.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.maven.configuration.AutowireConfiguration;
import com.xworkz.maven.things.HardwareShop;
import com.xworkz.maven.things.House;
import com.xworkz.maven.things.Pencil;
import com.xworkz.maven.things.Rubber;
import com.xworkz.maven.things.Software;
import com.xworkz.maven.things.SoftwareEngineer;

public class AutowireRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(AutowireConfiguration.class);
		
		String[] total=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(total));
		HardwareShop shop=container.getBean(HardwareShop.class);
		
		System.out.println(shop);
		Software software=container.getBean(Software.class);
		System.out.println(software.toString());
		SoftwareEngineer engineer=container.getBean(SoftwareEngineer.class);
		System.out.println(engineer.toString());
		Pencil write=container.getBean(Pencil.class);
		System.out.println(write.toString());
		Rubber erase=container.getBean(Rubber.class);
		System.out.println(erase.toString());
		House home=container.getBean(House.class);
		System.out.println(home.toString());

	}

}
