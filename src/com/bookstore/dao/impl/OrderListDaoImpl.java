package com.bookstore.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.bookstore.bean.OrderList;
import com.bookstore.dao.OrderListDao;
import com.bookstore.util.PageQuery;

public class OrderListDaoImpl extends HibernateDaoSupport implements OrderListDao{
	/**
	 * 根据查询语句及页码和每页最大显示数查询，返回结果集合
	 */
	public List<OrderList> queryOrderList(String sqls,int firstResult, int maxResult) {
		HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
		List<OrderList> orderLists=this.getHibernateTemplate().executeFind(pagerQuery);
		return orderLists;
	}
	
	/**
	 * 根据id查询返回唯一订单明细
	 */
	public OrderList queryOrderListById(Long id) {
		OrderList orderList=(OrderList)this.getHibernateTemplate().get(OrderList.class, id);
		return orderList;
	}

	/**
	 * 删除订单明细
	 */
	public void removeOrderList(OrderList orderList) {
		this.getHibernateTemplate().delete(orderList);
	}

	/**
	 * 更新订单明细
	 */
	public void updateOrderList(OrderList orderList) {
		this.getHibernateTemplate().update(orderList);
	}

	/**
	 * 添加订单明细
	 */
	public void addOrderList(OrderList orderList) {
		this.getHibernateTemplate().save(orderList);
	}
/**
 * 不分页，根据HQL，带参查询
 */
	public List<Object[]> queryOrderList(String sqls, Long orderId) {
		List<Object[]> orderList=(List<Object[]>)this.getHibernateTemplate().find(sqls,orderId);
		return orderList;
	}
	
	/**
	 * 不分页，根据HQL，带参查询,在删除ORDERS前查ORDERLIST
	 */
		public List<OrderList> queryOrder(String sqls, Long orderId) {
			List<OrderList> orderList=(List<OrderList>)this.getHibernateTemplate().find(sqls,orderId);
			return orderList;
		}
}
