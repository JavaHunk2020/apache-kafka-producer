package com.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class MainSender {
	public static void main(String[] args) {
		SpringApplication.run(MainSender.class,args);
	}

}
