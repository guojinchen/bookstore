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
	 * ���ͼ������
	 */
	public void addBookAdjust(BookAdjust bookAdjust) {
		bookAdjustDao.addBookAdjust(bookAdjust);
		
	}
/**
 * ��ѯͼ������
 */
	public List<BookAdjust> queryBookAdjust(String sqls, int firstResult,
			int maxResult) {
		List<BookAdjust> list=bookAdjustDao.queryBookAdjust(sqls, firstResult, maxResult);
		return list;
	}
/**
 * ����ID��ѯͼ������
 */
	public BookAdjust queryBookAdjustById(Long id) {
		BookAdjust bookAdjust=bookAdjustDao.queryBookAdjustById(id);
		return bookAdjust;
	}
/**
 * ɾ��ͼ������
 */
	public void removeBookAdjust(BookAdjust bookAdjust) {
		bookAdjustDao.removeBookAdjust(bookAdjust);
		
	}
/**
 * ����ͼ������
 */
	public void updateBookAdjust(BookAdjust bookAdjust) {
		bookAdjustDao.updateBookAdjust(bookAdjust);
	}

	
}
