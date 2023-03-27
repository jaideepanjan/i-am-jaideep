package com.xworkz.data.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {
	
	@NotNull
	@Size(min=3,max=25, message="Name must be min 3 and maximum 25 charecter")
	private String name;
	@Email(message="Give valid email")
	@Size(min=5,max=15, message="Email must be min 5 and maximum 15 charecter")
	private String emailId;
	@Size(min=5,max=15, message=" Birth cirtificate Id must be min 5 and maximum 15 charecter")
	private String birthCirtificateId;
	@Size(min=12,max=12, message="Enter valied aadhar number")
	private long aadharNo;
	@Size(min=10,max=10, message="Enter valied voter id number")
	private String voterId;	
	private String dLNo;	
	private LocalDate dateOfBirth;
	private String taxNo;
	private long MobileNo;
	private String address;
	private int id;
	
	
	

}
