package com.yooseongc.dpexample.bridge;

/**
 * 무언가를 '표시'한다. (기능)
 * '어떻게' 표시할 지는 DisplayImpl이 결정해 줄 것이다.
 * 구현체를 받아 가지고 있으며, 이를 사용한다.
 * @author yooseongc
 *
 */
public class Display {

	private DisplayImpl impl;
	
	public Display(DisplayImpl impl) {
		this.impl = impl;
	}
	
	public void open() {
		impl.rawOpen();
	}
	
	public void print() {
		impl.rawPrint();
	}
	
	public void close() {
		impl.rawClose();
	}
	
	// final : 이 기능은 더 이상 확장할 수 없을 테지.
	public final void display() {
		open();
		print();
		close();
	}
	
}
