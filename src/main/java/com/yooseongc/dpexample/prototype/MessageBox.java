package com.yooseongc.dpexample.prototype;

import java.util.stream.IntStream;

public class MessageBox implements Product {

	private char decochar;
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}
	
	@Override
	public void use(String s) {
		IntStream.range(0, s.length() + 4).forEach(i -> System.out.print(decochar));
		System.out.println(" ");
		System.out.println(decochar + " " + s + " " + decochar);
		IntStream.range(0, s.length() + 4).forEach(i -> System.out.print(decochar));
		System.out.println(" ");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		}  catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

	
	
}
