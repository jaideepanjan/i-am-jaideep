package com.xworkz.enjoy.controller;



import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.enjoy.dto.CasinoDTO;

@Component
@RequestMapping("/happy")
public class CasinoController {
	
	public CasinoController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
  
	@GetMapping
	public String welcome(CasinoDTO dto,Model model) {
		System.out.println("Running the welcome method "+dto);
		model.addAttribute("name",dto.getCasinoName());
		model.addAttribute("crusie",dto.getCruiseName());
		model.addAttribute("entryFee",dto.getEntryFee());
		return "CasinoSuccess.jsp";
	}

}
