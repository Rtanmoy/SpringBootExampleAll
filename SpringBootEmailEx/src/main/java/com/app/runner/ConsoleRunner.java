package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.app.util.EmailUtil;
@Component
public class ConsoleRunner implements CommandLineRunner {
@Autowired
private EmailUtil util;

	@Override
	public void run(String... args) throws Exception {
		//ClassPathResource file=new ClassPathResource("abcd.txt");
		FileSystemResource file=new FileSystemResource("D:\\abcd.pdf");
		boolean flag=util.send("rtanmoy5@outlook.com,amitabha1991.ray@gmail.com","Demo","demo successfull", file);
		if(flag)
			System.out.println("SEND");
		else System.out.println("check problem");
	}

}
