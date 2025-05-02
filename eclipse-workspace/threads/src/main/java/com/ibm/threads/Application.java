package com.ibm.threads;
 
public class Application
{
	public static void workLoad() {
		for(int c=0;c<10;c++) {
			System.out.println(Thread.currentThread()+"--->"+String.valueOf(c));
		}
	}
	public static void main( String[] args )
	{
		
		Thread thread1 = new Thread(() -> workLoad());
		System.out.println(thread1.getState());
		thread1.start();
		System.out.println(thread1.getState());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
		System.out.println(thread1.getState());
		
	}
}