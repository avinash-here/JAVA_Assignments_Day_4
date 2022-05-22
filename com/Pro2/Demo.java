package com.Pro2;

public class Demo {
	
	//zero argument constructor	
	public Demo() {		
		System.out.println("This is Demo() constructor");
	}
	
	//parameterized with string constructor 
	public Demo(String s) {
		System.out.println("This is Demo(String s) constructor");
	}
	
	//parameterized with integer constructor
	public Demo(int i) {
		System.out.println("This is Demo(int i) constructor");
	}
	
	//parameterized with float constructor
	public Demo(float f) {
		System.out.println("This is Demo(float f) constructor");
	}
	
	public static void main(String[] args) {
		
		new Demo();
		new Demo("Apple");
		new Demo(5);
		new Demo(10.0f);	
		
	}	
}
