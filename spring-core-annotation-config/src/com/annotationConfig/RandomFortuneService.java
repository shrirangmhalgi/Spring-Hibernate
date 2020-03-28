package com.annotationConfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "RandomFortuneService says today is your lucky day";
	}
	
}
