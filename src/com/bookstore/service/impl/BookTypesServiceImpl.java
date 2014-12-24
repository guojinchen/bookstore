package com.bookstore.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.BookTypes;
import com.bookstore.dao.BookTypesDao;
import com.bookstore.service.BookTypesService;

public class BookTypesServiceImpl  implements BookTypesService{
 
	private BookTypesDao bookTypesDao;
	
	
	public BookTypesDao getBookTypesDao() {
		return bookTypesDao;
	}

	public void setBookTypesDao(BookTypesDao bookTypesDao) {
		this.bookTypesDao = bookTypesDao;
	}

	/**
	 * 添加图书类型
	 */
	public void addBookTypes(BookTypes bookTypes) {
		bookTypesDao.addBookTypes(bookTypes);
		
	}
/**
 * 查询所有图书类型
 */
	public List<BookTypes> queryBookTypes(String sqls, int firstResult,
			int maxResult) {
		List<BookTypes> list=bookTypesDao.queryBookTypes(sqls, firstResult, maxResult);
		return list;
	}
/**
 *根据ID查询图书类型
 */
	public BookTypes queryBookTypesById(Long id) {
		BookTypes bookTypes=bookTypesDao.queryBookTypesById(id);
		return bookTypes;
	}
/**
 * 删除图书类型
 */
	public void removeBookTypes(BookTypes bookTypes) {
	bookTypesDao.removeBookTypes(bookTypes);
		
	}
/**
 * 更新图书类型
 */
	public void updateBookTypes(BookTypes bookTypes) {
		bookTypesDao.updateBookTypes(bookTypes);
	}
/**
 * 根据HQL查询书籍类型
 */
public List<BookTypes> queryBookTypes(String sqls) {
	List<BookTypes> typelist=bookTypesDao.queryBookTypes(sqls);
	return typelist;
}
/**
 * 根据HQL查询书籍类型，带参
 */
public List<BookTypes> queryBookTypes(String sqls, String typename) {
	List<BookTypes> typelist=bookTypesDao.queryBookTypes(sqls,typename);
	return typelist;
}

}
