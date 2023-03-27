package com.xworkz.valentin.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/preeti")
public class ValentineController {
	
	public ValentineController() {
		System.out.println("Created"+this.getClass().getSimpleName());
		}
	
	@GetMapping
	public String onValentain(Model model) {
		System.out.println("Running onValentain get method ");
		
		List<String> places=Arrays.asList("Cofee Day","Temple","Park","Mall");
		
		List<String> gifts=Arrays.asList("Chocolet","Teddybear","Ring","Dress","Mobile");
		
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		
		return "valentine";
	}

}
