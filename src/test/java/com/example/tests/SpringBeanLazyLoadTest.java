package com.example.tests;

import com.example.config.ApplicationConfig;
import com.example.entities.HelloWorldBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ApplicationConfig.class})
public class SpringBeanLazyLoadTest
{
    static Logger logger = Logger.getLogger(SpringBeanLazyLoadTest.class.getName());

    @Autowired
    private HelloWorldBean helloworld1;

    @Autowired
    private HelloWorldBean helloworld2;

    @Test
    public void testPrintingProtoTypeBeans()
    {
        logger.info("Autowired1: " + helloworld1);
        logger.info("Autowired2: " + helloworld2);
    }
}