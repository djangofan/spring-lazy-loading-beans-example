package com.example.tests;

import com.example.config.ApplicationConfig;
import com.example.entities.EmployeeDTO;
import com.example.factory.EmployeeFactoryBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ApplicationConfig.class})
public class TestSpringContext
{
	@Test
	public void testLoadBeansLazily() throws Exception
	{
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