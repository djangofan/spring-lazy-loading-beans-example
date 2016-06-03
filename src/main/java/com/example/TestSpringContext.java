package com.example;

import com.example.config.ApplicationConfig;
import com.example.entities.EmployeeDTO;
import com.example.factory.EmployeeFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringContext
{
	public static void main(String[] args) throws Exception
	{
		// Get beans from context and print them out
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		EmployeeDTO manager = (EmployeeDTO)context.getBean("manager");
		System.out.println(manager);

		EmployeeDTO director = (EmployeeDTO)context.getBean("director");
		System.out.println(director);

		// Get an instance of a Director bean
		EmployeeFactoryBean directorInstance = (EmployeeFactoryBean)context.getBean("&director");

		System.out.println(directorInstance.getFactoryType());
		System.out.println(directorInstance.getObjectType());
		System.out.println(directorInstance.getObject());

	}
}