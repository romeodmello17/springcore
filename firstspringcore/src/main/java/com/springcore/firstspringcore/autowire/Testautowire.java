package com.springcore.firstspringcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testautowire {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/firstspringcore/autowire/autowireconfig.xml");

		Emp emp = context.getBean("emp", Emp.class);
		System.out.println(emp);
	}

}
