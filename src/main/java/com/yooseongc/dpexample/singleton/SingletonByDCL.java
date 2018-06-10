package com.yooseongc.dpexample.singleton;

public class SingletonByDCL {
	
	private static SingletonByDCL singleton = null;
	private SingletonByDCL() {
		System.out.println("객체 생성.");
	}
	
	public static SingletonByDCL getInstance() {
		if (singleton == null) {
			synchronized (SingletonByDCL.class) {
				if (singleton == null) singleton = new SingletonByDCL();
			}
		}
		return singleton;
	}
	
}
