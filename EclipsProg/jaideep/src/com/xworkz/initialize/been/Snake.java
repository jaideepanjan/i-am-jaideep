package com.xworkz.initialize.been;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	
	private String name;
	@Value("12.8")
	private double length;
	@Value("Yellow")
	private String colour;
	private String type;
	private boolean poisioness;
	
	
	public Snake(@Qualifier("snakeName") String name,@Qualifier("snakeType") String type,@Qualifier("isPoisionousSnake") boolean poisioness) {
		super();
		this.name = name;
		this.type = type;
		this.poisioness = poisioness;
	}


	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", colour=" + colour + ", type=" + type + ", poisioness="
				+ poisioness + "]";
	}
	
	
	
	

}
