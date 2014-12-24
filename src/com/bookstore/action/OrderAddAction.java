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
	order.setIsAffirm("��");
	order.setIsPay("��");
	order.setIsSave("��");
	order.setIsSendbook("��");
	order.setTotalPrice((Double)ServletActionContext.getContext().getSession().get("amount"));
	Vips vip=(Vips) ServletActionContext.getServletContext().getAttribute("login");
//	System.out.println(vip);
//	System.out.println(vip.getVipId());
//	System.out.println(vip.getVipId().TYPE);
	vip=vipsService.queryVips(vip.getVipId().longValue());//�ڽ��и���ǰҪ�Ƚ��в�ѯ��
	vipsService.updateVips(vip);
	order.setVips(vip);
	Date date = new Date();//���ϵͳʱ��.
    String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);//��ʱ���ʽת���ɷ���TimestampҪ��ĸ�ʽ.
    Timestamp datetime = Timestamp.valueOf(nowTime);//��ʱ��ת��
       
	order.setOverTime(datetime);
	ordersService.addOrders(order);//���涩����Ϣ
	
	System.out.println("���涩����Ϣ");
	
	/**
	 * ���涩���б�orderlist
	 */
	Map session=ServletActionContext.getContext().getSession();	
	Set<Books> books=(Set<Books>)session.get("set");
	int[] s=(int[])session.get("count");
	for(Books b:books){
		System.out.println(b.getBookName()+"�¶���ʱ");
	}
	
	OrderList l=new OrderList();
	List<Books> list1=new ArrayList<Books>();
	List<OrderList> list=new ArrayList<OrderList>();
	int i=0;
	for(Books b:books){
		int count=s[i++];
		//����ǰ�־û�Books����
		Books bs=booksService.queryBooksById(b.getBookId());
		//����BOOK��Ŀ����Ϣ
		bs.setAllsum(bs.getAllsum()-count);
		bs.setSellsum(bs.getSellsum()+count);
		booksService.updateBooks(bs);
		//����orderList��������
		l.setOrders(order);
		l.setBooks(bs);
		l.setCount(count);
		list.add(l);
		list1.add(bs);
		orderListService.addOrderList(l);

	
	}
	
	session.put("list2",list);
	session.put("list1",list1);
	System.out.println("���涩���б�");
	
	/**
	 * ɾ�����ﳵ���е���Ϣ
	 */
	//ɾ���Ѿ��¶����Ĺ��ﳵ��Ϣ
	String sqls="select s from ShoppingCar s where s.vips.vipId=? ";
	List<ShoppingCar> car=shoppingCarService.queryShoppingCar(sqls, vip.getVipId().longValue());
	for(ShoppingCar c:car){
		shoppingCarService.removeShoppingCar(c);
	}
	//���SESSION�еĹ�����Ϣ
	session.remove("set");
	session.put("count",0);
	session.put("amount",0);
	session.put("item",0);
	System.out.println("ɾ���Ѿ��¶����Ĺ��ﳵ��Ϣ");
	//ɾ��û�е�¼�û���û���¶����Ĺ��ﳵ��Ϣ
	String hql="select s from ShoppingCar s where s.vips.vipId=null ";
	List<ShoppingCar> cs=shoppingCarService.queryShoppingCar(hql);
	for(ShoppingCar c:cs){
		shoppingCarService.removeShoppingCar(c);
	}
	
	System.out.println("ɾ��û�е�¼�û���û���¶����Ĺ��ﳵ��Ϣ");

	
	return"success";
	
}
}
