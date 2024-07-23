package com.siiiet.stringdemo;

public class stringbufferdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer b=new StringBuffer("welcome");
		 
		b.append(" to java");
		System.out.println(b);
		
		b.insert(3, "hi");
		System.out.println(b);
		
        b.delete(1, 4);
        System.out.println(b);
        
        System.out.println(b.reverse());

	}

}
