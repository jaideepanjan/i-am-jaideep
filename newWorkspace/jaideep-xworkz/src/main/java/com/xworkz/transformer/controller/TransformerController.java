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
	public List<String> brand = Arrays.asList("EVR Power", "Alstom T&D India", "Kirloskar Electric Company Limited",
			"Kotsons Pvt. Ltd", "Gujarat Transformers Pvt. Ltd.");

	public TransformerController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@GetMapping("/energy")
	public String onTransformer(Model model) {
		System.out.println("Running onTransformer get method");
		model.addAttribute("qS", quSt);
		model.addAttribute("brand", brand);
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
		model.addAttribute("brand", brand);
		model.addAttribute("errors", violation);
		model.addAttribute("dto", dto);
		return "Transformer";
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

	@GetMapping("/searchByBrand")
	public String onSearchByBrand(@RequestParam String brand, Model model) {
		System.out.println("Running onSearchByBrand in controller " + brand);
		List<TransformerDTO> list = this.transformerService.findByBrand(brand);
		model.addAttribute("list", list);
		return "SearchByBrand";
	}

	@GetMapping("/update")
	public String update(Model model, @RequestParam int id) {
		System.out.println("Running in update get method...");
		TransformerDTO dto = this.transformerService.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("qS", quSt);
		model.addAttribute("brand", brand);
		return "Update";

	}

	@PostMapping("/update")
	public String onUpdate(TransformerDTO dto, Model model) {

		System.out.println("Running on update " + dto);
		Set<ConstraintViolation<TransformerDTO>> violation = transformerService.ValidateAndUpdate(dto);
		if (violation.size() > 0) {
			model.addAttribute("errors", violation);

		} else {
			model.addAttribute("message", "Data updated sucessfully ");
		}

		return "UpdateSucess";
	}

	@GetMapping("/delete")
	public String deleteBy(Model model, @RequestParam int id) {
		System.out.println("Running in delete");
		this.transformerService.deleteById(id);
		if (id > 0) {
			System.out.println("dto in controller" + id);
			model.addAttribute("deleted", "Deleted sucessfully");
		} else {
			model.addAttribute("delete", "Delete failed ");
		}
		return "SearchByBrand";
	}

}
