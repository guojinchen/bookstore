package com.bookstore.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
*测试类
*/
public class CreateDatabase {
	public static void main(String[] args) {
		//读取hibernate.cfg.xml
		Configuration cfg = new Configuration().configure();
		//创建database
		SchemaExport s = new SchemaExport(cfg);
		//建表
		s.create(true, true);
	}
}
