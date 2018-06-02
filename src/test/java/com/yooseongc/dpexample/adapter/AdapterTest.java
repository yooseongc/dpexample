package com.yooseongc.dpexample.adapter;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void inheritAdapterTest() {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
	
	@Test
	public void nonAdapterTest() {
		Banner b = new Banner("Hi");
		b.showWithParen();
		b.showWithAster();
	}
	
	@Test
	public void delegateAdapterTest() {
		Print p = new BannerPrinter("Aloha");
		p.printWeak();
		p.printStrong();
	}
}
