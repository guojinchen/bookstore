package com.bookstore.service;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.BookTypes;

public interface BookTypesService {
	/**
	 * ����鼮����
	 * @param books
	 */
	public void addBookTypes(BookTypes bookTypes);
	/**
	 * ɾ���鼮����
	 * @param books
	 */
	public void removeBookTypes(BookTypes bookTypes);
	/**
	 * �޸��鼮����
	 * @param books
	 */
	public void updateBookTypes(BookTypes bookTypes);
	/**
	 * ����id��ѯ����Ψһ�������
	 * @param id
	 * @return
	 */
	public BookTypes queryBookTypesById(Long id);
	/**
	 * ͨ����ѯ��䷵�ؽ�������ͣ���ҳ
	 * @param sqls
	 * @return
	 */
	public List<BookTypes> queryBookTypes(String sqls,int firstResult,int maxResult);
	
	/**
	 * ͨ����ѯ��䷵�ؽ�������ͣ��޷�ҳ
	 * @param sqls
	 * @return
	 */
	public List<BookTypes> queryBookTypes(String sqls);
	
	/**
	 * ͨ����ѯ��䷵�ؽ�������ͣ��޷�ҳ������
	 * @param sqls
	 * @return
	 */
	public List<BookTypes> queryBookTypes(String sqls,String typename);
	
}
