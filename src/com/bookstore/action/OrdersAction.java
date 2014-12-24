package com.bookstore.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.bookstore.bean.OrderList;
import com.bookstore.bean.Orders;
import com.bookstore.bean.Vips;
import com.bookstore.service.OrderListService;
import com.bookstore.service.OrdersService;
import com.bookstore.util.Pager;

public class OrdersAction {
private Orders orders;
private OrdersService ordersService;
private OrderListService orderListService;
private List<Orders> list;
private List<Object[]> detail;
private int page;//第几页
private Pager pager;//包含分布信息的bean




public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public Pager getPager() {
	return pager;
}
public void setPager(Pager pager) {
	this.pager = pager;
}
public Orders getOrders() {
	return orders;
}
public void setOrders(Orders orders) {
	this.orders = orders;
}
public OrdersService getOrdersService() {
	return ordersService;
}
public void setOrdersService(OrdersService ordersService) {
	this.ordersService = ordersService;
}

public List<Orders> getList() {
	return list;
}
public void setList(List<Orders> list) {
	this.list = list;
}

public List<Object[]> getDetail() {
	return detail;
}
public void setDetail(List<Object[]> detail) {
	this.detail = detail;
}



public OrderListService getOrderListService() {
	return orderListService;
}
public void setOrderListService(OrderListService orderListService) {
	this.orderListService = orderListService;
}
public String addOrders(){
	ordersService.addOrders(orders);
	return "success";
}	
public String deleteOrders(){
	String sqls="select ol from OrderList ol where ol.orders.orderId=?";
	List<OrderList> orderlists=orderListService.queryOrder(sqls, orders.getOrderId());
	for(OrderList l:orderlists){
		orderListService.removeOrderList(l);
	}	
	ordersService.removeOrders(orders);
	return"success";
}

	public String updateOrders(){
		String s=ServletActionContext.getRequest().getParameter("paytype");
		orders.setPayType(s);
		ordersService.updateOrders(orders);
		return"success";
	}
	public String queryOneOrders(){
		orders=ordersService.queryOrdersById(orders.getOrderId());
		return"success";		
	}
	
public String ordersDetail(){
	orders=ordersService.queryOrdersById(orders.getOrderId());
	String sqls="select ol,b from OrderList ol left outer join ol.books b where ol.orders.orderId=? ";
	detail=orderListService.queryOrderList(sqls,orders.getOrderId());
	return"success";
}

	
	
	public String queryAllOrders(){
		//String  sqls="select o,b from OrderList ol inner join ol.orders as o inner join ol.books as b" ;
		String sqls="from Orders";
		this.pager=ordersService.queryOrders(sqls,7,page);
//		for(Object[] o:list){
//			System.out.println(o);
//		}
		
		return"success";
	}

	public String myOrders(){
		String hql="select o from Orders o left outer join o.vips v where v.vipId=?";
		try{
			Vips vip=(Vips) ServletActionContext.getServletContext().getAttribute("login");//获取登录对象
			list=ordersService.myOrders(hql, vip.getVipId());
		}catch(NullPointerException e){
			return "fail";
		}	
//		String sqls="select ol,b from OrderList ol left outer join ol.books b where ol.orders.orderId=? ";
//		detail=orderListService.queryOrderList(sqls,orders.getOrderId());
		return"success";
	}


public String queryone(){
	//String  sqls="select o,b from OrderList ol inner join ol.orders as o inner join ol.books as b" ;
	String si=ServletActionContext.getRequest().getParameter("id").trim();
	try{
		Long id=Long.parseLong(si);
		String sqls="select o from Orders o where o.orderId="+id;
		this.page=1;
		this.pager=ordersService.queryOrders(sqls,7,page);
	}catch(Exception e){
		ServletActionContext.getRequest().setAttribute("message","输入的订单号有误，请重新输入");
	}
	

	
//	for(Object[] o:list){
//		System.out.println(o);
//	}
	
	return"success";
}

}