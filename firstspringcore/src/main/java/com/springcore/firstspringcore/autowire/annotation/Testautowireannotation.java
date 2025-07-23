package com.springcore.firstspringcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testautowireannotation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/firstspringcore/autowire/annotation/autowireannotationconfig.xml");

		Emp emp = context.getBean("emp", Emp.class);
		System.out.println(emp);
	}

}
