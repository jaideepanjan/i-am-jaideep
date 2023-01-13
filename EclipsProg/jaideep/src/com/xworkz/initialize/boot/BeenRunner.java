package com.xworkz.initialize.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.initialize.been.Engine;
import com.xworkz.initialize.been.Gost;
import com.xworkz.initialize.been.NewsPaper;
import com.xworkz.initialize.been.Snake;
import com.xworkz.initialize.configuration.BeenConfiguration;

public class BeenRunner {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(BeenConfiguration.class);
		
		
		NewsPaper ref1=context.getBean(NewsPaper.class);
		System.out.println(ref1);
		Engine ref2=context.getBean(Engine.class);
		System.out.println(ref2);
		Snake ref3=context.getBean(Snake.class);
		System.out.println(ref3);
		Gost ref4=context.getBean(Gost.class);
		System.out.println(ref4);

	}

}
