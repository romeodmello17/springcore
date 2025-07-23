package com.springcore.firstspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      TestCore core1 = (TestCore) context.getBean("testcore1");
      TestCore core2 = (TestCore) context.getBean("testcore2");
      System.out.println(core1);
      System.out.println(core2);
      core1.test();
      
    }
}
