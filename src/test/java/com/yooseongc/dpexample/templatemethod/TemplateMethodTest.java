package com.yooseongc.dpexample.templatemethod;

import org.junit.Test;

public class TemplateMethodTest {

	@Test
	public void templateMethodTest() {
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("Hello, world");
		
		d1.display();
		d2.display();
	}
	
}
