package com.hp.helmet.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditeHelmetDTO implements Serializable {
	
	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updateDate;
	
	public AbstractAuditeHelmetDTO() {
		System.out.println("Running default Abstract Audite Helmet DTO");
	}

	public AbstractAuditeHelmetDTO(String createdBy, LocalDateTime createdDate, String updatedBy,
			LocalDateTime updateDate) {
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
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

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	
	
	
	
	
	
	
	

}
