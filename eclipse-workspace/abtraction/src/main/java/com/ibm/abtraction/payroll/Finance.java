package com.ibm.abtraction.payroll;

public class Finance {
	public void processSalary(Employee employee) {
		employee.salary();
		if (employee instanceof Permanent) {
			Permanent permanentEmployee = (Permanent) employee;
			permanentEmployee.transportation();
			
		}
	}
}
