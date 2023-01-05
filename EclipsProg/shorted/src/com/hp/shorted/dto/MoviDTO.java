package com.hp.shorted.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MoviDTO implements Serializable{
	
	private String name;
	private double budget;
	private String language;
	private double profit;
	private LocalDateTime releaseDate;
	
	public MoviDTO() {
		// TODO Auto-generated constructor stub
	}

	public MoviDTO(String name, double budget, String language, double profit, LocalDateTime releaseDate) {
		super();
		this.name = name;
		this.budget = budget;
		this.language = language;
		this.profit = profit;
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "MoviDTO [name=" + name + ", budget=" + budget + ", language=" + language + ", profit=" + profit
				+ ", releaseDate=" + releaseDate + ", toString()=" + super.toString() + "]";
	}
	
	 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	 
	 @Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof MoviDTO) {
				MoviDTO dto=(MoviDTO)obj;
				if
			}
		}
		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public LocalDateTime getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDateTime releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	

}
