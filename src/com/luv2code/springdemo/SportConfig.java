package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
public class SportConfig {
	
	@Bean
	public Coach coach() {
		return new SwimCoach(fortuneService());
	}
	
	@Bean
	public FortuneService fortuneService() {
		return new SadFortuneService();
	}
	
	

}
