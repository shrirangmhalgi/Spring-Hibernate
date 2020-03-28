package com.annotationConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringHelloJavaBeans {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = context.getBean("swimCoach", Coach.class);
		
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}
}
