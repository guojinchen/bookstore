package com.bookstore.action;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.bookstore.bean.Vips;
import com.bookstore.service.VipsService;
import com.bookstore.util.Pager;

public class RegisterAction {
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

public String registerter(){
	Date date = new Date();//获得系统时间.
    String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);//将时间格式转换成符合Timestamp要求的格式.
    Timestamp datetime = Timestamp.valueOf(nowTime);//把时间转换
    vip.setRegistertime(datetime);
	vipsService.addVips(vip);
	ServletActionContext.getServletContext().setAttribute("login",vip);
	return"success";
}
public void registertwo() throws IOException{
	HttpServletRequest request = ServletActionContext.getRequest();
	String name = request.getParameter("username");
	System.out.println(name);
	String hql = "from Vips";
	String message = "";
	List<Vips> list = vipsService.queryAll(hql);
	for(int i=0;i<list.size();i++){
		Vips v = list.get(i);
		if(v.getUsername().equals(name)){
			message = "用户名已存在,请重新输入";		
		}
    }
	HttpServletResponse response = ServletActionContext.getResponse();
	response.setCharacterEncoding("UTF-8");
	PrintWriter out = response.getWriter();
	out.println(message);
}
}
