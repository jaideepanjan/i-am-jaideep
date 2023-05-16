package com.xworkz.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.project.entity.TechnologyEntity;
import com.xworkz.project.service.TecService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class TecController {
	
	@Autowired
	private TecService service;
	
	@GetMapping("/search")
	public String search(@RequestParam String name,@RequestParam String language,@RequestParam String version,@RequestParam String owner,@RequestParam String supportFrom,@RequestParam String supportTo,@RequestParam String license,@RequestParam String openSource,@RequestParam String osType,@RequestParam String userId, Model model) {
		
		log.info("Running tecno search in tec controller");
		List<TechnologyEntity> searchList = this.service.search(name, language, version, owner, supportFrom, supportTo, license, openSource, osType, userId);
		
		model.addAttribute("tecList", searchList);
		
		return "ViewTechnolgyes";
	}

}
