package com.Pro3;

public class Student {
	
	private int roll;
	private String name;
	private String address;
	private String collegeName;
	
	public Student(int roll, String name, String address) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = "NIT";
	}
	
	public Student(int roll, String name, String address, String collegeName) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = collegeName;
	}
	
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getRoll() {
		return roll;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setCollegeName(String college) {
		this.collegeName = college;
	}
	public String getCollegeName() {
		return collegeName;
	}
	
	
	public static Student getStudent(boolean fromNIT) {
		if(fromNIT == true)
			return new Student(28, "Rakesh", "Banaras");
		else
			return new Student(22, "Devansh", "Dehradun", "VVIT");
	}	
	

}
