package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.jdbc.Driver");
		d.setUrl("jdbc:mysql://localhost:3306/sboot");
		d.setUsername("root");
		d.setPassword("root");
		return d;
	}
}



