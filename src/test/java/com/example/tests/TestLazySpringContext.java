package com.example.tests;

import com.example.config.ApplicationConfig;
import com.example.entities.EmployeeDTO;
import com.example.factory.EmployeeFactoryBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ApplicationConfig.class})
public class TestLazySpringContext
{
	static Logger logger = Logger.getLogger(TestLazySpringContext.class.getName());

	@Test
	public void testLoadBeansLazily() throws Exception
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		EmployeeDTO manager = (EmployeeDTO)context.getBean("manager");
		logger.info("----- " + manager.toString() + " -----");

		EmployeeDTO director = (EmployeeDTO)context.getBean("director");
		logger.info("----- " + director.toString() + " -----");

		// Get an instance of a Director bean
		EmployeeFactoryBean directorInstance = (EmployeeFactoryBean)context.getBean("&director");

		logger.info("----- " + directorInstance.getFactoryType() + " -----");
		logger.info("----- " + directorInstance.getObjectType().toString() + " -----");
		logger.info("----- " + directorInstance.getObject().toString() + " -----");
	}

}