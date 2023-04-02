package com.xworkz.project.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto{
	
	
//	private int id;
	@Size(min=3, max=30, message="User Id cannot be less than 3 and greater than 30")
	private String userId;

	@Size(min=3, max=40, message="Email cannot be less than 3 and greater than 40")
	private String email;
	
//	@Max(value = 11 , message="Moblie Number must contain 10 digits")
//	@Min(value = 9,  message="Moblie Number must contain 10 digits")
	private Long mobileNumber;
	
	@Size(min=3, max=20, message="Password should be less than 20 and greater than 3")
	private String password;
	
	@Size(min=3, max=20, message="confirmPassword cannot be less than 3 and greater than 20")
	private String confirmPassword;
	
	private boolean acceptAgreement;
	
	

}
