package com.yooseongc.dpexample.abstractfactory.listfactory;

import com.yooseongc.dpexample.abstractfactory.factory.Factory;
import com.yooseongc.dpexample.abstractfactory.factory.Link;
import com.yooseongc.dpexample.abstractfactory.factory.Page;
import com.yooseongc.dpexample.abstractfactory.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}

}
