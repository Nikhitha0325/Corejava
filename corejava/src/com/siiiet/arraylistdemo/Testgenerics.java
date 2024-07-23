package com.siiiet.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Testgenerics {
	public static void main(String[]args) {
	
	ArrayList<String> al=new ArrayList<String>();
	al.add("rohini");
	al.add("ramya");
	al.add("rani");
	
	System.out.println("elements "+al);
	
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}

}
}