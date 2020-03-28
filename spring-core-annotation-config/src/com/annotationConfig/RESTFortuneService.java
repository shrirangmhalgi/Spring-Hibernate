package com.annotationConfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "RESTFortuneService says Today is your lucky day";
	}

}
