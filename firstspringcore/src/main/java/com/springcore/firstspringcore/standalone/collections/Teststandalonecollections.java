package com.springcore.firstspringcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teststandalonecollections {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/firstspringcore/standalone/collections/standaloneconfig.xml");

		Person person1 = context.getBean("p1", Person.class);
		System.out.println(person1);
		System.out.println(person1.getCountry().getClass().getName());
		System.out.println("=======================================================");
		System.out.println(person1.getCost().getClass().getName());
		
		Person person2 = context.getBean("p2", Person.class);
		System.out.println(person2);
		System.out.println(person2.getCountry().getClass().getName());
		System.out.println("=======================================================");
		System.out.println(person2.getCost().getClass().getName());
		
		
	} 

}
