package com.siiet.finallyblock;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("welcome");
		}
		catch(Exception e) {
			System.out.println("exception");
			
		}
		finally {
			System.out.println("hello");
		}
	}

}
