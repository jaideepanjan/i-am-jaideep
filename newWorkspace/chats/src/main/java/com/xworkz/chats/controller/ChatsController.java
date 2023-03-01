package com.xworkz.chats.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintViolation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ChatsController {
	
	List<String> chats=Arrays.asList("Panipurui","Panipurui","Gobi","Fride Rice","Noodles","Samosa","French Fries");
	List<String> tOh=Arrays.asList("Spot","Take away");
	List<String> mOp=Arrays.asList("Cash","Online Pay");
	
	public ChatsController() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	

}
