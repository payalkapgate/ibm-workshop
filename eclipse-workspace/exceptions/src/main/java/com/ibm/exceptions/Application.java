package com.ibm.exceptions;

public class Application
{
	public static void main( String[] args )
	{
		System.out.println("Start");
		String firstParam = null;
		String secondParam = null;
		try {
			firstParam = args[0];
			secondParam = args[1];
			try {
				System.out.println(Integer.parseInt(firstParam)/Integer.parseInt(secondParam));
			}
			catch(NumberFormatException exception) {
				System.out.println("Nested try");
			}
			finally {
				System.out.println("Ended outer try block");
			}
			
			
		}catch(ArrayIndexOutOfBoundsException  | NumberFormatException exception) {
			System.out.println("Make sure you provide atleast 2 correct right argument");
		}
		catch(ArithmeticException ex) {
			System.out.println("You cannot divided by zero ");
		}
		catch(Exception exception) {
			System.out.println("Unkonown Issue");
		}
		System.out.println("End");
	}
}