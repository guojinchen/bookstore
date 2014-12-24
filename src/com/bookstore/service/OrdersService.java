package com.bookstore.service;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Orders;
import com.bookstore.util.Pager;

public interface OrdersService {
	/**
	 * ��Ӷ���
	 * @param books
	 */
	public void addOrders(Orders orders);
	/**
	 * ɾ������
	 * @param books
	 */
	public void removeOrders(Orders orders);
	/**
	 * �޸Ķ���
	 * @param books
	 */
	public void updateOrders(Orders orders);
	/**
	 * ����id��ѯ����Ψһ���
	 * @param id
	 * @return
	 */
	public Orders queryOrdersById(Long id);
	/**
	 * ͨ����ѯ��䷵�ؽ����
	 * @param sqls
	 * @return
	 */
	public Pager queryOrders(String sqls,int pageSize,int page);
	/**
	 * ͨ������ѯ��䷵�ؽ����
	 * @param sqls
	 * @return
	 */
	public List<Object[]> mulqueryOrders(String sqls,int firstResult,int maxResult);
	
	/**
	 * ����VIPID��ѯ����
	 * 
	 */
	public List<Orders> myOrders(String hql,Long id);
}
