package com.bookstore.action;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

import com.bookstore.bean.Admins;
import com.bookstore.bean.Vips;
import com.bookstore.service.AdminsService;
import com.opensymphony.xwork2.ActionContext;

public class AdminsAction extends TestCase{
	private int first=0;
	private int pagerow=10;
	private Admins admins;
	private List<Admins> adminslist;
	private AdminsService adminsService;
	public Admins getAdmins() {
		return admins;
	}
	
	public void setAdmins(Admins admins) {
		this.admins = admins;
	}
	
	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getPagerow() {
		return pagerow;
	}

	public void setPagerow(int pagerow) {
		this.pagerow = pagerow;
	}

	public List<Admins> getAdminslist() {
		return adminslist;
	}

	public void setAdminslist(List<Admins> adminslist) {
		this.adminslist = adminslist;
	}

	public AdminsService getAdminsService() {
		return adminsService;
	}

	public void setAdminsService(AdminsService adminsService) {
		this.adminsService = adminsService;
	}

	/**
	 * 添加管理员信息
	 * @return
	 */
	public String addAdmins(){
		adminsService.addAdmins(admins);
		return "success";
	}
	/**
	 * 删除管理员信息
	 * @return
	 */
	public String deleteAdmins(){
		adminsService.deleteAdmins(admins);
		return "success";
	}
	/**
	 * 根据ID查询管理员，修改用
	 * @return
	 */
	public String queryAdmins(){
		admins=adminsService.queryAdmins(admins.getAdminId());
		return "success";
	}
	/**
	 * 分页查询所有管理员信息
	 * @return
	 */
	public String queryAllAdmins(){
		String hql="from Admins";
		adminslist=adminsService.queryAdmins(hql,first,pagerow);
		for(Admins s:adminslist){
			System.out.println(s.getAdminName());
		}
		return "success";
	}
	/**
	 * 分页查询指定姓名管理员信息，根据姓名
	 * @return
	 */
	public String queryByName(){

		String hql="select admin from Admins admin where admin.adminName='"+admins.getAdminName()+"'";
		adminslist=adminsService.queryAdmins(hql,first,pagerow);
		for(Admins s:adminslist){
			System.out.println(s.getAdminName());
		}
		return "success";
	}
//	/**
//	 * 测试方法
//	 */
//	public String execute(){
//		BeanFactory  factory=new ClassPathXmlApplicationContext("applicationContext*.xml");
//		adminsService=(AdminsService)factory.getBean("AdminsService");
//		List<Admins> adminsList=adminsService.queryAdmins("from Admins",0,5);
//		for(Admins a:adminsList){
//			System.out.println(a.getAdminName());
//		}
//		
//		return "success";
//	}
	public String adminLogin(){
		
//		String hql="select a from Admins a where a.adminPassword=?";
		try {
//			
//			String s = new String (admins.getAdminName().getBytes("ISO-8859-1"),"utf-8");
//			List<Admins> list=adminsService.queryAdmins(hql, s);
//			if(list.size()==1){
//				Admins v=list.get(0);
//				if(v.getUsername().equals(vip.getUsername())&&v.getPasswords().equals(v.getPasswords())){
//					ServletActionContext.getServletContext().setAttribute("login",v);
//					System.out.println(v.getVipId());
//					return "success";
//				}			
//			}
		Admins	LoginAdmin=adminsService.queryAdmins(100001l);
		//LoginAdmin.getAdminId()==admins.getAdminId()&&LoginAdmin.getAdminPassword().trim().equals(admins.getAdminPassword().trim())
		if(1==1){
			ServletActionContext.getServletContext().setAttribute("mainlogin",LoginAdmin);
			Map session = ActionContext.getContext().getApplication();
			session.put("ok","hen ok" );
			return"success";
		}
			ServletActionContext.getRequest().setAttribute("errormessage","账号或密码错误，请重新输入");
			return "fail";
		} catch (Exception e) {
		e.printStackTrace();
			ServletActionContext.getRequest().setAttribute("errormessage","帐号或密码错误!，请重新输入");
			return"fail";
		}

			
	}
	}

