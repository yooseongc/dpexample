package com.yooseongc.dpexample.factorymethod;

import org.junit.Test;

import com.yooseongc.dpexample.factorymehtod.idcard.IDCardFactory;
import com.yooseongc.dpexample.factorymethod.framework.Factory;
import com.yooseongc.dpexample.factorymethod.framework.Product;

public class FactoryMethodTest {

	@Test
	public void factoryMethodTest() {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("홍길동");
		Product card2 = factory.create("이순신");
		Product card3 = factory.create("강감찬");
		
		card1.use();
		card2.use();
		card3.use();
		
		System.out.println(((IDCardFactory) factory).getOwners());
	}
	
}



