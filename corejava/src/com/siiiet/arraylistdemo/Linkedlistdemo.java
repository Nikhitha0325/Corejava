package com.siiiet.arraylistdemo;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("ra");
		l.add(2);
		l.add("hello");
		l.add(8.9);
		System.out.println("After Invoking add() "+l);
		l.add(1, "apple");
		
		l.addFirst("d");
		l.addLast("rashmi");
		//l.remove(0);
		System.out.println(l);
		
		
	}

}
