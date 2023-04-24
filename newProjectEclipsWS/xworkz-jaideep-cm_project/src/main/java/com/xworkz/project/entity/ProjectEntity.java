package com.xworkz.project.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "project_table")
public class ProjectEntity {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "mobile_no")
	private Long mobileNum;
	
	@Column(name = "password")
	private String password;

	@Column(name = "agrement")
	private boolean agreement;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_on")
	private LocalDateTime createdOn;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "update_on")
	private LocalDateTime updatedOn;

	@Column(name = "signIn_count")
	private int signInCount;
	
	@Column(name = "reset_password")
	private boolean passwordReset;

}
