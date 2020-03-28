package com.annotationConfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Research about @PostConstruct annotation....

@Component
@Scope("prototype")
//@Component("myTennisCoach")
public class TennisCoach implements Coach {

	// where there is @Autowired it is either or we can use one of the 3 methods to inject the dependencies
	// if the name of the variable is exactly the same as class name then it uses the class name (Reflection concept)
	@Autowired
	@Qualifier("RESTFortuneService")
	private FortuneService fortuneService;
	
	@Value("${team}") //injecting values from the properties file
	private String teamName;
	
	@Value("${email}")
	private String email;
	
	// this will call init inject the values and then modify the stuff you did it 
	@PostConstruct
	public void init() {
		teamName += " in PostConstruct";
		email += " in PostConstruct";
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("In destroy");
	}
	
//	@Autowired
//	public TennisCoach(@Qualifier("RESTFortuneService") FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public FortuneService getHappyFortuneService() {
		return fortuneService;
	}
	
//	@Autowired
//	public void setHappyFortuneService(@Qualifier("databaseFortuneService") FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practise your backhand volley...";
	}

}
