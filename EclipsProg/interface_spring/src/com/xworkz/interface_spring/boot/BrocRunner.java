package com.xworkz.interface_spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.interface_spring.Browser;
import com.xworkz.interface_spring.bean.Chrome;
import com.xworkz.interface_spring.bean.FireBox;
import com.xworkz.interface_spring.configurations.BrocCongiguration;

public class BrocRunner {

	public static void main(String[] args) {


		ApplicationContext context=new AnnotationConfigApplicationContext(BrocCongiguration.class);
	
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Browser spring=context.getBean(Chrome.class);
		spring.browser();
		FireBox spring1=context.getBean(FireBox.class);
		spring1.browser();
		System.out.println(context.getBeanDefinitionCount());
	
	
	}

}
