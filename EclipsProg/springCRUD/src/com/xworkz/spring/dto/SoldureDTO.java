package com.xworkz.spring.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class SoldureDTO {
	
	@NonNull
	@NotNull
	@Size(min=2,max=20,message="name is not acceptable")
	private String name;
	
	@Max(value=60,message="age is not acceptable")
	@Min(value=18,message="age is not acceptable")
	private int age;
	
	@NonNull
	@NotNull
	@Size(min=4,max=20,message="not acceptable")
	private String from;
	@Max(value=9999999,message="id is out of list")
	@Min(value=1,message="id is out of list")
	private long idNumber;
	@NonNull
	@NotNull
	@Size(min=4,max=20,message="team name is not acceptable")
	private String teamName;
	
	
	
	

}
