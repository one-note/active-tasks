package com.example.tutorial.GameRunner.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



record Employee (String name , int age) {};
record Employee2 (String name , int age, Address add) {};
record Address (String address) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean 
	public String name() {
		return "Hello world" ;
	}
	@Bean 
	public String Address() {
		return "Hello world" ;
	}
	  @Bean
	  public int age() {
		  return 23;
	  }

	  @Bean(name="empAdd")
	  public Employee employee () {
		  var employee = new Employee("Ansu",24);
		  var employee251 = new Employee(name(),age());
		  return employee251;
		  }
	  @Bean
	  public Employee2 employee2 () {
		  var employee2 = new Employee2("Ansu",24, new Address("Hellow java"));
		
		  return employee2;
		  }

	  	@Bean(name="address2")
	  	public Address address ( )
	  	{
	  		return new Address("Mumbai");
	  	}
		@Bean(name="address3")
	  	public Address address3 ( )
	  	{
	  		return new Address("Delhi");
	  	}
	  
	  @Bean()
	  public Employee2 employeeWithParams(String name,int age,Address address3) {
		return new Employee2(name,age,address3);
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
