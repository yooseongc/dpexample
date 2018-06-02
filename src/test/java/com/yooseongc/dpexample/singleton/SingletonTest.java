package com.yooseongc.dpexample.singleton;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void singletonTest() {
		System.out.println("start!");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if (obj1 == obj2) System.out.println("same instance");
		else System.out.println("different instance");
		System.out.println("end!");
	}
	
}
