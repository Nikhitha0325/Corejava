package com.siiiet.arraylistdemo;

import java.util.ArrayList;

public class Arrarylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		System.out.println("size"+al.size());
		al.add(3);
		al.add(7.5);
		al.add("ramya");
		al.add("h");
		
		System.out.println("size"+al.size());
		
		System.out.println(al.contains(55));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.get(3));
		
		System.out.println(al.remove(0));

	}

}
