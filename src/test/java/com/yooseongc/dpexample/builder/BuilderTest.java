package com.yooseongc.dpexample.builder;

import org.junit.Test;

public class BuilderTest {

	@Test
	public void builderTest() {
		
		buildPlain();
		buildHTML();
		
	}
	
	private void buildPlain() {
		TextBuilder textBuilder = new TextBuilder();
		Director director = new Director(textBuilder);
		director.construct();
		String result = textBuilder.getResult();
		System.out.println(result);
	}
	
	private void buildHTML() {
		HTMLBuilder htmlBuilder = new HTMLBuilder();
		Director director = new Director(htmlBuilder);
		director.construct();
		String result = htmlBuilder.getResult();
		System.out.println(result);
	}
	
}
