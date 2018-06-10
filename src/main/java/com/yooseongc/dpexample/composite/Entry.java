package com.yooseongc.dpexample.composite;

public abstract class Entry {

	protected Entry parent;
	
	public abstract String getName();
	public abstract int getSize();
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}
	
	public void printList() {
		printList("");
	}
	
	protected abstract void printList(String prefix);
	
	public String getFullName() {
		StringBuffer fullname = new StringBuffer();
		Entry entry = this;
		do {
			fullname.insert(0, "/" + entry.getName());
			entry = entry.parent;
		} while (entry != null);
		return fullname.toString();
	}
	
	@Override
	public String toString() {
		return String.format("%s (size : %d)", getName(), getSize());
	}
	
}
