package com.bookstore.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.OrderList;
import com.bookstore.dao.OrderListDao;
import com.bookstore.service.OrderListService;

public class OrderListServiceImpl implements OrderListService {

	private OrderListDao orderListDao;
	
	public OrderListDao getOrderListDao() {
		return orderListDao;
	}

	public void setOrderListDao(OrderListDao orderListDao) {
		this.orderListDao = orderListDao;
	}
/**
 * ��Ӷ����б�
 */
	public void addOrderList(OrderList orderList) {
		orderListDao.addOrderList(orderList);
		
	}
/**
 * ��ҳ��ѯ���ж����б�
 */
	public List<OrderList> queryOrderList(String sqls, int firstResult,
			int maxResult) {
		List<OrderList> list=orderListDao.queryOrderList(sqls, firstResult, maxResult);
		return list;
	}
/**
 * ����ID��ѯ�����б�
 */
	public OrderList queryOrderListById(Long id) {
		OrderList orderList=orderListDao.queryOrderListById(id);
		return orderList;
	}
/**
 * ɾ�������б�
 */
	public void removeOrderList(OrderList orderList) {
		orderListDao.removeOrderList(orderList);
		
	}
/**
 * ���¶����б�
 */
	public void updateOrderList(OrderList orderList) {
	orderListDao.updateOrderList(orderList);
		
	}
/**
 * ���β�ѯ������ҳ
 */
public List<Object[]> queryOrderList(String sqls, Long orderid) {
	List<Object[]> list=orderListDao.queryOrderList(sqls,orderid);
	return list;
}
/**
 * ����ҳ������HQL�����β�ѯ,��ɾ��ORDERSǰ��ORDERLIST
 */
public List<OrderList> queryOrder(String sqls, Long orderId) {
	List<OrderList> list=orderListDao.queryOrder(sqls, orderId);
	return list;
}

}
