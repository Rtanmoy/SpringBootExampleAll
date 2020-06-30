package com.app.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {
	@Override
	public void write(List<? extends String> item) throws Exception {
      System.out.println("Writer=>Data is:"+item);		
	}

}
