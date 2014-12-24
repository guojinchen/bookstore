package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;
import com.bookstore.bean.Orders;

public interface OrdersDao {
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
	public List<Orders> queryOrders(String sqls,int firstResult,int maxResult);
	
	/**
	 * ͨ����ѯ��䷵�ؽ����,��ҳ������ѯ��ordser ,orderlist
	 * @param sqls
	 * @return
	 */
	public List<Object[]> mulqueryOrders(String sqls,int firstResult,int maxResult);
	
	/**
	 * ��ѯ�ܼ�¼��
	 */
	public int getAllRowCount(String hql);
	
	/**
	 * ����VIPID��ѯ����
	 * 
	 */
	public List<Orders> myOrders(String hql,Long id);
	
}
