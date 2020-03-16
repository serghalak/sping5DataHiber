package com.luv2code.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext(
						"applicationContext.xml");		
		
		Coach tennis=context.getBean("tennisCoach",Coach.class);
		
		System.out.println(tennis.getDailyWorkout()+ " - " + tennis.getDailyFortune());

		//context.clother();
	}

}
