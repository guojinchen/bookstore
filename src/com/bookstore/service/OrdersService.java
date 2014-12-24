package com.bookstore.service;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Orders;
import com.bookstore.util.Pager;

public interface OrdersService {
	/**
	 * 添加订单
	 * @param books
	 */
	public void addOrders(Orders orders);
	/**
	 * 删除订单
	 * @param books
	 */
	public void removeOrders(Orders orders);
	/**
	 * 修改订单
	 * @param books
	 */
	public void updateOrders(Orders orders);
	/**
	 * 根据id查询返回唯一结果
	 * @param id
	 * @return
	 */
	public Orders queryOrdersById(Long id);
	/**
	 * 通过查询语句返回结果集
	 * @param sqls
	 * @return
	 */
	public Pager queryOrders(String sqls,int pageSize,int page);
	/**
	 * 通过多表查询语句返回结果集
	 * @param sqls
	 * @return
	 */
	public List<Object[]> mulqueryOrders(String sqls,int firstResult,int maxResult);
	
	/**
	 * 根据VIPID查询订单
	 * 
	 */
	public List<Orders> myOrders(String hql,Long id);
}
