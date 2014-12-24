package com.bookstore.action;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.ServletActionContext;

import com.bookstore.bean.Books;
import com.bookstore.bean.OrderList;
import com.bookstore.bean.Orders;
import com.bookstore.bean.ShoppingCar;
import com.bookstore.bean.Vips;
import com.bookstore.service.BooksService;
import com.bookstore.service.OrderListService;
import com.bookstore.service.OrdersService;
import com.bookstore.service.ShoppingCarService;
import com.bookstore.service.VipsService;

public class OrderAddAction {
private OrdersService ordersService;
private VipsService vipsService;
private OrderListService orderListService;
private ShoppingCarService shoppingCarService;
private BooksService booksService;
private Orders order;
private OrderList orderList;
public OrdersService getOrdersService() {
	return ordersService;
}


public void setOrdersService(OrdersService ordersService) {
	this.ordersService = ordersService;
}


public Orders getOrder() {
	return order;
}


public void setOrder(Orders order) {
	this.order = order;
}




public VipsService getVipsService() {
	return vipsService;
}


public void setVipsService(VipsService vipsService) {
	this.vipsService = vipsService;
}




public OrderListService getOrderListService() {
	return orderListService;
}


public void setOrderListService(OrderListService orderListService) {
	this.orderListService = orderListService;
}




public OrderList getOrderList() {
	return orderList;
}


public void setOrderList(OrderList orderList) {
	this.orderList = orderList;
}





public ShoppingCarService getShoppingCarService() {
	return shoppingCarService;
}


public void setShoppingCarService(ShoppingCarService shoppingCarService) {
	this.shoppingCarService = shoppingCarService;
}


public BooksService getBooksService() {
	return booksService;
}


public void setBooksService(BooksService booksService) {
	this.booksService = booksService;
}


public String addOrderInfo(){
	try {
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
	String s1=ServletActionContext.getRequest().getParameter("paytype");
	order.setPayType(s1);
	order.setIsAffirm("否");
	order.setIsPay("否");
	order.setIsSave("否");
	order.setIsSendbook("否");
	order.setTotalPrice((Double)ServletActionContext.getContext().getSession().get("amount"));
	Vips vip=(Vips) ServletActionContext.getServletContext().getAttribute("login");
//	System.out.println(vip);
//	System.out.println(vip.getVipId());
//	System.out.println(vip.getVipId().TYPE);
	vip=vipsService.queryVips(vip.getVipId().longValue());//在进行更新前要先进行查询。
	vipsService.updateVips(vip);
	order.setVips(vip);
	Date date = new Date();//获得系统时间.
    String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);//将时间格式转换成符合Timestamp要求的格式.
    Timestamp datetime = Timestamp.valueOf(nowTime);//把时间转换
       
	order.setOverTime(datetime);
	ordersService.addOrders(order);//保存订单信息
	
	System.out.println("保存订单信息");
	
	/**
	 * 保存订单列表orderlist
	 */
	Map session=ServletActionContext.getContext().getSession();	
	Set<Books> books=(Set<Books>)session.get("set");
	int[] s=(int[])session.get("count");
	for(Books b:books){
		System.out.println(b.getBookName()+"下定单时");
	}
	
	OrderList l=new OrderList();
	List<Books> list1=new ArrayList<Books>();
	List<OrderList> list=new ArrayList<OrderList>();
	int i=0;
	for(Books b:books){
		int count=s[i++];
		//保存前持久化Books对象
		Books bs=booksService.queryBooksById(b.getBookId());
		//更新BOOK表的库存信息
		bs.setAllsum(bs.getAllsum()-count);
		bs.setSellsum(bs.getSellsum()+count);
		booksService.updateBooks(bs);
		//设置orderList，并保存
		l.setOrders(order);
		l.setBooks(bs);
		l.setCount(count);
		list.add(l);
		list1.add(bs);
		orderListService.addOrderList(l);

	
	}
	
	session.put("list2",list);
	session.put("list1",list1);
	System.out.println("保存订单列表");
	
	/**
	 * 删除购物车表中的信息
	 */
	//删除已经下订单的购物车信息
	String sqls="select s from ShoppingCar s where s.vips.vipId=? ";
	List<ShoppingCar> car=shoppingCarService.queryShoppingCar(sqls, vip.getVipId().longValue());
	for(ShoppingCar c:car){
		shoppingCarService.removeShoppingCar(c);
	}
	//清空SESSION中的购物信息
	session.remove("set");
	session.put("count",0);
	session.put("amount",0);
	session.put("item",0);
	System.out.println("删除已经下订单的购物车信息");
	//删除没有登录用户又没有下订单的购物车信息
	String hql="select s from ShoppingCar s where s.vips.vipId=null ";
	List<ShoppingCar> cs=shoppingCarService.queryShoppingCar(hql);
	for(ShoppingCar c:cs){
		shoppingCarService.removeShoppingCar(c);
	}
	
	System.out.println("删除没有登录用户又没有下订单的购物车信息");

	
	return"success";
	
}
}
