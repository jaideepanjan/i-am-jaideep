package com.xworkz.project.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "technology_table")
public class TechnologyEntity {

	@Id
	@Column(name="t_Id")
	private int tId;

	@Column(name="t_name")
	private String name;

	@Column(name="language")
	private String language;

	@Column(name="version")
	private String version;
	@Column(name="owner")
	private String owner;
	@Column(name="supportFrom")
	private String supportFrom;
	
	@Column(name="supportTo")
	private String supportTo;
	
	@Column(name="license")
	private String license;
	@Column(name="openSource")
	private String openSource;
	@Column(name="os_Type")
	private String osType;
	
	@Column(name="createdBy")
	private String createdBy;
	
	@Column(name="createdDate")
	private LocalDateTime createdDate;
	
	@Column(name="updatedBy")
	private String updatedBy;
	
	@Column(name="updatedDate")
	private LocalDateTime updatedDate;
	
	
    
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="userId",referencedColumnName = "userId" )
	private ProjectEntity projectEntity;
	
	

}
