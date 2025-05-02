package com.ibm.throwexception;
class IllegalAgeException extends Throwable{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return  "You are not fit for voting";
	}
}
class ElectionVoting{
	public void register(int age) throws IllegalAgeException{
		if(age<18) {
			throw new IllegalAgeException();
		}
		System.out.println("Registration completed");
	}
}
public class Application
{
	public static void main(String[] args)
	{
		System.out.println("start");
		ElectionVoting electionVoting = new ElectionVoting();
		try {
			electionVoting.register(17);
		} catch (IllegalAgeException e) {
			 
			e.printStackTrace();
		}
		System.out.println("End");
	}
}