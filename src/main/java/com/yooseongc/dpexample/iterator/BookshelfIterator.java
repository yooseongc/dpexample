package com.yooseongc.dpexample.iterator;

public class BookshelfIterator implements Iterator {

	private Bookshelf bookShelf;
	private int index;
	
	public BookshelfIterator(Bookshelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	public boolean hasNext() {
		return (index < bookShelf.getLength());
	}

	public Object next() {
		Book book = bookShelf.getBookAt(index);
		if (book != null) index++;
		return book;
	}

}
