package com.bookstore.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.bookstore.bean.Vips;
import com.bookstore.service.VipsService;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction  {
private Vips vip;
private VipsService vipsService;
public Vips getVip() {
	return vip;
}
public void setVip(Vips vip) {
	this.vip = vip;
}
public VipsService getVipsService() {
	return vipsService;
}
public void setVipsService(VipsService vipsService) {
	this.vipsService = vipsService;
}

public String execute(){

	String hql="select v from Vips v where v.passwords=?";
	try {
		
		String s = new String (vip.getUsername().getBytes("ISO-8859-1"),"utf-8");
		List<Vips> list=vipsService.queryone(hql, s);
		if(list.size()==1){
			Vips v=list.get(0);
			if(v.getUsername().equals(vip.getUsername())&&v.getPasswords().equals(vip.getPasswords())){
				ServletActionContext.getServletContext().setAttribute("login",v);
			//HttpSession session = 	ServletActionContext.getRequest().getSession();
			
			//session.setAttribute("login", v);
			
				System.out.println(v.getVipId());
				System.out.println(v.getRegistertime().toString());
				return "success";
			}			
		}
		ServletActionContext.getRequest().setAttribute("message","用户名或密码错误，请重新输入");
		return "fail";
	} catch (Exception e) {
		ServletActionContext.getRequest().setAttribute("message","用户名或密码错误，请重新输入");
		return"fail";
	}

		
}
}
