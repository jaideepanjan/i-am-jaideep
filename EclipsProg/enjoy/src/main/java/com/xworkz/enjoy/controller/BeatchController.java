package com.xworkz.enjoy.controller;





import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.enjoy.dto.BeachDTO;

@Component
@RequestMapping("/samudra")
public class BeatchController {
	
	public BeatchController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String santosha(BeachDTO dto,Model model) {
		
		System.out.println("Running the Santosha method "+dto);
		
		model.addAttribute("name",dto.getBeachName());
		model.addAttribute("location",dto.getLocation());
		
		
		
		return "BeachSuccess.jsp";
	}
	

}
