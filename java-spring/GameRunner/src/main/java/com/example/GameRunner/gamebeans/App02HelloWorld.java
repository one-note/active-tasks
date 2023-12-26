package com.example.tutorial.GameRunner.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {

	public static void main(String[] args) {

		
	try (var context = new	AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));	
		System.out.println(context.getBean("empAdd"));
		System.out.println(context.getBean("employee2"));
//	System.out.println(context.getBean("employeeWithParamsemployeeWithParams"));
//	String[] str = context.getBeanDefinitionNames() ;
//	forEach(str str : st){
//		System.out.println(st);
//	}
		System.out.println(context.getBeanDefinitionCount());
		
		Arrays.stream(context.getBeanDefinitionNames())
		       .forEach(System.out::println);
	} catch (BeansException e) {
		
		e.printStackTrace();
	}
	
	
	}

}
