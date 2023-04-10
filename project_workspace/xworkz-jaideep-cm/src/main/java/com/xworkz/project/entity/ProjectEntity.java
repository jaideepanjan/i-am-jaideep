package com.xworkz.project.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="signup_table")
@NamedQuery(name="findAll",query="select ent from ProjectEntity ent")
@NamedQuery(name="findByUserId",query="select count(*) from ProjectEntity ent where ent.userId=:userBy")
@NamedQuery(name="findByEmail",query="select count(*) from ProjectEntity ent where ent.email=:emailBy")
@NamedQuery(name="findByMobile",query="select count(*) from ProjectEntity ent where ent.mobileNumber=:mobileBy")
@NamedQuery(name="findByUserIdAndPassword",query="select ent from ProjectEntity ent where ent.userId=:uId and ent.password=:pswd")
@NamedQuery(name="email",query = "select ent from ProjectEntity ent where ent.email=:id")

@NamedQuery(name="updateLoginCount",query = "update ProjectEntity ent set ent.loginCount=:count where ent.userId=:userID" )
@NamedQuery(name="updatePassword",query = "update ProjectEntity ent set ent.password=:up , ent.resetPassword=:urp where ent.userId=:uu" )


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
	
	@Column(name="agrement")
	private boolean acceptAgreement;
	
	@Column(name="createdBy")
	private String createdBy;
	
	@Column(name="createdDate")
	private LocalDateTime createdDate;
	
	@Column(name="updatedBy")
	private String updatedBy;
	
	@Column(name="updatedDate")
	private LocalDateTime updatedDate;
	
	@Column(name = "loginCount")
    private int loginCount;
	
	@Column(name = "resetPassword")
	private Boolean resetPassword;

}
