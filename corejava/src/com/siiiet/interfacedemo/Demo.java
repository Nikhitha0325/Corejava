package com.siiiet.interfacedemo;

public class Demo implements Childinterface {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}
public static void main(String[]args) {
Demo d=new Demo();
 d.show();
d.print();
		
	}
}

