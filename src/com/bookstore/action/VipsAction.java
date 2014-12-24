package com.bookstore.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.bookstore.bean.Vips;
import com.bookstore.service.VipsService;
import com.bookstore.util.Pager;
import com.opensymphony.xwork2.ActionContext;

public class VipsAction {
private List<Vips> vipsList;
private Vips vips;
private VipsService vipsService;
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
public List<Vips> getVipsList() {
	return vipsList;
}
public void setVipsList(List<Vips> vipsList) {
	this.vipsList = vipsList;
}
public Vips getVips() {
	return vips;
}
public void setVips(Vips vips) {
	this.vips = vips;
}
public VipsService getVipsService() {
	return vipsService;
}
public void setVipsService(VipsService vipsService) {
	this.vipsService = vipsService;
}


/**
 * 增加会员信息
 */
public String addVips(){
	vipsService.addVips(vips);
	return "success";
}
/**
 * 删除会员信息
 */
public String deleteVips(){
	vipsService.deleteVips(vips);
	return "success";
}
/**
 * 根据ID查询会员信息
 */
  public  String queryVip(){
	  
	 //   Vips vips =  (Vips) ActionContext.getContext().getApplication().get("login");
	    
	vips=vipsService.queryVips(vips.getVipId());
	return"success";
}
  /**
   * 更新会员信息
   */
  public String updateVip(){
	
	      
	 vipsService.updateVips(vips);
	
	 return"success";
  }
/**
 * 分页查询所有 的会员信息
 */
  public String  queryAllVip() {
	String hql="from Vips";
	pager=vipsService.queryVips(hql, 6, page);
	return "success";
}

/**
 * 根据会员姓名查询会员信息,wrong
 */
  public String queryOneVipName(){
	  String hql="select v from Vips v where v.username=? ";
	  vipsList=vipsService.queryone(hql, vips.getUsername());
	  return "success";
	  
	  
  }
}
