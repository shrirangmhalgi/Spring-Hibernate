package com.annotationConfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "DatabaseFortuneService says Today is your lucky day...";
	}
	
}
