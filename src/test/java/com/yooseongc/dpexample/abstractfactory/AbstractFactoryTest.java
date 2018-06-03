package com.yooseongc.dpexample.abstractfactory;

import org.junit.Test;

import com.yooseongc.dpexample.abstractfactory.factory.Factory;
import com.yooseongc.dpexample.abstractfactory.factory.Link;
import com.yooseongc.dpexample.abstractfactory.factory.Page;
import com.yooseongc.dpexample.abstractfactory.factory.Tray;

public class AbstractFactoryTest {

	@Test
	public void abstractFactoryTest() {
		String concreteFactoryClassName = "com.yooseongc.dpexample.abstractfactory.listfactory.ListFactory";
		Factory factory = Factory.getFactory(concreteFactoryClassName);
		
		Link joins = factory.createLink("중앙일보", "http:/www.joins.com/");
		Link chosun = factory.createLink("조선일보", "http://www.chosun.com/");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link kr_yahoo = factory.createLink("Yahoo! Korea", "http://www.yahoo.co.kr");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");
		
		Tray traynews = factory.createTray("신문");
		traynews.add(joins);
		traynews.add(chosun);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(kr_yahoo);
		
		Tray traysearch = factory.createTray("검색엔진");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "영진닷컴");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}
	
	@Test
	public void abstractFactoryTest2() {
		String concreteFactoryClassName = "com.yooseongc.dpexample.abstractfactory.tablefactory.TableFactory";
		Factory factory = Factory.getFactory(concreteFactoryClassName);
		
		Link joins = factory.createLink("중앙일보", "http:/www.joins.com/");
		Link chosun = factory.createLink("조선일보", "http://www.chosun.com/");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link kr_yahoo = factory.createLink("Yahoo! Korea", "http://www.yahoo.co.kr");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");
		
		Tray traynews = factory.createTray("신문");
		traynews.add(joins);
		traynews.add(chosun);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(kr_yahoo);
		
		Tray traysearch = factory.createTray("검색엔진");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage2", "영진닷컴");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}
	
}
