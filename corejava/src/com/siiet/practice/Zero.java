package com.siiet.practice;

import java.util.Scanner;

public class Zero {
	public static void main(String[]args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		if(n==0)
		{
		System.out.println("The number is zero");	
		}
		else {
			System.out.println("The number is not zero");
		}
	}

}
