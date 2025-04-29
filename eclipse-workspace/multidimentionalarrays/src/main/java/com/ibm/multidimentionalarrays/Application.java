package com.ibm.multidimentionalarrays;
//class Point{
//	public int x;
//	public int y;
//}

class Data{
	static public int value;
}
public class Application
{
	public static void main( String[] args )
	{
//		int nums[][];
//		nums = new int[2][5];
//		for(int[]row:nums) {
//			for(int values:row) {
//				System.out.print(values);
//			}
//			System.out.println();
//		}
		/*
		Point points[];
		points = new Point[3];
		points[0] = new Point();
		points[0].x=3;
		*/
		Data data1 = new Data();
		Data data2 = new Data();
		data1.value = 3;
		data2.value = 5;
		Data.value = 44;
		System.out.println(data1.value+"\t"+data2.value);
		
		
	}
}