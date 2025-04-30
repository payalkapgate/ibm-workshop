package com.ibm.abtraction;

import com.ibm.abtraction.payroll.Employee;
import com.ibm.abtraction.payroll.Finance;
import com.ibm.abtraction.payroll.HR;
import com.ibm.abtraction.payroll.Intern;
import com.ibm.abtraction.payroll.Permanent;

public class Application
{
	public static void main( String[] args )
	{
		HR hr = new HR();
		Finance finance = new Finance();
		Employee employee = hr.recruit("I");//Up Casting
		if(employee != null) {
			finance.processSalary(employee);
		}
		
		employee = hr.recruit("P");
		if(employee != null) {
			finance.processSalary(employee);
		}
		
	}
}