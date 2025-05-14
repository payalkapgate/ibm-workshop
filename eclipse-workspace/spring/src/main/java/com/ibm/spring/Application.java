package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		TextEditor textEditor = (TextEditor)context.getBean(TextEditor.class);
		textEditor.spellCheck();
		
//		JavaCollection javaCollection = (JavaCollection)context.getBean("javaCollection");
//		System.out.println(javaCollection.getAddressList());
//		System.out.println(javaCollection.getAddressMap());
//		System.out.println(javaCollection.getAddressSet());
//		System.out.println(javaCollection.getAddressProp()); 
		System.out.println("End");
	}
}