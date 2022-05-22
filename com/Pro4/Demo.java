package com.Pro4;

public class Demo {
	
	void fun(int i) 
	{
		if( i < 0)
			System.out.println("Error");
		else
		{
			if(i % 2 == 1)
				System.out.println(i);
			else
				System.out.println((i/10+1)*10);
		}
	}

	public static void main(String[] args) {


		Demo d = new Demo();
		d.fun(59);

	}

}
