package com.yooseongc.dpexample.singleton;

public class Singleton {

	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("객체 생성.");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
}
