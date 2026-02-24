package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		
//		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
//		Customer obj = ctx.getBean("cst", Customer.class);
//		System.out.println(obj);
		
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
		Customer obj = ctx.getBean("cst1", Customer.class);
		System.out.println(obj);

	}
}
