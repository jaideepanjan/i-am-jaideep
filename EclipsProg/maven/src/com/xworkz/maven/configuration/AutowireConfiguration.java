package com.xworkz.maven.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.maven")
public class AutowireConfiguration {
	
	public AutowireConfiguration() {
		System.out.println("Running default constructor of autowireConfiguration");
	}
	
	
	@Bean
	public int id() {
		return 777;
	}
	
	@Bean
	public String nameOfHardwareShop() {
		return "smms Hardware";
	}
	
	@Bean
	public long gstNo() {
		return 235489617;
	} 
	
	@Bean
	public String address() {
		return "rajajinagar Bangloor";
	}
	
	@Bean
	public String ownerName() {
		return "Jaideep";
	}
	
	@Bean
	public String softwareName() {
		return "Shadi.com";
	}
	@Bean
	public float version() {
		return 5.4f;
	}
	
	@Bean
	public String devloper() {
		return "Anoop Mittal";
	}
	
	@Bean
	public LocalDate date()
	{
		return LocalDate.now();
	}
	@Bean
	public boolean free() {
		return true;
	}
	
	@Bean
	public String softwareEngineearName() {
		return "Karthik";
	}
	
	@Bean
	public double salary() {
		return 5.8;
	}
	
	@Bean
	public String companyName() {
		return "infosys";		
	}
	
	@Bean
	public int experience() {
		return 3;
	}
	@Bean
	public String pencilName() {
		return "Apsara";
	}
	
	@Bean
	public String typeOfPencil() {
		return "2b";
	}
	
	@Bean
	public String colourOfPencil() {
		return "green";
	}
	
	@Bean
	public float priceOfPencil() {
		return 5.6f;
	}
	
	@Bean
	public boolean isPencilSharp() {
		return true;
	}
	@Bean
	public boolean isPencilStolen() {
		return false;
	}
	
	@Bean
	public String rubberName() {
		return "Nataraja";
	}
	
	@Bean
	public String rubberType() {
		return "writing";
	}
	@Bean
	public String rubberColour() {
		return "orange";
	}
	@Bean
	public float rubberPrice() {
		return 3.5f;
	}
	@Bean
	public String shape() {
		return "rectangle";
	}
	@Bean
	public boolean isRubberStolen() {
		return false;
	}
	
	@Bean
	public char rubberSize() {
		return 'M';
	}
	
	@Bean
	public String houseName() {
		return "Shree Mahadeva";
	}
	@Bean
	public int noOfFloures() {
		return 5;
	}
	
	@Bean
	public String style() {
		return "american";
	}
	 
	@Bean
	public int siteNo() {
		return 77;
	}
	@Bean
	public String nameOfOwner() {
		return "Puttaswamy";
	}
	@Bean
	public boolean isGardan() {
		return true;
	}
	@Bean
	public boolean isOpenkitchen() {
		return true;
	}
	@Bean
	public int noOfRooms() {
		return 8;
	}
	@Bean
	public boolean isParkingSpace() {
		return true;		
	}
	

}
