package com.ibm.spring;

public class Greeting {
	private String name;
	
	public Greeting(){
		System.out.println("Greeting Instanciated");
	}
	
	public void initGreet() {
		System.out.println("Initialized");
	}
	public void destroyGreet() {
		System.out.println("Destroyed.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
