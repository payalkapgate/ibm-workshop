package com.ibm.enums;

 enum Apple{
		GoldenDel,
		RedDel,
		Dala;
	}

public class Application
{
	public static void main( String[] args )
	{
		Apple applee = Apple.RedDel;
		System.out.println(applee);
		Apple[] apples = Apple.values();
		for(Apple apple:apples) {
			System.out.println(apple);
		}
		
		
	}
}