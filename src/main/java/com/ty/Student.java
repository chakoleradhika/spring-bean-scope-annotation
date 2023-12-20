package com.ty;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Student 
{
	public void read()
	{
		System.out.println("Student is reading");
	}

}
