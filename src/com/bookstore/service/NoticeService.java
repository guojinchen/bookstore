package com.bookstore.service;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Notices;
import com.bookstore.util.Pager;

public interface NoticeService {
	/**
	 * ��ӹ���
	 */
	public void addNotice(Notices notice);
	/**
	 * ɾ������
	 */
	public void deleteNotice(Notices notice);
	/**
	 * ���¹���
	 * @param notice
	 */
	public void updateNotice(Notices notice);
	/**
	 * ����ID��ѯ����
	 * @param id
	 * @return
	 */
	public Notices queryOne(Long id);
	/**
	 * ����HQL��ѯ���棬�޷�ҳ
	 * @param hql
	 * @return ����һ��LIST
	  */
	public List<Notices> queryAll(String hql);
	/**
	 * ����HQL��ѯ���棬��ҳ
	 * @param hql
	 * @param pageSize
	 * @param currentPage
	 * @return
	 */
	public Pager queryAll(String hql,int pageSize,int currentPage);
}
