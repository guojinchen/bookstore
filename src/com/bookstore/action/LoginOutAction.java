package com.bookstore.action;

import java.util.Map;
import java.util.Set;

import org.apache.struts2.ServletActionContext;

import com.bookstore.bean.Books;
import com.bookstore.bean.Vips;

public class LoginOutAction {
public String execute(){
	Map session=ServletActionContext.getContext().getSession();	
	ServletActionContext.getServletContext().removeAttribute("login");
	
	session.remove("set");
	session.put("item",0);
	session.put("count",0);
	session.put("amount",0);
	return"success";
}
}
