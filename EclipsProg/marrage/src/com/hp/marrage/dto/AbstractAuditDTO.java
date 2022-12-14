package com.hp.marrage.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractAuditDTO implements Serializable {
	
	private String createdBy;
	private LocalDateTime createdDate;
	private String update;
	private LocalDateTime updateDate;
	
	public AbstractAuditDTO() {
		System.out.println("Running default constructer of IPL Abstract Audit DTO ");
	}

	@Override
	public String toString() {
		return "IPLAbstractAuditDTO [createdBy=" + createdBy + ", createdDate=" + createdDate + ", update=" + update
				+ ", updateDate=" + updateDate + "]";
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

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
}
