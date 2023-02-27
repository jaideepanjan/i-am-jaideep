package com.xworkz.transformer.controller;

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

import com.xworkz.transformer.dto.TransformerDTO;
import com.xworkz.transformer.service.TransformerService;

@Controller
@RequestMapping("/")
public class TransformerController {

	@Autowired
	private TransformerService transformerService;

	public List<String> quSt = Arrays.asList("ISI", "IEC", "IEEE");

	public TransformerController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("running the onSearch");
		TransformerDTO dto = this.transformerService.findById(id);
		System.out.println("dto:" + dto);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data Not Found Enter proper Id");
		}
		return "Search";
	}

	@GetMapping("/energy")
	public String onTransformer(Model model) {
		System.out.println("Running onTransformer get method");
		model.addAttribute("qS", quSt);
		return "Transformer";
	}

	@PostMapping("/energy")
	public String onValentine(TransformerDTO dto, Model model) {
		System.out.println("Running onValentine post method");
		Set<ConstraintViolation<TransformerDTO>> violation = transformerService.ValidateAndSave(dto);
		if (violation.isEmpty()) {
			System.out.println("no violation in controller go to Sucess Page");
			model.addAttribute("qS", quSt);
			return "Sucess";
		}
		model.addAttribute("qS", quSt);
		model.addAttribute("errors", violation);
		model.addAttribute("dto", dto);
		return "Transformer";
	}

}
