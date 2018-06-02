package com.yooseongc.dpexample.prototype;



import org.junit.Test;

public class PrototypeTest {

	@Test
	public void prototypeTest() {
		
		// ready
		Manager manager = new Manager();
		
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);
		
		// creation
		Product p1 = manager.create("strong message");
		Product p2 = manager.create("warning box");
		Product p3 = manager.create("slash box");
		p1.use("Hello, World.");
		p2.use("Hello, World.");
		p3.use("Hello, World.");
	}
	
}
