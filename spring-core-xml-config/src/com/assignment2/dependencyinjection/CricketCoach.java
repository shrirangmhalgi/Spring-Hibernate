package com.assignment2.dependencyinjection;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	//literal values...
	private String teamName;
	private String emailId;
	
	@Override
	public String getDailyWorkout() {
		return "Do batting practice daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	// setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
