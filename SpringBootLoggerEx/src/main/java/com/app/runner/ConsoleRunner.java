package com.app.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class ConsoleRunner implements CommandLineRunner {
 private static Logger log=LogManager.getLogger( ConsoleRunner.class);
	@Override
	public void run(String... args) throws Exception {
		try {
			log.info("ConsoleRunner Start");
			int a=10,b=3,c=2;
			log.info("Data initilization done");
			if(a>0 &&b>0)
			{c=a+b;
			log.info("if block executed");
			}else {
				c=a-b;
				log.info("else block executed");
			}
			log.info("Final result is:"+c);
		}catch(Exception e) {
			e.printStackTrace();
		}
       System.exit(0);
	}

}
