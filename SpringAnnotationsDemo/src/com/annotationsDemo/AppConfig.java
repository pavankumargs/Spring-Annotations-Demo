package com.annotationsDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com")
@PropertySource("classpath:application.properties")
public class AppConfig {
	
	@Bean("employee")
	public Employee getEmployee() {
		return new Employee();
	}
}
