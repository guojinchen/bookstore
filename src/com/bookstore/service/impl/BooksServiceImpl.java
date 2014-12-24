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
 * ���ͼ����Ϣ
 */
	public void addBooks(Books books) {
		booksDao.addBooks(books);
	}
/**
 * ������ϲ�ѯ������һ��Object[],LIST��
 */
	public Pager queryBook(String sqls, int pageSize, int page) {
		
		
		int allRow=booksDao.getAllRowCount("from Books");//�ܼ�¼��
		int totalPage=Pager.countTotalPage(pageSize,allRow);//��ҳ��
		final int offset=Pager.countOffset(pageSize,page);//��ǰҳ��ʼ��¼
		final int length=pageSize;//ÿҳ��¼��
		final int currentPage=Pager.countCurrentPage(page);
		List<Object[]> bookses=booksDao.queryBook(sqls, offset,length);//"һҳ"�ļ�¼

		//�ѷ�ҳ��Ϣ���浽Bean��
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
 * ����ID��ѯ�鼮��Ϣ
 */
	public Books queryBooksById(Long id) {
		Books books=booksDao.queryBooksById(id);
		return books;
	}
/**
 * ɾ���鼮��Ϣ
 */
	public void removeBooks(Books books) {
		booksDao.removeBooks(books);
	}
/**
 * �����鼮��Ϣ
 */
	public void updateBooks(Books books) {
		booksDao.updateBooks(books);
	}

	/**
	 * ����	HQL��ѯͼ�飬����ҳ������
	 */
	public List<Books> queryBook(String hql,String name) {
		List<Books> list=booksDao.queryBooksByName(hql,name);
		return list;
	}
	/**
	 * ��ѯ�����е��鼮��Ϣ
	 * 
	 */

	public List<Books> queryBooks(String hql, int first, int max) {
		List<Books> list=booksDao.queryBooks(hql, first, max);
		return list;
	}
	/**
	 * ����	HQL��ѯͼ�飬����ҳ��������
	 */
	public List<Books> queryBook(String hql) {
		List<Books> list=booksDao.queryBooksByName(hql);
		return list;
	}

}
