package com.assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHello {
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from the container 
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the application context
		context.close();
	}
}
