package com.bookstore.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bookstore.bean.Orders;
import com.bookstore.dao.OrdersDao;
import com.bookstore.util.PageQuery;

public class OrdersDaoImpl extends HibernateDaoSupport implements OrdersDao {
	/**
	 * 根据查询语句及页码和每页最大显示数查询，返回结果集合
	 */
	public List<Orders> queryOrders(String sqls,int firstResult, int maxResult) {
		HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
		List<Orders> orderses=this.getHibernateTemplate().executeFind(pagerQuery);
		return orderses;
	}
	
	/**
	 * 根据id查询返回唯一订单
	 */
	public Orders queryOrdersById(Long id) {
		Orders orders=(Orders)this.getHibernateTemplate().get(Orders.class, id);
		return orders;
	}

	/**
	 * 删除订单
	 */
	public void removeOrders(Orders orders) {
		this.getHibernateTemplate().delete(orders);
	}

	/**
	 * 更新订单
	 */
	public void updateOrders(Orders orders) {
		this.getHibernateTemplate().update(orders);
	}

	/**
	 * 添加订单
	 */
	public void addOrders(Orders orders) {
		this.getHibernateTemplate().save(orders);
	}
	/**
	 * 多表查询，返回所有订单
	 */

	public List<Object[]> mulqueryOrders(String sqls, int firstResult,
			int maxResult) {
		HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
		List<Object[]> orderses=this.getHibernateTemplate().executeFind(pagerQuery);
		return orderses;
	}
	/**
	 * 查询总记录数
	 */
	public int getAllRowCount(String hql) {
		return this.getHibernateTemplate().find(hql).size();
	}

	/**
	 * 根据VIPID查询订单信息
	 */
	public List<Orders> myOrders(String hql, Long id) {
		List<Orders> list=this.getHibernateTemplate().find(hql,id);
		return list;
	}
}
