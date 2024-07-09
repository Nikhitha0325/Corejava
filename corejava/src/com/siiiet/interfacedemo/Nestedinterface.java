package com.siiiet.interfacedemo;

public class Nestedinterface implements Myinterface.Myinnerinterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("innerinterface");
	} 
	public static void main(String[]args) {
		Nestedinterface n=new Nestedinterface();
		n.print();
		System.out.println(Nestedinterface.id);
	}

}
