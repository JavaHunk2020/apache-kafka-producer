package com.data.dto;

import java.sql.Timestamp;

public class BusinessDataDTO {
	private String header;
	private Timestamp timestamp;
	//super class reference can hold object of subclass
	private EmployeeDTO data;

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public EmployeeDTO getData() {
		return data;
	}

	public void setData(EmployeeDTO data) {
		this.data = data;
	}
	
	

}
