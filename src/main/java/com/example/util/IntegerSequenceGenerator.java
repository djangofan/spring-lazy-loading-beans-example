package com.example.util;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class IntegerSequenceGenerator
{
	private final AtomicInteger id = new AtomicInteger(0);

	public int getNextNumberInSequence(int granularity)
	{
		return id.getAndAdd(granularity);
	}
}