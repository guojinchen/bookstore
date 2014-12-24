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
	 * ��Ӷ�����Ϣ
	 */
	public void addOrders(Orders orders) {
		ordersDao.addOrders(orders);
		
	}
/**
 * ��ҳ��ѯ������Ϣ
 */
	public Pager queryOrders(String sqls, int pageSize, int page) {
		
		int allRow=ordersDao.getAllRowCount("from Orders");//�ܼ�¼��
		int totalPage=Pager.countTotalPage(pageSize,allRow);//��ҳ��
		final int offset=Pager.countOffset(pageSize,page);//��ǰҳ��ʼ��¼
		final int length=pageSize;//ÿҳ��¼��
		final int currentPage=Pager.countCurrentPage(page);
		List<Orders> list=ordersDao.queryOrders(sqls,offset,length);//"һҳ"�ļ�¼

		//�ѷ�ҳ��Ϣ���浽Bean��
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
 * ����ID��ѯ������Ϣ
 */
	public Orders queryOrdersById(Long id) {
		Orders orders=ordersDao.queryOrdersById(id);
		return orders;
	}
/**
 * ɾ��������Ϣ
 */
	public void removeOrders(Orders orders) {
		ordersDao.removeOrders(orders);
		
	}
/**
 * ���¶�����Ϣ
 */
	public void updateOrders(Orders orders) {
		ordersDao.updateOrders(orders);
		
	}
/**
 * ����ѯ��������Ϣ
 */
public List<Object[]> mulqueryOrders(String sqls, int firstResult, int maxResult) {
	List<Object[]> list=ordersDao.mulqueryOrders(sqls, firstResult, maxResult);
	return list;
}
/**
 * ����VIPID��ѯ������Ϣ
 */
public List<Orders> myOrders(String hql, Long id) {
	List<Orders> list=ordersDao.myOrders(hql, id);
	return list;
}

}
