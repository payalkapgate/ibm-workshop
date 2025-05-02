package com.ibm.throwexception;

import com.ibm.throwexception.math.Arithmetic;


public class Application
{
	public static void main(String[] args)
	{
		System.out.println("start");
		Arithmetic arithmetic = new Arithmetic();
		assert (arithmetic.sum(2,4)==6):"The sum method is defective";
		System.out.println("End");
	}
}