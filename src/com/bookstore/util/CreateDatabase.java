package com.bookstore.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
*������
*/
public class CreateDatabase {
	public static void main(String[] args) {
		//��ȡhibernate.cfg.xml
		Configuration cfg = new Configuration().configure();
		//����database
		SchemaExport s = new SchemaExport(cfg);
		//����
		s.create(true, true);
	}
}
