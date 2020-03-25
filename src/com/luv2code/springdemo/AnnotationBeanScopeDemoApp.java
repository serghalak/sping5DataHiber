package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		boolean result=(theCoach==alphaCoach);
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory lacation for theCoach: " + theCoach);
		
		System.out.println("\nMemory lacation for alphaCoach: " + alphaCoach+"\n");
		
		context.close();
	}

}
