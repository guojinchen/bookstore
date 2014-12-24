package com.bookstore.action;

import java.util.List;

import com.bookstore.bean.Books;
import com.bookstore.service.BooksService;

public class TypeBookAction {
		
private List<Books> list;
private BooksService booksService;
private Books book;

public List<Books> getList() {
	return list;
}

public void setList(List<Books> list) {
	this.list = list;
}

public BooksService getBooksService() {
	return booksService;
}

public void setBooksService(BooksService booksService) {
	this.booksService = booksService;
}




public Books getBook() {
	return book;
}

public void setBook(Books book) {
	this.book = book;
}

public String execute(){
	String hql="select b from Books b  where b.bookTypes.booktypeId='"+book.getBookTypes().getBooktypeId()+"'";
	list=booksService.queryBook(hql);
	//System.out.println(list.get(1));
	return"success";
}


}
