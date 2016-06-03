package com.example.entities;

import org.springframework.util.StringUtils;

public class EmployeeDTO
{
	private Integer id;
	private String firstName;
	private String lastName;
	private String type;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getFullNameAndType()
	{
		if(StringUtils.isEmpty(firstName) || StringUtils.isEmpty(lastName) || StringUtils.isEmpty(type))
		{
			return "";
		} else {
			return getLastName() + ", " + getFirstName() + " (" + getType() + ")";
		}
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", type=" + type + "]";
	}
}