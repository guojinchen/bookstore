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
 * 添加会员信息
 */
	public void addVips(Vips vips) {
		vipsDao.addVips(vips);
		
	}

	/**
	 * 删除会员信息
	 */
	public void deleteVips(Vips vips) {
		vipsDao.deleteVips(vips);
		
	}
	/**
	 * 根据id查询会员信息
	 */

	public Vips queryVips(Long id) {
		Vips vips=vipsDao.queryVips(id);
		return vips;
	}
/**
 * 分页查询会员信息
 */
	public Pager queryVips(String hql, int pageSize, int page) {
		
		int allRow=vipsDao.getAllRowCount("from Vips");//总记录数
		int totalPage=Pager.countTotalPage(pageSize,allRow);//总页数
		final int offset=Pager.countOffset(pageSize,page);//当前页开始记录
		final int length=pageSize;//每页记录数
		final int currentPage=Pager.countCurrentPage(page);
		List<Vips> vips=vipsDao.queryVips(hql, offset,length);//"一页"的记录

		//把分页信息保存到Bean中
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
 * 更新会员信息
 */
	public void updateVips(Vips vips) {
		vipsDao.updateVips(vips);
		
	}
/**
 * 无分页，按姓名查，带参
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
