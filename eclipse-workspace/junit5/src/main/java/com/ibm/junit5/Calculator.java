package com.ibm.junit5;

public class Calculator {
	public int sum(int iNum1, int iNum2) {
		return iNum1+iNum2;
	}
	public int divide(int iNum1, int iNum2) {
		return iNum1/iNum2;
	}
	public static boolean isEven(int number) {
		return number%2 == 0;
	}
//	public static boolean isOdd(int number) {
//		return number%2 == 1;
//	}
	public void getConnection() {
//		try {
//			Thread.sleep(101);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Connected...");
	}
}
