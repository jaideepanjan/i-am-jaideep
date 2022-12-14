package com.hp.marrage.dto;

import java.time.LocalDateTime;

public class WarDTO extends AbstractAuditDTO {
	
	private String name;
	private String startedBy;
	private String startedWith;
	private LocalDateTime startedin;
	private LocalDateTime endedIn;
	private String wonBy;
	private int noOfDeaths;
	@Override
	public String toString() {
		return "WarDTO [name=" + name + ", startedBy=" + startedBy + ", startedWith=" + startedWith + ", startedin="
				+ startedin + ", endedIn=" + endedIn + ", wonBy=" + wonBy + ", noOfDeaths=" + noOfDeaths + "]";
	}
	public WarDTO(String name, String startedBy, String startedWith, LocalDateTime startedin, LocalDateTime endedIn,
			String wonBy, int noOfDeaths) {
		this.name = name;
		this.startedBy = startedBy;
		this.startedWith = startedWith;
		this.startedin = startedin;
		this.endedIn = endedIn;
		this.wonBy = wonBy;
		this.noOfDeaths = noOfDeaths;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartedBy() {
		return startedBy;
	}
	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}
	public String getStartedWith() {
		return startedWith;
	}
	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}
	public LocalDateTime getStartedin() {
		return startedin;
	}
	public void setStartedin(LocalDateTime startedin) {
		this.startedin = startedin;
	}
	public LocalDateTime getEndedIn() {
		return endedIn;
	}
	public void setEndedIn(LocalDateTime endedIn) {
		this.endedIn = endedIn;
	}
	public String getWonBy() {
		return wonBy;
	}
	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}
	public int getNoOfDeaths() {
		return noOfDeaths;
	}
	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}
	
	

}
