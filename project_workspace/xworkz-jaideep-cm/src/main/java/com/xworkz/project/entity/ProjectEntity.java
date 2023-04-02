package com.xworkz.project.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="signup_table")
public class ProjectEntity {
	

	@Id
	@Column(name="signUpId")
	private int signUpId;	
	
	@Column(name="userId")
	private String userId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobile")
	private long mobileNumber;
	
	@Column(name="password")
	private String password;
	
	@Column(name="createdBy")
	private String createdBy;
	
	@Column(name="createdDate")
	private LocalDateTime createdDate;
	
	@Column(name="updatedBy")
	private String updatedBy;
	
	@Column(name="updatedDate")
	private LocalDateTime updatedDate;

}
