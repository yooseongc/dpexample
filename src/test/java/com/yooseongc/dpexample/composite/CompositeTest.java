package com.yooseongc.dpexample.composite;

import org.junit.Test;

public class CompositeTest {

	@Test
	public void compositeTest() {
		
		try {
			System.out.println("Making root entries...");
			
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory tmpdir = new Directory("temp");
			Directory usrdir = new Directory("usr");
			
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			
			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));
			
			rootdir.printList();
			
			System.out.println();
			System.out.println("Making user entries...");
			
			Directory kim = new Directory("Kim");
			Directory lee = new Directory("Lee");
			Directory park = new Directory("Park");
			
			usrdir.add(kim);
			usrdir.add(lee);
			usrdir.add(park);
			
			kim.add(new File("diary.html", 100));
			kim.add(new File("Composite.java", 200));
			lee.add(new File("memo.tex", 300));
			park.add(new File("game.doc", 400));
			park.add(new File("junk.mail", 500));
			
			rootdir.printList();
			
			File file = new File("abc.def", 1000);
			tmpdir.add(file);
			System.out.println();
			System.out.println("filepath : " + file.getFullName());
			System.out.println("temp : " + tmpdir.getFullName());
			
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
		
	}
	
}
