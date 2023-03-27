package com.xworkz.data.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="person_details")
public class PersonEntity {
	
	@Id
	@Column(name="p_id")
	private int id;
	@Column(name="p_name")
	private String name;
	@Column(name="p_email_id")
	private String emailId;	
	@Column(name="p_email_id")
	private String birthCirtificateId;
	@Column(name="p_aadhar_no")	
	private long aadharNo;
	@Column(name="p_voter_id")	
	private String voterId;	
	@Column(name="p_voter_id")
	private String dLNo;
	@Column(name="p_d_o_b")
	private LocalDate dateOfBirth;
	@Column(name="p_tax_no")
	private String taxNo;
	@Column(name="p_mobile_no")
	private long MobileNo;
	@Column(name="p_address")
	private String address;
	

}
