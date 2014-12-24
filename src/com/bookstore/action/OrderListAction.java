package com.bookstore.action;

import java.util.List;

import com.bookstore.bean.OrderList;
import com.bookstore.service.OrderListService;

public class OrderListAction {
private int firstResult=0;
private int maxResult=10;
private OrderListService orderListService;
private List<OrderList> list;
private OrderList orderList;
public int getFirstResult() {
	return firstResult;
}
public void setFirstResult(int firstResult) {
	this.firstResult = firstResult;
}
public int getMaxResult() {
	return maxResult;
}
public void setMaxResult(int maxResult) {
	this.maxResult = maxResult;
}
public OrderListService getOrderListService() {
	return orderListService;
}
public void setOrderListService(OrderListService orderListService) {
	this.orderListService = orderListService;
}
public List<OrderList> getList() {
	return list;
}
public void setList(List<OrderList> list) {
	this.list = list;
}
public OrderList getOrderList() {
	return orderList;
}
public void setOrderList(OrderList orderList) {
	this.orderList = orderList;
}

public String addOrderList(){
	orderListService.addOrderList(orderList);
	return"success";
}
public String deleteOrderList(){
	orderListService.removeOrderList(orderList);
	return"success";
}
public String updateOrderList(){
	orderListService.updateOrderList(orderList);
	return"success";
}
public String queryOneOrderList(){
	orderList=orderListService.queryOrderListById(orderList.getListId());
	return"success";
}
public String queryAllOrderList(){
	String sqls="from OrderList";
	list=orderListService.queryOrderList(sqls, firstResult, maxResult);
	return"success";
}

}
