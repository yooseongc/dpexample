package com.yooseongc.dpexample.proxy;

public class Printer implements Printable {

	private String name;
	public Printer() {
		heavyJob("Printer instance 생성 중.");
	}
	public Printer(String name) {
		this.name = name;
		heavyJob("Printer instance (" + name + ") 생성 중.");
	}
	
	
	private void heavyJob(String msg) {
		System.out.println(msg);
		for (int i = 0; i < 5; i++) {
			try { Thread.sleep(1000); } catch (InterruptedException e) { }
			System.out.print(".");
		}
		System.out.println("Complete!");
	}

	@Override
	public void setPrinterName(String name) {
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		return name;
	}

	@Override
	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}

}
