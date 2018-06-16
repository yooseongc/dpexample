package com.yooseongc.dpexample.visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {

	private String currentdir = "";
	
	@Override
	public void visit(File file) {
		System.out.println(currentdir + "/" + file);
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		Iterator<Entry> iter = directory.iterator();
		while (iter.hasNext()) {
			Entry entry = iter.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}

}
