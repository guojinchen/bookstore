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
	 * ���ͼ������
	 */
	public void addBookTypes(BookTypes bookTypes) {
		bookTypesDao.addBookTypes(bookTypes);
		
	}
/**
 * ��ѯ����ͼ������
 */
	public List<BookTypes> queryBookTypes(String sqls, int firstResult,
			int maxResult) {
		List<BookTypes> list=bookTypesDao.queryBookTypes(sqls, firstResult, maxResult);
		return list;
	}
/**
 *����ID��ѯͼ������
 */
	public BookTypes queryBookTypesById(Long id) {
		BookTypes bookTypes=bookTypesDao.queryBookTypesById(id);
		return bookTypes;
	}
/**
 * ɾ��ͼ������
 */
	public void removeBookTypes(BookTypes bookTypes) {
	bookTypesDao.removeBookTypes(bookTypes);
		
	}
/**
 * ����ͼ������
 */
	public void updateBookTypes(BookTypes bookTypes) {
		bookTypesDao.updateBookTypes(bookTypes);
	}
/**
 * ����HQL��ѯ�鼮����
 */
public List<BookTypes> queryBookTypes(String sqls) {
	List<BookTypes> typelist=bookTypesDao.queryBookTypes(sqls);
	return typelist;
}
/**
 * ����HQL��ѯ�鼮���ͣ�����
 */
public List<BookTypes> queryBookTypes(String sqls, String typename) {
	List<BookTypes> typelist=bookTypesDao.queryBookTypes(sqls,typename);
	return typelist;
}

}
