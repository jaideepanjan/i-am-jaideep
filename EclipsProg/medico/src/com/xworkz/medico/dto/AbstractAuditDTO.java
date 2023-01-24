package com.xworkz.medico.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.ToString;

@ToString
public abstract class AbstractAuditDTO implements Serializable {
	
	private String createdBy;
	private LocalDate createdOn;
	private String updatedBy;
	private LocalDate updateBy;

}
