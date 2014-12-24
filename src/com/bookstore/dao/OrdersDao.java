package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;
import com.bookstore.bean.Orders;

public interface OrdersDao {
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
	public List<Orders> queryOrders(String sqls,int firstResult,int maxResult);
	
	/**
	 * 通过查询语句返回结果集,分页，多表查询，ordser ,orderlist
	 * @param sqls
	 * @return
	 */
	public List<Object[]> mulqueryOrders(String sqls,int firstResult,int maxResult);
	
	/**
	 * 查询总记录数
	 */
	public int getAllRowCount(String hql);
	
	/**
	 * 根据VIPID查询订单
	 * 
	 */
	public List<Orders> myOrders(String hql,Long id);
	
}
