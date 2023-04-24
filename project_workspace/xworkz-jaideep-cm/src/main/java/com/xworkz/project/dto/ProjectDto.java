package com.xworkz.project.dto;

import java.time.LocalTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {

	@NotBlank
	@Size(min = 3, max = 30, message = "User Id cannot be greater than 30 and less than 3")
	private String userId;

	@NotBlank
	@Size(min = 3, max = 40, message = "Email cannot be greater than 40  and less than 3")
	private String email;

	@NotNull
	private Long mobileNumber;

	@NotBlank
	@Size(min = 3, max = 20, message = "Password should be less than 20 and greater than 3")
	private String password;

	@NotNull
	@NotBlank
	@Size(min = 3, max = 20, message = "confirmPassword cannot be less than 3 and greater than 20")
	private String confirmPassword;

	private boolean acceptAgreement;

	private int loginCount;

	private boolean resetPassword;
	
	private LocalTime passwordChangedTime;
	
	private String picName;

	
	

}
