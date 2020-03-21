package com.assignment2.dependencyinjection;

public class BaseballCoach implements Coach {
	// Fortune Service is a dependency
	private FortuneService fortuneService;
	
	// Addressing dependency injection using constructors
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Dont forget to workout daily...";
	}
	
	// To access the fortune service method we created a dummy method which will return the fortune service method
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
