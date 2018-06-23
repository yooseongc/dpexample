package com.yooseongc.dpexample.flyweight;

import org.junit.Test;

public class FlyweightTest {

	@Test
	public void flyweightTest() {
		String arg = "1212123";
		BigString bs = new BigString(arg);
		bs.print();
	}
	
}
