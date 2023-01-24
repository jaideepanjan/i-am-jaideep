package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class SoldierDTO extends AbstractAuditDTO {
	
	@NotNull
	@NotBlank
	@Size(min=3,max=30,message="name size should be minimum 3 and maximum 30 charecters")
	private String name;
	@NotNull
	@NotBlank
	@Size(min=5,max=50,message="country size should be minimum 5 and maximum 50 charecters")
	private String country;
	@Max(value =999999,message="id is invalid  it's maximum value 999999 ")
	@Min(value =1,message="id is invalid  it's minimum value 1")
	private int id;
	@Max(value =31645885,message="rank is invalid, maximum value 31645885 ")
	@Min(value =1,message="rank is invalid, minimum value 1")
	private long rank;
	@NotNull
	@NotBlank
	@Size(min=3,max=60,message="battllionName size should be minimum 3 and maximum 60 charecters")	
	private String batallionName;
	@Max(value =1200,message=" totalBatallionMembers is invalid, maximum value 1200 ")
	@Min(value =300,message="totalBatallionMembers is invalid, minimum value 300")
	private long totalBatallionMembers;

}
