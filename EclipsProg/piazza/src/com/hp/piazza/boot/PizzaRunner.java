package com.hp.piazza.boot;

import java.time.LocalDateTime;

import com.hp.piazza.constant.PiazzaSize;
import com.hp.piazza.dto.PiazzaDTO;
import com.hp.piazza.repositary.PizzaRepositary;
import com.hp.piazza.repositary.PizzaRepositaryImpl;

public class PizzaRunner {

	public static void main(String[] args) {
		
		PiazzaDTO piazzaDTO=new PiazzaDTO();
		piazzaDTO.setName("Double Cheese Blust");
		piazzaDTO.setCompany("Domino's");
		piazzaDTO.setPrice(250);
		piazzaDTO.setCheese(true);
		piazzaDTO.setSize(PiazzaSize.MEDIUM);
		piazzaDTO.setFlavour("LIght Spicey");
		piazzaDTO.setType("VEG");
		
		piazzaDTO.setCreatedBy("Jaideep");
		piazzaDTO.setCreatedDate(LocalDateTime.now());
		
	    PizzaRepositary pizzaRepositary=new PizzaRepositaryImpl();
	    boolean saved=pizzaRepositary.validation(piazzaDTO);
	    System.out.println(saved);
	}

}
