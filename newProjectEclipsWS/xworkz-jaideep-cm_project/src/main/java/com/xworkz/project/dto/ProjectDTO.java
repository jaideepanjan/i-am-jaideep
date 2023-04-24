package com.xworkz.project.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ProjectDTO extends AbstractAuditDTO {
	
	private int id;
	
	@Size(min=3,max=30,message="User Id must Min 3 and Max 30")
	private String userId;
	
	@Size(min=5,max=30,message="Email Id must Min 5 and Max 30")
	private String emailId;
	
	
	@NotNull(message="Number field is empty")
	private Long mobileNum;
	
	@Size(min=6,max=30,message="Password must Min 3 and Max 30")
	private String password;
	
	@NotNull
	@NotBlank
	private String confirmPassword;
	
	@NotNull
	private Boolean agreement;
	
	private int signInCount;
	
	private Boolean passwordReset;
	

}
