package com.bharath.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import brave.sampler.Sampler;


@SpringBootApplication
public class ProducerApplication {



	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}
	
	
	@RestController
	class Microservice4Controller {
		
		private  final Logger LOG = LoggerFactory.getLogger(this.getClass());
		@Autowired
		private KafkaTemplate<String, String> kafkaTemplate;

		@GetMapping("/sendMessage")
		public void sendMessage() {
			LOG.info("sending message");
		    kafkaTemplate.send("twgtest", "Rajiv123");
		}
		
		@Bean
		public Sampler defaultSampler(){
			return Sampler.ALWAYS_SAMPLE;
		}
		
	}
	

	
	
	
}
