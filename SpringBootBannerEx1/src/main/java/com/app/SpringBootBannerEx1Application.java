package com.app;

import java.util.Arrays;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.ConfigurableWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootBannerEx1Application {

	public static void main(String[] args) {
		SpringApplication s=new SpringApplication(SpringBootBannerEx1Application.class);
		//s.setBannerMode(Banner.Mode.OFF);
		s.setBannerMode(Banner.Mode.CONSOLE);
		s.run(args);
		
 ConfigurableApplicationContext ac=SpringApplication.run(SpringBootBannerEx1Application.class, args);
 
 String []beans=ac.getBeanDefinitionNames();
 System.out.println("Length is:"+beans.length);
 Arrays.sort(beans);
 for(String b:beans) {
	 System.out.println(b);
 }
 
	}

}
