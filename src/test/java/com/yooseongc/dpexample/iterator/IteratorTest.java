package com.yooseongc.dpexample.iterator;

import org.junit.Test;

public class IteratorTest {

	@Test
	public void testIterator() {
		Bookshelf bookShelf = new Bookshelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		
		Iterator iter = bookShelf.iterator();
		while (iter.hasNext()) {
			Book book = (Book) iter.next();
			System.out.println(book.getName());
		}
	}
	
}
