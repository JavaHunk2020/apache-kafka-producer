package com.producer.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaProducerConfig {

	@Value(value = "${bootstrap.servers}")
	private String bootstrapAddress;

	// 1. Send string to Kafka

	@Bean
	public ProducerFactory<String, String> producerFactory() {
		Map<String, Object> props = new HashMap<>(); // localhost:9092
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		return new DefaultKafkaProducerFactory<>(props);
	}

	@Bean
	public KafkaTemplate<String, String> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}
	/*
	 * @Bean public ProducerFactory<String, BusinessDataDTO> dataProducerFactory() {
	 * Map<String, Object> props = new HashMap<>(); // localhost:9092
	 * props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
	 * props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
	 * StringSerializer.class);
	 * props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
	 * JsonSerializer.class); return new DefaultKafkaProducerFactory<>(props); }
	 * 
	 * @Bean public KafkaTemplate<String, BusinessDataDTO> empployeeKafkaTemplate()
	 * { return new KafkaTemplate<>(dataProducerFactory()); }
	 */

}
