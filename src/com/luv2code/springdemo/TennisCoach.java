package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component/*("thatSillyCoach")*/
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice your backhang volley";
	}

	

	public TennisCoach() {
		System.out.println(">>TennisCoach inside default const");
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	//@Autowired
	public void setFortuneService /*doSomeCrazzyStuff*/(FortuneService fortuneService) {
		System.out.println("<<<inside dosomeCrazzyStuff ....");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
