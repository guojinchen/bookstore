package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.OrderList;

public interface OrderListDao {
	/**
	 * 添加订单明细
	 * @param books
	 */
	public void addOrderList(OrderList orderList);
	/**
	 * 删除订单明细
	 * @param books
	 */
	public void removeOrderList(OrderList orderList);
	/**
	 * 修改订单明细
	 * @param books
	 */
	public void updateOrderList(OrderList orderList);
	/**
	 * 根据id查询返回唯一结果
	 * @param id
	 * @return
	 */
	public OrderList queryOrderListById(Long id);
	/**
	 * 通过查询语句返回结果集
	 * @param sqls
	 * @return
	 */
	public List<OrderList> queryOrderList(String sqls,int firstResult,int maxResult);
	
	/**
	 * 通过查询语句返回结果集,不分页，带参
	 * @param sqls
	 * @return
	 */
	public List<Object[]> queryOrderList(String sqls,Long orderId);
	/**
	 * 不分页，根据HQL，带参查询,在删除ORDERS前查ORDERLIST
	 */
		public List<OrderList> queryOrder(String sqls, Long orderId);
}
