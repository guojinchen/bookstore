package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Books;

public interface BooksDao {
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
	 * ͨ����ѯ��䷵�ؽ����,�����֮��Ĳ�ѯ��ɸѡ�����
	 * @param sqls
	 * @return
	 */
	public List<Object[]> queryBook(String sqls,int firstResult,int maxResult);
	/**
	 * ��BOOK���в�ѯ����ѯ���Ϊ����ģ�Ϊ������
	 * @param sqls
	 * @param firstResult
	 * @param maxResult
	 * @return
	 */
	
	public List<Books> queryBooks(String sqls,int firstResult,int maxResult);
	/**
	 * ͨ��HQL����ͼ��,�޷�ҳ������
	 */
	public List<Books> queryBooksByName(String hql,String name);
	/**
	 * ͨ��HQL����ͼ��,�޷�ҳ��������
	 */
	public List<Books> queryBooksByName(String hql);
	
	/**
	 * ��ѯ���м�¼��
	 */
	public int getAllRowCount(String hql);
}
