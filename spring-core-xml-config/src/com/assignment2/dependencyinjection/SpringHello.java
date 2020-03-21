package com.assignment2.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHello {
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Loading  multiple config files
		// ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml", "applicationContext2.xml"});
		
		// retrieve the bean from the container 
		CricketCoach theCoach = (CricketCoach) context.getBean("dependencyCricketCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeamName());
		System.out.println(theCoach.getEmailId());
		
		// close the application context
		context.close();
	}
}
