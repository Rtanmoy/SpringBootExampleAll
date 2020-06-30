package com.app.procssor;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String, String> {
@Override
public String process(String item) throws Exception {
	System.out.println("from Processor");
	return "Processed :"+item.toUpperCase();
}
}
