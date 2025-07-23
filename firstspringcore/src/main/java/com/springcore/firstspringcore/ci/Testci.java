package com.springcore.firstspringcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testci {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/firstspringcore/ci/ciconfig.xml");
		Emp emp1 = (Emp) context.getBean("emp");
		System.out.println("Employee 1 : " + emp1);

		Addition addition = (Addition) context.getBean("add");
		addition.doSum();
	}

}
