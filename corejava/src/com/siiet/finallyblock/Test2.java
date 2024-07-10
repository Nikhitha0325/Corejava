package com.siiet.finallyblock;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(100/0);
		}
		catch(NullPointerException npe) {
			System.out.println("welcome");
		}
		finally {
			System.out.println("finally");
		}		

	}

}
