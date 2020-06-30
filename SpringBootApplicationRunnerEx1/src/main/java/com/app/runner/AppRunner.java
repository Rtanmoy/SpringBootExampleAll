package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Set<String>optionKeys=args.getOptionNames("profile");
		System.out.println(optionKeys);
		
		List<String> list=args.getOptionValues("profile");
		System.out.println(list);
		
		System.out.println(args.containsOption("nature"));
		System.out.println(args.containsOption("db"));
		
		List<String> nonOp=args.getNonOptionArgs();
		System.out.println(nonOp);
		
		String[] arr=args.getSourceArgs();
		System.out.println(arr);
		System.out.println(Arrays.asList(arr));
		
	}

}
