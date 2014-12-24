package com.bookstore.action;

import java.util.List;

import com.bookstore.bean.BookAdjust;
import com.bookstore.bean.Books;
import com.bookstore.service.BookAdjustService;

public class BookAdjustAction {
	private List<BookAdjust> list;
	private int first=0;
	private int max=10;
	private BookAdjustService bookAdjustService;
	private BookAdjust bookAdjust;
	public BookAdjust getBookAdjust() {
		return bookAdjust;
	}
	public void setBookAdjust(BookAdjust bookAdjust) {
		this.bookAdjust = bookAdjust;
	}
	
	
	public List<BookAdjust> getList() {
		return list;
	}
	public void setList(List<BookAdjust> list) {
		this.list = list;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public BookAdjustService getBookAdjustService() {
		return bookAdjustService;
	}
	public void setBookAdjustService(BookAdjustService bookAdjustService) {
		this.bookAdjustService = bookAdjustService;
	}
	/**
	 * 添加评价
	 * @return
	 */
	public String addBookAdjust(){
		bookAdjustService.addBookAdjust(bookAdjust);
		return"success";
		
	}
	/**
	 * 删除评价
	 * @return
	 */
public String removeBookAdjust(){
		
		bookAdjustService.removeBookAdjust(bookAdjust);
		return"success";
	}
/**
 * 更新评价
 * @return
 */
public String updateBookAdjust(){
	bookAdjustService.updateBookAdjust(bookAdjust);
	return"success";
	
}
/**
 * 根据评价ID查询评价
 * @return
 */
public String queryOneBookAdjust(){
	bookAdjust=bookAdjustService.queryBookAdjustById(bookAdjust.getAdjustId());
	return "success";
	
}
/**
 * 根据书名查询书评
 * @return
 */
public String queryBookAdjustByName(){
	String sqls="select b from BookAdjust b where b.books.bookName="+bookAdjust.getBooks().getBookName()+"'";
	list=bookAdjustService.queryBookAdjust(sqls, first, max);
	return "success";
	
}

/**
 * 查询所有的书评
 * @return
 */
public String queryAllBookAdjust(){
	String sqls=" from BookAdjust";
	list=bookAdjustService.queryBookAdjust(sqls, first, max);
	return "success";
	
}
	
}
