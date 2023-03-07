package com.producer.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublishDataController {
	
	@Value(value = "${general.topic.name}")
	private String topicName;
	
	
	 @Autowired
	 @Qualifier("kafkaTemplate")
	 private KafkaTemplate<String, String> kafkaTemplate;
	 
	 
	 @PostConstruct
	 public void init() {
		 System.out.println("##################MESSAGE######################");
			System.out.println("Ahahha message is send to server successfully.");
			kafkaTemplate.send(topicName, 0, null, "This is java testing");
			kafkaTemplate.send(topicName, 0, null, "This is python testing");
			//kafkaTemplate.send(topicName, 2, null, "Owowow");
			System.out.println("##################MESSAGE######################");
	 }
	
	
	@GetMapping("/publish/message")
	public String sendData(@RequestParam String message) {
		//Write code to send data to topic
		// message - is converted internally as byte array
		//Serialization means converting Object into Byte array
		//byte[] ;
		//message - hashCode - >> PartitionNumber - hashCode%4=0,1,2,3
		System.out.println("##################MESSAGE######################");
		System.out.println("Ahahha message is send to server successfully.");
		kafkaTemplate.send(topicName, 0, null, message);
		System.out.println("##################MESSAGE######################");
		return "Ahahha message is send to server successfully.";
	}
	
	@GetMapping("/dpublish")
	public String dsendData(@RequestParam String message) {
		//Write code to send data to topic
		// message - is converted internally as byte array
		//Serialization means converting Object into Byte array
		//byte[] ;
		//message - hashCode - >> PartitionNumber - hashCode%4=0,1,2,3
		kafkaTemplate.send(topicName, message);
		return "Ahahha message is send to server successfully.";
	}

}
