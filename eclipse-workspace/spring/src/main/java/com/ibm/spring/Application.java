package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		TextEditor textEditor = (TextEditor)context.getBean("textEditor");
		textEditor.spellCheck();
		
//		JavaCollection javaCollection = (JavaCollection)context.getBean("javaCollection");
//		System.out.println(javaCollection.getAddressList());
//		System.out.println(javaCollection.getAddressMap());
//		System.out.println(javaCollection.getAddressSet());
//		System.out.println(javaCollection.getAddressProp()); 
//		System.out.println("End");
	}
}