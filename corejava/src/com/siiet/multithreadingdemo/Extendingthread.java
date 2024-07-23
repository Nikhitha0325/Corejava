package com.siiet.multithreadingdemo;

public class Extendingthread extends Thread {
	public void run() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Extendingthread e=new Extendingthread();
		e.start();
			
		}
	}

