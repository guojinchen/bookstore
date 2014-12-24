package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;
import com.bookstore.bean.BookAdjust;

public interface BookAdjustDao {
	/**
	 * ���ͼ������
	 * @param books
	 */
	public void addBookAdjust(BookAdjust bookAdjust);
	/**
	 * ɾ��ͼ������
	 * @param books
	 */
	public void removeBookAdjust(BookAdjust bookAdjust);
	/**
	 * �޸�ͼ������
	 * @param books
	 */
	public void updateBookAdjust(BookAdjust bookAdjust);
	/**
	 * ����id��ѯ����Ψһ���
	 * @param id
	 * @return
	 */
	public BookAdjust queryBookAdjustById(Long id);
	/**
	 * ͨ����ѯ��䷵�ؽ����
	 * @param sqls
	 * @return
	 */
	public List<BookAdjust> queryBookAdjust(String sqls,int firstResult,int maxResult);
	/**
	 * ��ѯ���м�¼��
	 */
	public int getAllRowCount(String hql);
	
}
