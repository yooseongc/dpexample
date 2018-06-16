package com.yooseongc.dpexample.visitor;

import org.junit.Test;

public class VisitorTest {

	@Test
	public void visitorTest() {
		try {
			
			System.out.println("Making root entries...");
			Directory rootdir = new Directory("root");
			Directory bindir  = new Directory("bin");
			Directory tmpdir  = new Directory("tmp");
			Directory usrdir  = new Directory("usr");
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));
			rootdir.accept(new ListVisitor());
			
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
	
}
