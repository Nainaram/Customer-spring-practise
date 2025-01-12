package com.ram.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ram.spring.model","com.ram.spring.address"})
public class RamConfig {

}
