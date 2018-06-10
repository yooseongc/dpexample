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
		
		manager.showShowcase();
		
		// creation
		Product p1 = manager.create("strong message");
		System.out.println(p1.toString());
		Product p2 = manager.create("warning box");
		System.out.println(p2.toString());
		Product p3 = manager.create("slash box");
		System.out.println(p3.toString());
		Product p4 = manager.create("strong message");
		System.out.println(p4.toString());
		Product p5 = manager.create("warning box");
		System.out.println(p5.toString());
		Product p6 = manager.create("slash box");
		System.out.println(p6.toString());
		p1.use("Hello, World.");
		p2.use("Hello, World.");
		p3.use("Hello, World.");
	}
	
}
