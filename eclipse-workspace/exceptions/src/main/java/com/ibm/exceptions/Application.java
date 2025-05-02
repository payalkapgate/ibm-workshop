package com.ibm.exceptions;

public class Application
{
	public static void main( String[] args )
	{
		System.out.println("Start");
		try {
			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
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