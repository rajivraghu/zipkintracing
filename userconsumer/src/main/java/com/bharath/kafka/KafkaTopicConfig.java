package com.bharath.kafka;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaTopicConfig {

	    @Bean
	    public KafkaAdmin kafkaAdmin() {
	        Map<String, Object> configs = new HashMap<>();
	        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "bp2-vacp-q021.otxlab.net:9092");
	        return new KafkaAdmin(configs);
	    }
}
