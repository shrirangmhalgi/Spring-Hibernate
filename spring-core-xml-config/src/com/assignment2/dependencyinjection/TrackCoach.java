package com.assignment2.dependencyinjection;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k...";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It " + fortuneService.getDailyFortune();
	}

	// adding a init method
	public void beanInitMethod() {
		System.out.println("You are in bean init method...");
	}
	
	// adding a destroy method
	public void beanDestroyMethod() {
		System.out.println("You are in bean destroy method...");
	}
}
