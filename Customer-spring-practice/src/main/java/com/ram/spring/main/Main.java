package com.ram.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ram.spring.Interfaces.Customer;
import com.ram.spring.config.RamConfig;
import com.ram.spring.model.GoldenCustomer;
import com.ram.spring.model.PlatinumCustomer;
// this code for the only pure annotation 
// in this  instead of the .xml container we are going a create a configuration file that heree is RamConfig.class 
// in which there is objects of the particular class is created directly using new object-classname()
public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext apx = new AnnotationConfigApplicationContext(RamConfig.class);

		Customer gc = (GoldenCustomer) apx.getBean("goldenCustomer");
		Customer pc = (PlatinumCustomer) apx.getBean("platinumCustomer");

		gc.defCustomer();
		pc.defCustomer();
		apx.close();
	}
}


// this code for the xml + annotation 

//public class Main {
//
//	public static void main(String[] args) {
//
//		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("beans.xml");
//
//		Customer gc = (GoldenCustomer) cpx.getBean("goldenCustomer");
//		Customer pc = (PlatinumCustomer) cpx.getBean("platinumCustomer");
//
//		gc.defCustomer();
//		pc.defCustomer();
//		cpx.close();
//	}
//}
