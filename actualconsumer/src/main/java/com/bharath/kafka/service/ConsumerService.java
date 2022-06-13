package com.bharath.kafka.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.bharath.kafka.dto.Dummy;

@Service
public class ConsumerService {
	
	private  final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Dummy dummy;

	@KafkaListener(topics = { "twgtest" })
	public void consumerUserData(@Payload String message, ConsumerRecord<String, String> record) {
		
		LOG.info("msg received::"+message);
		dummy.dummyM1();
	}
}
