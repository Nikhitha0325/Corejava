package com.siiet.exceptionsdemo;

public class Nestedtrycatch {

	public static void check() {
		// TODO Auto-generated method stub
		String str="TNS";
		int slength=str.length();
		System.out.println("string length "+slength);
		String anotherstring=null;
		int y=6;
		try
		{
			try {
				System.out.println(str.charAt(y));
				
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("Index out of BoundException"+ex);
				
			}
			System.out.println("string length "+anotherstring.length());
		}
		catch(NullPointerException npe) {
			System.out.println("exception is thrown "+npe.getMessage());
		}

	}

}
