package com.example.factory;

import com.example.config.ApplicationConfig;
import com.example.entities.EmployeeDTO;
import com.example.util.IntegerSequenceGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeFactoryBean extends AbstractFactoryBean<Object>
{
	@Autowired
	private ApplicationConfig applicationConfig;

	@Autowired
	private IntegerSequenceGenerator integerSequenceGenerator;

	private String factoryType;

	public String getFactoryType()
	{
		return factoryType;
	}

	public void setFactoryType(String factoryType)
	{
		this.factoryType = factoryType;
	}

	@Override
	protected Object createInstance() throws Exception
	{
		EmployeeDTO employee = new EmployeeDTO();
		employee.setId(integerSequenceGenerator.getNextNumberInSequence(1));
		employee.setType(factoryType);
		employee.setFirstName(applicationConfig.getDefaultFirstName());
		employee.setLastName(applicationConfig.getDefaultLastName());
		return employee;
	}

	@Override
	public Class<EmployeeDTO> getObjectType()
	{
		return EmployeeDTO.class;
	}

}