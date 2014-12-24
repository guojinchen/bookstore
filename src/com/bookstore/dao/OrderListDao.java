package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.OrderList;

public interface OrderListDao {
	/**
	 * ��Ӷ�����ϸ
	 * @param books
	 */
	public void addOrderList(OrderList orderList);
	/**
	 * ɾ��������ϸ
	 * @param books
	 */
	public void removeOrderList(OrderList orderList);
	/**
	 * �޸Ķ�����ϸ
	 * @param books
	 */
	public void updateOrderList(OrderList orderList);
	/**
	 * ����id��ѯ����Ψһ���
	 * @param id
	 * @return
	 */
	public OrderList queryOrderListById(Long id);
	/**
	 * ͨ����ѯ��䷵�ؽ����
	 * @param sqls
	 * @return
	 */
	public List<OrderList> queryOrderList(String sqls,int firstResult,int maxResult);
	
	/**
	 * ͨ����ѯ��䷵�ؽ����,����ҳ������
	 * @param sqls
	 * @return
	 */
	public List<Object[]> queryOrderList(String sqls,Long orderId);
	/**
	 * ����ҳ������HQL�����β�ѯ,��ɾ��ORDERSǰ��ORDERLIST
	 */
		public List<OrderList> queryOrder(String sqls, Long orderId);
}
