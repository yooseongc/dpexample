package com.yooseongc.dpexample.bridge;

import org.junit.Test;

public class BridgeTest {

	@Test
	public void bridgeTest() {
		Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Uinverse."));
		
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
	}

}
