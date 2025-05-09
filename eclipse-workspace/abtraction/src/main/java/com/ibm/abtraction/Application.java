package com.ibm.abtraction;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

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
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("AA");
		linkedList.add("FF");
		linkedList.add("CC");
		linkedList.add("DD");
		linkedList.add("EE");
		Iterator<String> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		 
	}
}