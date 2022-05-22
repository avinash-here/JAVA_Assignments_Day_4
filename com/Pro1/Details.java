package com.Pro1;

public class Details {

	public static void main(String[] args) {


		//using zero argument constructor
		
		Student s1 = new Student();
		s1.setRoll(44);
		s1.setName("Vishal");
		s1.setAge(20);
		s1.setMarks(364);		
		
		
		//using parameterized constructor
		
		Student s2 = new Student(64,"Raghav",19,372);
		
		
		System.out.println("Student 1 details :");
		s1.StuDetails();
		
		System.out.println("Student 2 details using getter methods");
		System.out.println("Roll is : "+ s2.getRoll());
		System.out.println("Name is : "+ s2.getName());
		System.out.println("Age is : "+ s2.getAge());
		System.out.println("Marks is : "+ s2.getMarks());
		
		

	}

}
