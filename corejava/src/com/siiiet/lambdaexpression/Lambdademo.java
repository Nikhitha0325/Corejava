package com.siiiet.lambdaexpression;

public class Lambdademo {
	
	public static void main(String[]args) {
		
		Message m=()->{return "hello World";};
		System.out.println(m.greet());
	}

}
