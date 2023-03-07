package com.producer.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.dto.BusinessDataDTO;
import com.data.dto.EmployeeDTO;

@RestController
@RequestMapping("/v2")
public class EmployeeController {
	
	@Value(value = "${general.topic.name}")
	private String topicName;
	
	
	@Value(value = "${employee.topic.name}")
	private String employeeTopicName;
	
	
	@PostMapping("/employess")
	public Map<String,Object> createEmployee(@RequestBody EmployeeDTO employeeDTO) throws InterruptedException, ExecutionException {
		System.out.println(employeeDTO);
		BusinessDataDTO businessDataDTO=new BusinessDataDTO();
		businessDataDTO.setData(employeeDTO);
		//String result=kafkaTemplate.send(employeeTopicName,businessDataDTO).completable().supplyAsync(()->"success").get();
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("result", "AA");
		map.put("code", 100);
		return map;
	}
	
}
