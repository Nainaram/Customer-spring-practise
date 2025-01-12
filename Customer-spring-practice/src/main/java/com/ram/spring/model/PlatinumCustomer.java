package com.ram.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ram.spring.Interfaces.Customer;
import com.ram.spring.address.Address;

@Component
public class PlatinumCustomer implements Customer {

	private Address address;

	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress( @Qualifier("address") Address address) {
		this.address = address;
	}

	private String name;
	private String type;

	public String getName() {
		return name;
	}
	@Autowired
	public void setName( @Value("diskshit") String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}
	@Autowired
	public void setType(@Value("Platinum Customer") String type) {
		this.type = type;
	}

	@Override
	public void defCustomer() {
		System.out.println(
				name + " is a type of " + type + " from " + address.getCity() + " and state " + address.getState());

	}
}
