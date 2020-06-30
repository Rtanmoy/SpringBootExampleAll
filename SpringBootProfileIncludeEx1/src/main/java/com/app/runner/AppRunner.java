package com.app.runner;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class AppRunner implements CommandLineRunner {
 
  @Value("${my.db.driver}")
  public String proddb;
  @Value("${my.db.url}")
  public String produrl;
  
  @Value("${my.email.host}")
  public String emailHost;
  @Value("${my.email.port}")
  public int emailPort;
  
  
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}


	@Override
	public String toString() {
		return "AppRunner [proddb=" + proddb + ", produrl=" + produrl + ", emailHost=" + emailHost + ", emailPort="
				+ emailPort + "]";
	}


	
	
	}

	
	


