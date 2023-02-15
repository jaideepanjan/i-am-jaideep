package com.xworkz.muddu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.muddu.dto.EggAppDTO;
import com.xworkz.muddu.service.EggService;

@Controller
@RequestMapping("/motte")
public class EggController {
	
	
	@Autowired
	private EggService eggService;
	
	public EggController() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onOrder(EggAppDTO dto, Model model) {
		
		System.out.println("Running On order method"+dto);
		
		boolean saved=this.eggService.validateAndSave(dto);
		System.out.println(saved);
		return "index";
	}
	
	
	
	
	
	

}
