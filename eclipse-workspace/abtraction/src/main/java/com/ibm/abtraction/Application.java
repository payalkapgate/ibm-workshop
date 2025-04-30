package com.ibm.abtraction;

import com.ibm.abtraction.payroll.Confirmed;
import com.ibm.abtraction.payroll.Employee;
import com.ibm.abtraction.payroll.Intern;

public class Application
{
	public static void main( String[] args )
	{
		Employee employee = new Intern();
		employee.salary();
		employee = new Confirmed();
		employee.salary();
	}
}