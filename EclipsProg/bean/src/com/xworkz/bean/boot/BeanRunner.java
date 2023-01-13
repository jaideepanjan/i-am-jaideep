package com.xworkz.bean.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bean.configuration.BeanConfiguration;
import com.xworkz.bean.thing.Actor;
import com.xworkz.bean.thing.Rocket;
import com.xworkz.bean.thing.Season;

public class BeanRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Actor refOfActor = container.getBean("actor",Actor.class);
		
		System.out.println(refOfActor);
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.getLanguage());
		System.out.println(refOfActor.getAge());
		System.out.println("--------------------------------------------------");
		
		Actor refOfActor1 = container.getBean("acting",Actor.class);
		System.out.println(refOfActor1);
		System.out.println(refOfActor1.getName());
		System.out.println(refOfActor1.getLanguage());
		System.out.println(refOfActor1.getAge());
		System.out.println("------------------------------------------------");

		Rocket refOfRocket=container.getBean("rocket",Rocket.class);
		
		System.out.println(refOfRocket);
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getBudget());
		System.out.println("--------------------------------------------------");
		
		Rocket refOfRocket1=container.getBean("rock",Rocket.class);

		
		System.out.println(refOfRocket1);
		System.out.println(refOfRocket1.getName());
		System.out.println(refOfRocket1.getCountry());
		System.out.println(refOfRocket1.getBudget());
		System.out.println("--------------------------------------------------");
		
		Season refOfSeason = container.getBean("season",Season.class);
		
		System.out.println(refOfSeason);
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getStartingMonth());
		System.out.println(refOfSeason.getDuration());
		System.out.println("--------------------------------------------------");
		
		Season refOfSeason1 = container.getBean("seasun",Season.class);
		
		System.out.println(refOfSeason1);
		System.out.println(refOfSeason1.getName());
		System.out.println(refOfSeason1.getStartingMonth());
		System.out.println(refOfSeason1.getDuration());
		System.out.println("--------------------------------------------------");
		
		
	}

}
