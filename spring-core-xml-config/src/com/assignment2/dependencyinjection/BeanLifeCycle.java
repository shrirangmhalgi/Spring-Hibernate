package com.assignment2.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		TrackCoach coach = context.getBean("dependencyTrackCoach", TrackCoach.class);
		
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}
}
