package com.bookstore.dao;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Admins;

public interface AdminsDao {
	/**
	 * ��ӹ���Ա��Ϣ
	 * @param admins
	 */
public void addAdmins(Admins admins);

/**
 * ɾ������Ա��Ϣ
 * @param admins
 */
public void deleteAdmins(Admins admins);

/**
 * ���¹���Ա��Ϣ
 * @param admins
 */
public void updateAdmins(Admins admins);

/**
 * ��ѯ����Ա��Ϣ�����ݴ����hql
 * @param name
 * @return�������е��û��б�
 */
public  List<Admins> queryAdmins(String hql,int first,int pagerow );
/**
 * ��ѯ����Ա��Ϣ�����ݴ����hql,����
 * @param name
 * @return�������е��û��б�
 */
public  List<Admins> queryAdmins(String hql,String s );

/**
 *����ID��ѯ����Ա��Ϣ���ڸ��¹���Ա��Ϣʱ��ѯ��
 * @param id
 * @return
 */
public Admins queryAdmins(Long id);
/**
 * ��ѯ���м�¼��
 */
public int getAllRowCount(String hql);

}
