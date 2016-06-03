package com.example.entities;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean
{
    public HelloWorldBean(String msg)
    {
        System.out.println( msg + ", " + this);
    }
}