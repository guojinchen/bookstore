package com.bookstore.action;

import org.aspectj.lang.reflect.AdviceSignature;

import com.bookstore.bean.Advice;
import com.bookstore.service.AdviceService;
import com.bookstore.util.Pager;

public class AdviceAction {
private AdviceService adviceService;
private int page;//�ڼ�ҳ
private Pager pager;//�����ֲ���Ϣ��bean
private Advice advice;
public AdviceService getAdviceService() {
	return adviceService;
}
public void setAdviceService(AdviceService adviceService) {
	this.adviceService = adviceService;
}
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public Pager getPager() {
	return pager;
}
public void setPager(Pager pager) {
	this.pager = pager;
}
public Advice getAdvice() {
	return advice;
}
public void setAdvice(Advice advice) {
	this.advice = advice;
}
/**
 * ��ѯ���н��飬��ҳ
 * @return pager
 */
public String queryAll(){
	String hql="from Advice";
	pager=adviceService.queryAdvice(hql, 5, page);
	return"success";
}
/**
 * ɾ�����飬
 * @return
 */
public String delAdvice(){
	adviceService.deleteAdvice(advice);
	return"success";
}

/**
 * ��ӽ���
 */
public String addAdvice(){
	adviceService.addAdvice(advice);
	return"success";
}
}
