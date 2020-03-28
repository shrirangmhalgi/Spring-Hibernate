package com.annotationConfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

@Component
@Scope("singleton")
public interface Coach {
	public String getDailyWorkout();  
	public String getDailyFortune();
}
