package com.bookstore.test;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.bookstore.action.AdminsAction;
import com.bookstore.bean.Admins;
import com.bookstore.bean.Books;
import com.bookstore.bean.ShoppingCar;
import com.bookstore.service.AdminsService;
import com.bookstore.service.impl.AdminsServiceImpl;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		AdminsService adminsService=new AdminsServiceImpl();
//		Admins admins=adminsService.queryAdmins(new BigDecimal("100001"));
//		System.out.println(admins.getAdminName());
//		
//		Configuration cfg=new AnnotationConfiguration().configure();
//		SchemaExport sp=new SchemaExport(cfg);
//		sp.create(true,true);
		Books book=new Books();
		book.setBookName("1111");
		ShoppingCar car=new ShoppingCar();
		car.setBooks(book);
		System.out.println(car.getBooks().getBookName());
	}

}
