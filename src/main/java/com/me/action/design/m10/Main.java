package com.me.action.design.m10;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		BookList bookList = new BookList();
		bookList.addBook(new Book("红楼梦","曹雪芹"));
		bookList.addBook(new Book("西游记","吴承恩"));
		bookList.addBook(new Book("三国演义","罗贯中"));
		bookList.addBook(new Book("水浒传","施耐庵"));
		bookList.addBook(new Book("笑傲江湖","金庸"));

		Iterator iterator = bookList.iterator();

		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}
