package com.bookstore.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Books;
import com.bookstore.dao.BooksDao;
import com.bookstore.service.BooksService;
import com.bookstore.util.Pager;

public class BooksServiceImpl implements BooksService{
	
	private BooksDao booksDao;
	

	public BooksDao getBooksDao() {
		return booksDao;
	}

	public void setBooksDao(BooksDao booksDao) {
		this.booksDao = booksDao;
	}
/**
 * 添加图书信息
 */
	public void addBooks(Books books) {
		booksDao.addBooks(books);
	}
/**
 * 多表联合查询，返回一个Object[],LIST，
 */
	public Pager queryBook(String sqls, int pageSize, int page) {
		
		
		int allRow=booksDao.getAllRowCount("from Books");//总记录数
		int totalPage=Pager.countTotalPage(pageSize,allRow);//总页数
		final int offset=Pager.countOffset(pageSize,page);//当前页开始记录
		final int length=pageSize;//每页记录数
		final int currentPage=Pager.countCurrentPage(page);
		List<Object[]> bookses=booksDao.queryBook(sqls, offset,length);//"一页"的记录

		//把分页信息保存到Bean中
		Pager pager=new Pager();
		pager.setPageSize(pageSize);
		pager.setCurrentPage(currentPage);
		pager.setAllRow(allRow);
		pager.setTotalPage(totalPage);
		pager.setList(bookses);
		pager.init();
		return pager;

	}
/**
 * 根据ID查询书籍信息
 */
	public Books queryBooksById(Long id) {
		Books books=booksDao.queryBooksById(id);
		return books;
	}
/**
 * 删除书籍信息
 */
	public void removeBooks(Books books) {
		booksDao.removeBooks(books);
	}
/**
 * 更新书籍信息
 */
	public void updateBooks(Books books) {
		booksDao.updateBooks(books);
	}

	/**
	 * 根据	HQL查询图书，不分页，带参
	 */
	public List<Books> queryBook(String hql,String name) {
		List<Books> list=booksDao.queryBooksByName(hql,name);
		return list;
	}
	/**
	 * 查询本表中的书籍信息
	 * 
	 */

	public List<Books> queryBooks(String hql, int first, int max) {
		List<Books> list=booksDao.queryBooks(hql, first, max);
		return list;
	}
	/**
	 * 根据	HQL查询图书，不分页，不带参
	 */
	public List<Books> queryBook(String hql) {
		List<Books> list=booksDao.queryBooksByName(hql);
		return list;
	}

}
