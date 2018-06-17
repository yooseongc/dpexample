package com.yooseongc.dpexample.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {

	private String name;
	private ArrayList<Entry> dir = new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String getName() {
		return name;
		
	}

	@Override
	public int getSize() {
		int size = 0;
		Iterator<Entry> iter = dir.iterator();
		while (iter.hasNext()) {
			Entry entry = iter.next();
			size += entry.getSize();
		}
		return size;
	}
	
	@Override
	public Entry add(Entry entry) {
		dir.add(entry);
		return this;
	}
	
	@Override
	public Iterator<Entry> iterator() {
		return dir.iterator();
	}

}
