package com.atguigu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomRuleConfigration {

	@Bean
	public CustomRibboRule getMyRule(){
		return new CustomRibboRule();
	}
}
