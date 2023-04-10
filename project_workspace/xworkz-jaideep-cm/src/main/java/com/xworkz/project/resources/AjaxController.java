package com.xworkz.project.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.project.service.ProjectService;

import lombok.extern.slf4j.Slf4j;

@EnableWebMvc
@RestController
@Slf4j
@RequestMapping("/")
public class AjaxController {
	
	@Autowired
	private ProjectService projectService;
	
	public AjaxController() {
		log.info("Created"+this.getClass().getSimpleName());
	}
	
	
	
	@GetMapping(value="/userId/{user}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String onUserId(@PathVariable String userId) {
		Long user=this.projectService.findByUserId(userId);
		System.out.println(user);
		
		if(user==0) {
			System.err.println("Running in equals condition");
			return "";
		}
		else {
			return"UserId is exist"; 
		}
	}
	
	
	@GetMapping(value="/email/{email}",produces = MediaType.APPLICATION_JSON_VALUE)
	public String onEmail(@PathVariable String mail) {
		Long email=this.projectService.findByEmail(mail);
		System.err.println(email);
		
		if(email==0) {
			System.out.println("Running in equals condition");
			return "";
			
		}else {
			return "Email id is exist";
		}
	}
	
	
	@GetMapping(value="/mobileNum/{mobile}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String onMobileNum(@PathVariable Long mobileNum) {
		Long mobileNumb=this.projectService.findByMobile(mobileNum);
		System.out.println(mobileNumb);
		
		if(mobileNumb==0) {
			System.err.println("Running in equals condition");
			return "";
		}
		else {
			return"MobileNumber is exist"; 
		}
	}
	
	@GetMapping(value = "/reEmail/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String reEmail(@PathVariable String email) {
		Long dbEmail = this.projectService.findByEmail(email);
		System.err.println(dbEmail);

		if (dbEmail == 0) {
			System.err.println("Running in equals condition");
			return "Please enter Existing email";
		} else {
			return "  ";
		}
	}
	
	
}
