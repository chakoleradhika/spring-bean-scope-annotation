package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent 
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Student stud = (Student)context.getBean("student");
		
		System.out.println(stud);
		
		Student stud1 = (Student) context.getBean("student");
		
		System.out.println(stud1);
	}

}
