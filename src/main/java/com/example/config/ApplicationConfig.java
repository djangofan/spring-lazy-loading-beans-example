package com.example.config;

import com.example.util.IntegerSequenceGenerator;
import com.example.factory.EmployeeFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig
{
	public static String DEFAULT_FIRST_NAME_PROP_KEY = "defaults.firstName";
	public static String DEFAULT_LAST_NAME_PROP_KEY = "defaults.lastName";

	@Autowired
	public Environment springEnvironment;

	@Bean(name="integerSequenceGenerator")
	public IntegerSequenceGenerator initSimpleIdGenerator()
	{
		IntegerSequenceGenerator integerSequenceGenerator = new IntegerSequenceGenerator();
		return integerSequenceGenerator;
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
		return springEnvironment.getProperty(DEFAULT_FIRST_NAME_PROP_KEY);
	}

	public String getDefaultLastName()
	{
		return springEnvironment.getProperty(DEFAULT_LAST_NAME_PROP_KEY);
	}

}