package com.ibm.abtraction.payroll;

public class HR {
	public Employee recruit(String empType) {
		if(empType.equalsIgnoreCase("I")) {
			Intern intern = new Intern();
			return intern;
		}
		else if(empType.equalsIgnoreCase("P")) {
			return new Permanent();
		}
		return null;
	}

}
