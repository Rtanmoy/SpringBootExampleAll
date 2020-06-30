package com.app.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {
  private String[] arr= {"Hello","WellCome","To"};
  private int count=0;
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if(count<arr.length) {
			return arr[count++];
		}else {
			count=0;
		}
		return null;
	}

}
