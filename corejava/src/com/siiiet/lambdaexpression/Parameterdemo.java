package com.siiiet.lambdaexpression;

public class Parameterdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube c=(a)->{return (a*a*a);};
		System.out.println("cube of a number "+c.calculate(3));

	}

}
