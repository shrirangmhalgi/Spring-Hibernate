package com.annotationConfig;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	@Value("${team}")
	private String team;
	
	@Value("${email}")
	private String email;
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practise butterfly stroke daily...";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
