package com.javainuse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component
public class Dummy {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Autowired
	RestTemplate restTemplate;
	
	@NewSpan(name = "ThreeDummy")
	public String dummy() throws Exception {
		LOG.info("Inside dummy");
	

		
		  String baseUrl = "http://localhost:8089/microservice4h"; try {
		  Thread.sleep(3000); } catch (Exception ex) {
		  
		 } String response=(String) restTemplate.exchange(baseUrl, HttpMethod.GET,
		  null,String.class).getBody(); LOG.info("The response recieved by dummy is "+
		  response); return response;
		 
		
		
	}
}
