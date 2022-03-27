package com.joan.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.joan"})
public class ViewConfig {
	// This Bean makes sure to allow us not to use viewName.jsp in controllers 
	// but only view names -> in Boot it is automatically configured
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr  = new InternalResourceViewResolver();
		
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
}
