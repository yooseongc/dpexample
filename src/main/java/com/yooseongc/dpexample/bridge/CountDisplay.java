package com.yooseongc.dpexample.bridge;


/**
 * Display를 상속받아 새로운 기능을 추가확장한다.
 * @author yooseongc
 *
 */
public class CountDisplay extends Display {

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	
	public void multiDisplay(int times) {
		open();
		for (int i = 0; i < times; i++) {
			print();
		}
		close();
	}

}
