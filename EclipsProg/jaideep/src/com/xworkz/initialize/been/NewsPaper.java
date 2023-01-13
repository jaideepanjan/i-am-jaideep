package com.xworkz.initialize.been;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	
	@Value("TI2548")
	private String id;
	private String name;
	private String ownerName;
	@Value("English")
	private String language;
	private float price;
	
	
	public NewsPaper(@Qualifier("nameOfNewsPaper") String name,@Qualifier("newsPaperOwnerName") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	
	@Value("8.5f")
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}
	
	
	
	
	

}
