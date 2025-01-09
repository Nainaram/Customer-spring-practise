package com.ram.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.spring.Interfaces.Customer;
import com.ram.spring.model.GoldenCustomer;
import com.ram.spring.model.PlatinumCustomer;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("beans.xml");

		Customer gc = (GoldenCustomer) cpx.getBean("gc");
		Customer pc = (PlatinumCustomer) cpx.getBean("pc");

		gc.defCustomer();
		pc.defCustomer();
		cpx.close();
	}
}
