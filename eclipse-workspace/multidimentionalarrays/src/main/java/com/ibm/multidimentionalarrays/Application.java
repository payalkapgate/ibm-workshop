package com.ibm.multidimentionalarrays;

public class Application
{
	public static void main( String[] args )
	{
		int nums[][];
		nums = new int[2][5];
		for(int[]row:nums) {
			for(int values:row) {
				System.out.print(values);
			}
			System.out.println();
		}
		
	}
}