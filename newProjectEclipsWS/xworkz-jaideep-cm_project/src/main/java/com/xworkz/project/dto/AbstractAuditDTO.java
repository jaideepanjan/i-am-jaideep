package com.xworkz.project.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AbstractAuditDTO {
	
	private String createdBy;
	private LocalDateTime ctratedOn;
	private String updatedBy;
	private LocalDateTime updatedOn;

}
