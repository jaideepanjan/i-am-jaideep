package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.fi.dto.InterviewDTO;

@Component
@RequestMapping("/hudde")
public class InterviewComponent {
	
	public InterviewComponent() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	
	@GetMapping
	public String enterDetails(InterviewDTO dto) {
		System.out.println("Running the enterDetails");
		System.out.println("Dto "+dto.toString());
		return "Interview.jsp";
	}

}
