package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;

public class AppARunner implements CommandLineRunner, Ordered {

	@Override
	public int getOrder() {
		
		return 5;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From Runner-A");
	}

}
