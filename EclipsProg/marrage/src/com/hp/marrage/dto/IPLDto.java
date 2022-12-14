package com.hp.marrage.dto;

public class IPLDto extends AbstractAuditDTO {
	
	private String teamName;
	private String ownerName;
	private String from;
	private int noOfMem;
	private String dressColour;
	private int noOfTrofies;
	private int noOfWins;
	private int noOfDefeats;
	
	
	@Override
	public String toString() {
		return "IPLDto [teamName=" + teamName + ", ownerName=" + ownerName + ", from=" + from + ", noOfMem=" + noOfMem
				+ ", dressColour=" + dressColour + ", noOfTrofies=" + noOfTrofies + ", noOfWins=" + noOfWins
				+ ", noOfDefeats=" + noOfDefeats + "]";
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public int getNoOfMem() {
		return noOfMem;
	}


	public void setNoOfMem(int noOfMem) {
		this.noOfMem = noOfMem;
	}


	public String getDressColour() {
		return dressColour;
	}


	public void setDressColour(String dressColour) {
		this.dressColour = dressColour;
	}


	public int getNoOfTrofies() {
		return noOfTrofies;
	}


	public void setNoOfTrofies(int noOfTrofies) {
		this.noOfTrofies = noOfTrofies;
	}


	public int getNoOfWins() {
		return noOfWins;
	}


	public void setNoOfWins(int noOfWins) {
		this.noOfWins = noOfWins;
	}


	public int getNoOfDefeats() {
		return noOfDefeats;
	}


	public void setNoOfDefeats(int noOfDefeats) {
		this.noOfDefeats = noOfDefeats;
	}
	
	
	
	 

}
