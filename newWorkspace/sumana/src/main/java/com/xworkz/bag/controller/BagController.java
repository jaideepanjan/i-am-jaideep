package com.xworkz.bag.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bag.dto.BagDTO;

@Controller
@RequestMapping("/bag")
public class BagController {
	
	public BagController() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String onBag(Model model) {
		List<String> brand=Arrays.asList("Globus","SkayBags","American Turist");
		
		List<String> type=Arrays.asList("Hand Bag","Carry Bag","Kit Bag");
		
		model.addAttribute("brand", brand);
		model.addAttribute("type", type);
		return "/onBag";
	}
	
	@PostMapping
	public String onBag(BagDTO dto,Model model) {
		System.out.println("Running onBag method");
		
		
		
		System.out.println(dto);
		model.addAttribute("bag", dto);
		
		return "Sucess.jsp";
			
		
	}
	
	
	
	
		
		
	
	

}
