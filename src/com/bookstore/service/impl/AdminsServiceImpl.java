package com.bookstore.service.impl;

import java.math.BigDecimal;
import java.util.List;
import com.bookstore.bean.Admins;
import com.bookstore.dao.AdminsDao;
import com.bookstore.service.AdminsService;

public class AdminsServiceImpl implements AdminsService {
 
	private AdminsDao adminsDao;
 
	public AdminsDao getAdminsDao() {
	return adminsDao;
}

public void setAdminsDao(AdminsDao adminsDao) {
	this.adminsDao = adminsDao;
}
/**
 * ��ӹ���Ա��Ϣ
 */
	public void addAdmins(Admins admins) {
	adminsDao.addAdmins(admins);		
	}
	/**
	 * ɾ������Ա��Ϣ
	 */

	public void deleteAdmins(Admins admins) {
		adminsDao.deleteAdmins(admins);
	}

	/**
	 * ����ID��ѯ����Ա��Ϣ���޸�ǰ
	 */
	public Admins queryAdmins(Long id) {
		Admins admins=adminsDao.queryAdmins(id);
		return admins;
	}
/**
 * ���¹���Ա��Ϣ
 */

	public void updateAdmins(Admins admins) {
		adminsDao.updateAdmins(admins);
		
	}

	public List<Admins> queryAdmins(String hql, int first, int pagerow) {
		List<Admins> adminslist=adminsDao.queryAdmins(hql, first, pagerow);
		return adminslist;
	}
	/**
	 * ��ѯ����Ա��Ϣ�����ݴ����hql,����
	 * @param name
	 * @return�������е��û��б�
	 */
	public List<Admins> queryAdmins(String hql, String s) {
		List<Admins> list=adminsDao.queryAdmins(hql, s);
		return list;
	}

}
