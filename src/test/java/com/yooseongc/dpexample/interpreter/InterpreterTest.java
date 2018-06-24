package com.yooseongc.dpexample.interpreter;

import org.junit.Test;

public class InterpreterTest {

	@Test
	public void interpreterTest() {
		test1();
		test2();
		test3();
		test4();
		test5();
	}
	
	private void test1() {
		String program_text = "program end";
		Node node = new ProgramNode();
		try {
			node.parse(new Context(program_text));
			System.out.println("program 1");
			System.out.println("text = " + program_text);
			System.out.println("node = " + node);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private void test2() {
		String program_text = "program go end";
		Node node = new ProgramNode();
		try {
			node.parse(new Context(program_text));
			System.out.println("program 2");
			System.out.println("text = " + program_text);
			System.out.println("node = " + node);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

	private void test3() {
		String program_text = "program go right go right go right go right end";
		Node node = new ProgramNode();
		try {
			node.parse(new Context(program_text));
			System.out.println("program 3");
			System.out.println("text = " + program_text);
			System.out.println("node = " + node);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private void test4() {
		String program_text = "program repeat 5 go right end end";
		Node node = new ProgramNode();
		try {
			node.parse(new Context(program_text));
			System.out.println("program 4");
			System.out.println("text = " + program_text);
			System.out.println("node = " + node);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private void test5() {
		String program_text = "program repeat 4 repeat 3 go right go left end right end end";
		Node node = new ProgramNode();
		try {
			node.parse(new Context(program_text));
			System.out.println("program 5");
			System.out.println("text = " + program_text);
			System.out.println("node = " + node);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
}
