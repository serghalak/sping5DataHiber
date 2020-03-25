package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component/*("thatSillyCoach")*/
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennisCoach: inside of doMyStratupStuff()");
	}
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach: inside of doMyCleanupStuff()");
	}
	
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
