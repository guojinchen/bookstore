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
private int page;//�ڼ�ҳ
private Pager pager;//�����ֲ���Ϣ��bean


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
 * ���ӻ�Ա��Ϣ
 */
public String addVips(){
	vipsService.addVips(vips);
	return "success";
}
/**
 * ɾ����Ա��Ϣ
 */
public String deleteVips(){
	vipsService.deleteVips(vips);
	return "success";
}
/**
 * ����ID��ѯ��Ա��Ϣ
 */
  public  String queryVip(){
	  
	 //   Vips vips =  (Vips) ActionContext.getContext().getApplication().get("login");
	    
	vips=vipsService.queryVips(vips.getVipId());
	return"success";
}
  /**
   * ���»�Ա��Ϣ
   */
  public String updateVip(){
	
	      
	 vipsService.updateVips(vips);
	
	 return"success";
  }
/**
 * ��ҳ��ѯ���� �Ļ�Ա��Ϣ
 */
  public String  queryAllVip() {
	String hql="from Vips";
	pager=vipsService.queryVips(hql, 6, page);
	return "success";
}

/**
 * ���ݻ�Ա������ѯ��Ա��Ϣ,wrong
 */
  public String queryOneVipName(){
	  String hql="select v from Vips v where v.username=? ";
	  vipsList=vipsService.queryone(hql, vips.getUsername());
	  return "success";
	  
	  
  }
}
