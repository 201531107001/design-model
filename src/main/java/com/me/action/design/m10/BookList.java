package com.me.action.design.m10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList implements Iterable {
	private List list = new ArrayList();

	public void addBook(Book book){
		list.add(book);
	}

	@Override
	public Iterator iterator() {
		return new BookIterator();
	}

	private class BookIterator implements Iterator{
		private int index = 0;

		@Override
		public void remove() {
			list.remove(index);
		}

		@Override
		public boolean hasNext() {
			return index < list.size();
		}

		@Override
		public Object next() {
			return list.get(index++);
		}
	}
}
