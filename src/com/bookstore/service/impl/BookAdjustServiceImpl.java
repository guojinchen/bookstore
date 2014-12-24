package com.bookstore.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.BookAdjust;
import com.bookstore.bean.Books;
import com.bookstore.dao.BookAdjustDao;
import com.bookstore.service.BookAdjustService;
import com.bookstore.service.BooksService;

public class BookAdjustServiceImpl  implements  BookAdjustService{

	private BookAdjustDao bookAdjustDao;
	
	public BookAdjustDao getBookAdjustDao() {
		return bookAdjustDao;
	}

	public void setBookAdjustDao(BookAdjustDao bookAdjustDao) {
		this.bookAdjustDao = bookAdjustDao;
	}

	/**
	 * 添加图书评价
	 */
	public void addBookAdjust(BookAdjust bookAdjust) {
		bookAdjustDao.addBookAdjust(bookAdjust);
		
	}
/**
 * 查询图书评价
 */
	public List<BookAdjust> queryBookAdjust(String sqls, int firstResult,
			int maxResult) {
		List<BookAdjust> list=bookAdjustDao.queryBookAdjust(sqls, firstResult, maxResult);
		return list;
	}
/**
 * 根据ID查询图书评价
 */
	public BookAdjust queryBookAdjustById(Long id) {
		BookAdjust bookAdjust=bookAdjustDao.queryBookAdjustById(id);
		return bookAdjust;
	}
/**
 * 删除图书评价
 */
	public void removeBookAdjust(BookAdjust bookAdjust) {
		bookAdjustDao.removeBookAdjust(bookAdjust);
		
	}
/**
 * 更新图书评价
 */
	public void updateBookAdjust(BookAdjust bookAdjust) {
		bookAdjustDao.updateBookAdjust(bookAdjust);
	}

	
}
