package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/bojanam")
public class FoodItemsComponent {
	
	public FoodItemsComponent() {
		System.out.println("Created" +this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String send(@RequestParam String foodName,@RequestParam String type,@RequestParam int quantity,@RequestParam Double price) {
	
		
		System.out.println("Created send method");
		System.out.println("Fooditem name : "+foodName);
		System.out.println("Fooditem type : "+type);
		System.out.println("Fooditem quantity : "+quantity);
		System.out.println("Fooditem Price : "+price);
		return "fooditem.jsp";
	}

}
