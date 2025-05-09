package com.ibm.threadpools;

 
import java.sql.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application
{
	public static void main( String[] args )
	{
		int vCPUs = Runtime.getRuntime().availableProcessors();
		System.out.println(vCPUs);
		ScheduledExecutorService service = Executors.newScheduledThreadPool(vCPUs);
		System.out.println(new Date());
		service.schedule(new Task(1), 10, TimeUnit.SECONDS);
		 
		
	}
	static class Task implements Runnable{
		int count;
		Task(int count) {
			 this.count=count;
		}
		@Override
		public void run() {
			 System.out.println(Thread.currentThread()+"--> "+count);
			 System.out.println(new Date());
		}
		
		
	}
}