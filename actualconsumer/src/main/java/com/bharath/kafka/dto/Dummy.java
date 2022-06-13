package com.bharath.kafka.dto;

import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component
public class Dummy {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@NewSpan("dummyM1")
	public void dummyM1() {
		
		LOG.info("dummyM1 called...");
		try {
			Thread.sleep(5000);
			} 
		catch (Exception ex) {
			 }
		
		String s =null;
		s.length();
		
		
	}

}
