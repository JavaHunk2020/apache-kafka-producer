package com.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.data.dto.BusinessDataDTO;

@Service
public class EmployeeDataService {
	
	
	@Value(value = "${general.topic.name}")
	private String topicName;
	
	
	@Value(value = "${employee.topic.name}")
	private String employeeTopicName;
	/*
	 * @PostConstruct public void fire() throws InterruptedException,
	 * ExecutionException { for(int x=1;x<=20;x++) { EmployeeDTO employeeDTO=new
	 * EmployeeDTO(); employeeDTO.setEmail("nagen"+x+"@gmail.com");
	 * employeeDTO.setGender("Male"); employeeDTO.setMobile("220290"+x);
	 * employeeDTO.setName("Jhonm"+x); BusinessDataDTO businessDataDTO=new
	 * BusinessDataDTO(); businessDataDTO.setData(employeeDTO);
	 * System.out.println("######!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Publishing data = "
	 * +employeeDTO); String
	 * result=kafkaTemplate.send("customer-loan-topic100",businessDataDTO).
	 * completable().supplyAsync(()->"success").get();
	 * System.out.println("result = "+result); }
	 * 
	 * }
	 */
}
