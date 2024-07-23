package com.siiet.practice;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[]args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("even number-"+n);
		}
		else 
		{
			System.out.println("odd number-"+n);
		}
		
	}

}
