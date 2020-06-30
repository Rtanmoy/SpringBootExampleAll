package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudCsConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCsConfigServerAppApplication.class, args);
	}

}
