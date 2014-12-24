package com.bookstore.service.impl;



import java.util.List;

import com.bookstore.bean.Advice;

import com.bookstore.dao.AdviceDao;
import com.bookstore.service.AdviceService;
import com.bookstore.util.Pager;

public class AdviceServiceImpl  implements AdviceService {
	private AdviceDao adviceDao;
	
	
	public AdviceDao getAdviceDao() {
		return adviceDao;
	}

	public void setAdviceDao(AdviceDao adviceDao) {
		this.adviceDao = adviceDao;
	}

	public void addAdvice(Advice advice) {
		adviceDao.addAdvice(advice);
		
	}

	public void deleteAdvice(Advice advice) {
		adviceDao.deleteAdvice(advice);
		
	}

	public Pager queryAdvice(String hql, int pageSize, int page) {
		int allRow=adviceDao.getAllRowCount("from Advice");//�ܼ�¼��
		int totalPage=Pager.countTotalPage(pageSize,allRow);//��ҳ��
		final int offset=Pager.countOffset(pageSize,page);//��ǰҳ��ʼ��¼
		final int length=pageSize;//ÿҳ��¼��
		final int currentPage=Pager.countCurrentPage(page);
		List<Advice> vips=adviceDao.queryAdvice(hql, offset,length);//"һҳ"�ļ�¼

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

	public Advice queryAdvice(Long id) {
		Advice advice=adviceDao.queryAdvice(id);
		return advice;
	}

	public void updateAdvice(Advice advice) {
		adviceDao.updateAdvice(advice);
		
	}

}
