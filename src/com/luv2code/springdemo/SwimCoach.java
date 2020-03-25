package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class SwimCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	
	@Autowired
	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
