package com.ram.spring.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city;
	private String state;
	
	
//	public Address(String city, String state) {
//		super();
//		this.city = city;
//		this.state = state;
//	}
	
	public String getCity() {
		return city;
	}
	@Autowired
	public void setCity(@Value("hyderabad") String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}
	@Autowired
	public void setState(@Value("telangana") String state) {
		this.state = state;
	}
}
