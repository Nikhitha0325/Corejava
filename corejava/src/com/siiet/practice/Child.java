package com.siiet.practice;

public class Child extends Father {
	
	@Override
	void show()
	{
		System.out.println("hello");
	}
	public static void main(String[]args) {
	Child c=new Child();
	c.show();
	}
}
