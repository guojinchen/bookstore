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
 * 添加订单列表
 */
	public void addOrderList(OrderList orderList) {
		orderListDao.addOrderList(orderList);
		
	}
/**
 * 分页查询所有订单列表
 */
	public List<OrderList> queryOrderList(String sqls, int firstResult,
			int maxResult) {
		List<OrderList> list=orderListDao.queryOrderList(sqls, firstResult, maxResult);
		return list;
	}
/**
 * 根据ID查询订单列表
 */
	public OrderList queryOrderListById(Long id) {
		OrderList orderList=orderListDao.queryOrderListById(id);
		return orderList;
	}
/**
 * 删除订单列表
 */
	public void removeOrderList(OrderList orderList) {
		orderListDao.removeOrderList(orderList);
		
	}
/**
 * 更新订单列表
 */
	public void updateOrderList(OrderList orderList) {
	orderListDao.updateOrderList(orderList);
		
	}
/**
 * 带参查询，不分页
 */
public List<Object[]> queryOrderList(String sqls, Long orderid) {
	List<Object[]> list=orderListDao.queryOrderList(sqls,orderid);
	return list;
}
/**
 * 不分页，根据HQL，带参查询,在删除ORDERS前查ORDERLIST
 */
public List<OrderList> queryOrder(String sqls, Long orderId) {
	List<OrderList> list=orderListDao.queryOrder(sqls, orderId);
	return list;
}

}
