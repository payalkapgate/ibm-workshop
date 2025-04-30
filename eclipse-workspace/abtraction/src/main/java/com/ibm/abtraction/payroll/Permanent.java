package com.ibm.abtraction.payroll;

public class Permanent extends Employee{

	@Override
	public void salary() {
		
		System.out.println("Permanent Salary");
		
	}
	public void transportation() {
		System.out.println("company provided transported facility");
	}


}
