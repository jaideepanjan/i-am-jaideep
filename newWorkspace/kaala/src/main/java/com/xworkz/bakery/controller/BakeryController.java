package com.xworkz.bakery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;

@Controller
@RequestMapping("/bakery")
public class BakeryController {
	
	public BakeryController() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBake(BakeryDTO dto,Model model) {
		
		System.out.println("Running on Bake method");	
		
		System.out.println(dto);
		model.addAttribute("bakery",dto);
	
		return "index.jsp";
	}
	
	

}
