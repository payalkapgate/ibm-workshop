package com.ibm.object;

class Point{
	public int x, y;
	Point(int x, int y){
		this.x= x;
		this.y = y;
	}
	@Override
	public boolean equals(Object target) {
		if(target instanceof Point) {
			Point point2 = (Point) target;
			if(this.x==point2.x && this.y==point2.y) {
				return true;
			}
		}
		
		return false;
		
	}
	 
}
 
public class Application
{
	public static void main( String[] args )
	{
		Point point1 = new Point(2, 4);
		Point point2 = new Point(2,4);
		System.out.println(point1.equals(point2));
	}
}