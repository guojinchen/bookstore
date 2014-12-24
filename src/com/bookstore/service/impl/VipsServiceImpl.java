package com.bookstore.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.bean.Vips;
import com.bookstore.dao.VipsDao;
import com.bookstore.service.VipsService;
import com.bookstore.util.Pager;

public class VipsServiceImpl implements VipsService {

	private VipsDao vipsDao;
	
	public VipsDao getVipsDao() {
		return vipsDao;
	}

	public void setVipsDao(VipsDao vipsDao) {
		this.vipsDao = vipsDao;
	}
/**
 * ��ӻ�Ա��Ϣ
 */
	public void addVips(Vips vips) {
		vipsDao.addVips(vips);
		
	}

	/**
	 * ɾ����Ա��Ϣ
	 */
	public void deleteVips(Vips vips) {
		vipsDao.deleteVips(vips);
		
	}
	/**
	 * ����id��ѯ��Ա��Ϣ
	 */

	public Vips queryVips(Long id) {
		Vips vips=vipsDao.queryVips(id);
		return vips;
	}
/**
 * ��ҳ��ѯ��Ա��Ϣ
 */
	public Pager queryVips(String hql, int pageSize, int page) {
		
		int allRow=vipsDao.getAllRowCount("from Vips");//�ܼ�¼��
		int totalPage=Pager.countTotalPage(pageSize,allRow);//��ҳ��
		final int offset=Pager.countOffset(pageSize,page);//��ǰҳ��ʼ��¼
		final int length=pageSize;//ÿҳ��¼��
		final int currentPage=Pager.countCurrentPage(page);
		List<Vips> vips=vipsDao.queryVips(hql, offset,length);//"һҳ"�ļ�¼

		//�ѷ�ҳ��Ϣ���浽Bean��
		Pager pager=new Pager();
		pager.setPageSize(pageSize);
		pager.setCurrentPage(currentPage);
		pager.setAllRow(allRow);
		pager.setTotalPage(totalPage);
		pager.setList(vips);
		pager.init();
		return pager;

	}
/**
 * ���»�Ա��Ϣ
 */
	public void updateVips(Vips vips) {
		vipsDao.updateVips(vips);
		
	}
/**
 * �޷�ҳ���������飬����
 */
public List<Vips> queryone(String hql, String name) {
	List<Vips> vip=vipsDao.queryone(hql, name);
	return vip;
}

public List<Vips> queryAll(String hql) {
	List<Vips> list =vipsDao.queryAll(hql);
	return list;
}

}
