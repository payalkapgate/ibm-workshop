package com.ibm.lambda;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Application
{
	public static void main( String[] args )
	{
		/*
		LinkedList<String> result = new LinkedList<String>(); 
	     
	    // Add elements to the collection. 
	    result.add("B"); 
	    result.add("C"); 
	    result.add("D"); 
	    result.add("X"); 
	    result.add("Y"); 
	    result.add("Z"); 
	    result.add("A"); 
	 
	    result.add(1, "A2"); 
	 
	    System.out.println("Original contents of result: " + result); 
	 
	    // Remove elements from the collection. 
	    result.remove("F"); 
	    result.remove(2); 
	 
	    System.out.println("Contents of result after deletion: " 
	                       + result); 
	 
	    // Remove first and last elements. 
	    result.removeFirst(); 
	    result.removeLast(); 
	 
	    System.out.println("result after deleting first and last: " 
	                       + result); 
	 
	    // Get and set a value. 
	    String val = result.get(2); 
	    result.set(2, val + " Changed"); 
	 
	    System.out.println("result after change: " + result);
	    */
		
		// Create an array list. 
	    ArrayList<String> al = new ArrayList<String>(); 
	     
	    // Add elements to the array list. 
	    al.add("C"); 
	    al.add("A"); 
	    al.add("E"); 
	    al.add("B"); 
	    al.add("D"); 
	    al.add("F"); 
	 
	    // iterate through the list
	    System.out.print("Original contents of al: "); 

	    Iterator<String> itr = al.iterator(); 
	    while(itr.hasNext()) { 
	      String element = itr.next(); 
	      System.out.print(element + " "); 
	    } 
	    System.out.println(); 
	 
	    // Modify objects being iterated. 
	    ListIterator<String> litr = al.listIterator();  
	    while(litr.hasNext()) { 
	      String element = litr.next(); 
	      litr.set(element + "+"); 
	    } 
	 
	    System.out.print("Modified contents of al: "); 
	    itr = al.iterator();  
	    while(itr.hasNext()) { 
	      String element = itr.next(); 
	      System.out.print(element + " "); 
	    } 
	    System.out.println(); 
	 
	    // Now, display the list backwards. 
	    System.out.print("Modified list backwards: "); 
	    while(litr.hasPrevious()) { 
	      String element = litr.previous(); 
	      System.out.print(element + " "); 
	    } 
	    System.out.println();
	}
}