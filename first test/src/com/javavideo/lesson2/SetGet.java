package com.javavideo.lesson2;

public class SetGet {

	private String name;
	String firstname;
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		if(newName.startsWith("M")) {
			this.name = newName;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "SetGet [name=" + name + ", firstname=" + firstname + "]";
	}

	public static void main(String[] args) {
		
		SetGet setget = new SetGet();
		setget.firstname = "Manash";
		setget.setName("Manash");
		
		
	}
}



