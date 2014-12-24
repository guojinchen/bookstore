package com.bookstore.service;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Books;
import com.bookstore.util.Pager;

public interface BooksService {
	/**
	 * ����鼮
	 * @param books
	 */
	public void addBooks(Books books);
	/**
	 * ɾ���鼮
	 * @param books
	 */
	public void removeBooks(Books books);
	/**
	 * �޸��鼮
	 * @param books
	 */
	public void updateBooks(Books books);
	/**
	 * ����id��ѯ����Ψһ���
	 * @param id
	 * @return
	 */
	public Books queryBooksById(Long id);
	/**
	 * ͨ����ѯ��䷵�ؽ����,���������ϲ�ѯ
	 * @param sqls
	 * @return
	 */
	public Pager queryBook(String sqls,int pageSize,int currentPage);
	
	/**
	 * ͨ����������ͼ��,�޷�ҳ,����
	 */
	public List<Books> queryBook(String hql,String name);
	/**
	 * ͨ����ѯ��䷵��ͬ��Ľ������һ����
	 */
	public List<Books> queryBooks(String hql,int first,int max);
	
	/**
	 * ͨ����������ͼ��,�޷�ҳ,������
	 */
	public List<Books> queryBook(String hql);
}
