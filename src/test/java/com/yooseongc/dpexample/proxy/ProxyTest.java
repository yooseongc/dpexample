package com.yooseongc.dpexample.proxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void proxyTest() {
		Printable p = new PrinterProxy("Alice");
		System.out.println("current : " + p.getPrinterName());
		p.setPrinterName("Bob");
		System.out.println("current : " + p.getPrinterName());
		p.print("Hello, world.");
	}
	
}
