package com.xworkz.bigbasket.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bigbasket.dto.BigBasketDTO;
import com.xworkz.bigbasket.service.BigBasketService;

@Controller
@RequestMapping("/big")
public class BigBasketController {
	
	@Autowired
	private BigBasketService basketService;
	private List<String> items = Arrays.asList("beans", "carrot", "onion", "brinjal");
	private List<String> areas = Arrays.asList("rajainagar", "jp nagar", "nandini layout", "mahalakshmi layout");

	public BigBasketController() {
		System.out.println("creating" + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onBigBasket(Model model) {
		System.out.println("this is onBigBasket get method");
		model.addAttribute("areas", areas);
		model.addAttribute("items", items);

		return "BigBasket";
	}

	@PostMapping
	public String onValentine(Model model, BigBasketDTO dto) {
		System.out.println("running on onValentine post method");
		Set<ConstraintViolation<BigBasketDTO>> violations = basketService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no volations in contoller go to success page");
			model.addAttribute("areas", areas);
			model.addAttribute("items", items);

			return "BigBasketSucess";

		}
		model.addAttribute("areas", areas);
		model.addAttribute("items", items);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);

		//System.err.println("Violation in controller");
		return "BigBasket";
	}
	
	

}
