package com.bookstore.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Orders;
import com.bookstore.dao.OrdersDao;
import com.bookstore.service.OrdersService;
import com.bookstore.util.Pager;

public class OrdersServiceImpl implements OrdersService{

	
	private OrdersDao ordersDao;
	
	
	public OrdersDao getOrdersDao() {
		return ordersDao;
	}

	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}

	/**
	 * 添加订单信息
	 */
	public void addOrders(Orders orders) {
		ordersDao.addOrders(orders);
		
	}
/**
 * 分页查询订单信息
 */
	public Pager queryOrders(String sqls, int pageSize, int page) {
		
		int allRow=ordersDao.getAllRowCount("from Orders");//总记录数
		int totalPage=Pager.countTotalPage(pageSize,allRow);//总页数
		final int offset=Pager.countOffset(pageSize,page);//当前页开始记录
		final int length=pageSize;//每页记录数
		final int currentPage=Pager.countCurrentPage(page);
		List<Orders> list=ordersDao.queryOrders(sqls,offset,length);//"一页"的记录

		//把分页信息保存到Bean中
		Pager pager=new Pager();
		pager.setPageSize(pageSize);
		pager.setCurrentPage(currentPage);
		pager.setAllRow(allRow);
		pager.setTotalPage(totalPage);
		pager.setList(list);
		pager.init();
		return pager;
			

	}
/**
 * 根据ID查询订单信息
 */
	public Orders queryOrdersById(Long id) {
		Orders orders=ordersDao.queryOrdersById(id);
		return orders;
	}
/**
 * 删除订单信息
 */
	public void removeOrders(Orders orders) {
		ordersDao.removeOrders(orders);
		
	}
/**
 * 更新订单信息
 */
	public void updateOrders(Orders orders) {
		ordersDao.updateOrders(orders);
		
	}
/**
 * 多表查询，所有信息
 */
public List<Object[]> mulqueryOrders(String sqls, int firstResult, int maxResult) {
	List<Object[]> list=ordersDao.mulqueryOrders(sqls, firstResult, maxResult);
	return list;
}
/**
 * 根据VIPID查询订单信息
 */
public List<Orders> myOrders(String hql, Long id) {
	List<Orders> list=ordersDao.myOrders(hql, id);
	return list;
}

}
