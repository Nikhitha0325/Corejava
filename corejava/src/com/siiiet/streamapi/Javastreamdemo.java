package com.siiiet.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product>pl=new ArrayList<Product>();
		
		pl.add(new Product(1,"dell",400000));
		pl.add(new Product(1,"hp",300000));
		pl.add(new Product(1,"apple",500000));
		
		List<Float> pl2=pl.stream().filter(p->p.price<300000)
				.map(p->p.price)
				.collect(Collectors.toList());
		System.out.println(pl2);
		

	}

}
