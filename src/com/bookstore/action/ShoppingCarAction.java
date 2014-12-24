package com.bookstore.action;

import java.util.List;

import com.bookstore.bean.ShoppingCar;
import com.bookstore.service.ShoppingCarService;

public class ShoppingCarAction {
private int firstResult=0;
private int maxResult=10;
private ShoppingCar shoppingCar;
private ShoppingCarService shoppingCarService;
private List<ShoppingCar> list;
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
public ShoppingCar getShoppingCar() {
	return shoppingCar;
}
public void setShoppingCar(ShoppingCar shoppingCar) {
	this.shoppingCar = shoppingCar;
}
public ShoppingCarService getShoppingCarService() {
	return shoppingCarService;
}
public void setShoppingCarService(ShoppingCarService shoppingCarService) {
	this.shoppingCarService = shoppingCarService;
}
public List<ShoppingCar> getList() {
	return list;
}
public void setList(List<ShoppingCar> list) {
	this.list = list;
}
public String addShoppingCar(){
	shoppingCarService.addShoppingCar(shoppingCar);
	return"success";
}
public String deleteShoppingCar(){
	shoppingCarService.removeShoppingCar(shoppingCar);
	return"success";
}
public String updateShoppingCar(){
	shoppingCarService.updateShoppingCar(shoppingCar);
	return "success";
}
public String queryOneShoppingCar(){
	shoppingCar=shoppingCarService.queryShoppingCarById(shoppingCar.getBooks().getBookId());
	return"success";
}
//public String queryAllShoppingCar(){
//	String sqls="from ShoppingCar";
//	list=shoppingCarService.queryShoppingCar(sqls, null);
//	return"success";
//	
//}

}
