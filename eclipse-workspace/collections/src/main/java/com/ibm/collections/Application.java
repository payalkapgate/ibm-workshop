package com.ibm.collections;
class Point<T extends Number>{
	private T x;
	private T y;
	
	public T getX() {
		return x;
	}

	public T getY() {
		return y;
	}
	Point(T x, T y){
		this.x=x;
		this.y=y;
	}
	

	@Override
	public String toString() {
		 
		return x + ","+ y;
	}
}

public class Application
{
	public static void main( String[] args )
	{
		Point<Float> point1 = new Point<Float>(2.0f, 4.0f);
		Float fx = point1.getX();
		System.out.println(point1);
 	}
}