package com.Pro3;

public class Dmeo {

	public static void main(String[] args) {
		
		Student s1 = Student.getStudent(false);
		Student s2 = Student.getStudent(true);
		
		System.out.println("Student 1 details :");
		System.out.println("Name : " + s1.getName());
		System.out.println("Roll : " + s1.getRoll());
		System.out.println("Addresss : " + s1.getAddress());
		System.out.println("College : " + s1.getCollegeName());			
		
		System.out.println("Student 2 details :");
		System.out.println("Name : " + s2.getName());
		System.out.println("Roll : " + s2.getRoll());
		System.out.println("Addresss : " + s2.getAddress());
		System.out.println("College : " + s2.getCollegeName());
		
	}
}
