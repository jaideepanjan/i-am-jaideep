package com.hp.piazza.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditPizza implements Serializable {
	
	private String createdBy;
	private LocalDateTime createdDate;
	private String updateBy;
	private LocalDateTime updateDate;
	
	public AbstractAuditPizza() {
		super();
		System.out.println("Calling default Constructer");
	}

	public AbstractAuditPizza(String createdBy, LocalDateTime createdDate, String updateBy, LocalDateTime updateDate) {
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	
}
