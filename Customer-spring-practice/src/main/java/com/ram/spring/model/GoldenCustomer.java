package com.ram.spring.model;

import com.ram.spring.Interfaces.Customer;
import com.ram.spring.address.Address;

public class GoldenCustomer implements Customer {

	private Address address;
	private String name;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void defCustomer() {
		System.out.println(
				name + " is a type of " + type + " from " + address.getCity() + " and state " + address.getState());

	}

}
