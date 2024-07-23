package com.siiet.practice;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=5,c=6,d=9;
		int max=(a>b)?a:b;
		System.out.println(a>b && a++>b);
		System.out.println(a);
		System.out.println(a<b & a++>b);
		System.out.println(a);
		
		//shift operator
		System.out.println(a<<2);
		System.out.println(a>>2);
		
		//ternary operator
		System.out.println(max);
	}

}
