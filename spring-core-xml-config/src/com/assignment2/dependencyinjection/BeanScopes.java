package com.assignment2.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopes {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		context.refresh();
		
		// example of prototype scope... (make sure you make the scope prototype in applicationContext.xml)
		CricketCoach coach = context.getBean("dependencyCricketCoach", CricketCoach.class);
		CricketCoach coach1 = context.getBean("dependencyCricketCoach", CricketCoach.class);
		
		coach1.setEmailId("this is a new email id");
		System.out.println("Coach 1 : " + coach1.getEmailId());
		System.out.println("Coach : " + coach.getEmailId());
		
		context.close();
	}
}
