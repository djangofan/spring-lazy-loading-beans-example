package com.example.tests;

import com.example.config.ApplicationConfig;
import com.example.entities.EmployeeDTO;
import com.example.entities.HelloWorldBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ApplicationConfig.class})
public class SpringBeanLazyLoadTest
{
    @Autowired
    private HelloWorldBean helloworld;

    @Test // this test is lame but just trying out.
    public void print()
    {
        System.out.println("Autowired: " + helloworld);
    }
}