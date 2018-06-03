package com.yooseongc.dpexample.abstractfactory.tablefactory;

import com.yooseongc.dpexample.abstractfactory.factory.Factory;
import com.yooseongc.dpexample.abstractfactory.factory.Link;
import com.yooseongc.dpexample.abstractfactory.factory.Page;
import com.yooseongc.dpexample.abstractfactory.factory.Tray;

public class TableFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new TableLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new TablePage(title, author);
	}

}
