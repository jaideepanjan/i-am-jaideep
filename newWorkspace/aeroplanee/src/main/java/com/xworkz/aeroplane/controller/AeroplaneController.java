package com.xworkz.aeroplane.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.service.AeroplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {
	@Autowired
	private AeroplaneService aeroplaneService;
	private List<String> type = Arrays.asList("Get", "PISTON AIRCRAFT", "TURBOPROP AIRCRAFT", "LIGHT JETS","JUMBO JETS");
	private List<String> country = Arrays.asList("India", "America", "Londan", "UK");
	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("running the onSearch");
		AeroplaneDTO dto = this.aeroplaneService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data Not Found Enter proper Id");
		}
		return "AeroplaneSearch";
	}

	@GetMapping("/plane")
	public String onAeroplane(Model model) {
		System.out.println("this is onValentine get method");
		model.addAttribute("type", type);
		model.addAttribute("country", country);

		return "Aeroplane";
	}

	@PostMapping("/plane")
	public String onValentine(Model model, AeroplaneDTO dto) {
		System.out.println("running on onValentine post method");
		Set<ConstraintViolation<AeroplaneDTO>> violations = aeroplaneService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no volations in contoller go to success page");
			model.addAttribute("type", type);
			model.addAttribute("country", country);

			return "AeroplaneSuccess";

		}
		model.addAttribute("type", type);
		model.addAttribute("country", country);

		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);

		System.err.println("volation in controller");
		return "Aeroplane";

	}

}
