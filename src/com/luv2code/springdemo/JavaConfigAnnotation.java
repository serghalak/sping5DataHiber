package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach=context.getBean("coach",Coach.class);
		System.out.println(coach.getDailyWorkout());
	}

}
