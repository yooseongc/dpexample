package com.yooseongc.dpexample.adapter;

public class BannerPrinter implements Print {

	private Banner banner;
	
	public BannerPrinter(String string) {
		this.banner = new Banner(string);
	}
	
	public void printWeak() {
		banner.showWithParen();
	}

	public void printStrong() {
		banner.showWithAster();
	}

}
