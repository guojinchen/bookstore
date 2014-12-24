package com.bookstore.service;

import java.util.List;

import com.bookstore.bean.Vips;
import com.bookstore.util.Pager;

public interface VipsService {
	
	/**
	 * �Ի�Ա��Ϣ����ȫ��ѯ
	 * 
	 */
	public List<Vips> queryAll(String hql);
	
	
	
	
	/**
	 * ���ӻ�Ա��Ϣ
	 * @param vips
	 */
public void addVips(Vips vips);

/**
 * ɾ����Ա
 * @param vips
 */
public void deleteVips(Vips vips);

/**
 * ���»�Ա��Ϣ
 * @param vips
 */
public void updateVips(Vips vips);

/**
 * ����ID��ѯ��Ա��Ϣ��һ�����ڸ���ǰ��ѯ
 * @param id
 * @return
 */
public Vips queryVips(Long id);

/**
 * ���ݻ�Ա������ѯ��Ա��Ϣ
 * @param name
 * @return
 */
public Pager queryVips(String hql,int pageSize,int currentPage);

/**
 * ����������ѯ
 * �޷�ҳ������
 */
public List<Vips> queryone(String hql,String name);

}
