package com.example.config;

import com.example.entities.HelloWorldBean;
import com.example.util.IntegerSequenceGenerator;
import com.example.factory.EmployeeFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@Lazy
public class ApplicationConfig
{
	private static final String DEFAULT_FIRST_NAME_PROP_KEY = "defaults.firstName";
	private static final String DEFAULT_LAST_NAME_PROP_KEY = "defaults.lastName";

	@Value(DEFAULT_FIRST_NAME_PROP_KEY)
	private String defaultFirstName;

	@Value(DEFAULT_LAST_NAME_PROP_KEY)
	private String defaultLastName;

	@Bean(name="helloWorldBean")
	@Scope("prototype")
	public HelloWorldBean initHelloWorldBean()
	{
		return new HelloWorldBean("Hello");
	}

	@Bean(name="integerSequenceGenerator")
	public IntegerSequenceGenerator initSimpleIdGenerator()
	{
		return new IntegerSequenceGenerator();
	}

	@Bean(name="manager")
	public EmployeeFactoryBean initEmployeeManager()
	{
		EmployeeFactoryBean employeeFactoryBean = new EmployeeFactoryBean();
		employeeFactoryBean.setFactoryType("manager");
		return employeeFactoryBean;
	}

	@Bean(name="director")
	public EmployeeFactoryBean initEmployeeDirector()
	{
		EmployeeFactoryBean employeeFactoryBean = new EmployeeFactoryBean();
		employeeFactoryBean.setFactoryType("director");
		return employeeFactoryBean;
	}

	public String getDefaultFirstName()
	{
		return defaultFirstName;
	}

	public String getDefaultLastName()
	{
		return defaultLastName;
	}

}