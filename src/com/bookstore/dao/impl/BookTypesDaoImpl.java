package com.bookstore.dao.impl;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.bookstore.bean.BookTypes;
import com.bookstore.dao.BookTypesDao;
import com.bookstore.util.PageQuery;
/**
 * 书籍类型的增删改查
 * @author Administrator
 *
 */
public class BookTypesDaoImpl extends HibernateDaoSupport implements BookTypesDao{

	public void addBookTypes(BookTypes bookTypes) {
		this.getHibernateTemplate().save(bookTypes);
	}

	public List<BookTypes> queryBookTypes(String sqls, int firstResult,
			int maxResult) {
		HibernateCallback pagerQuery=new PageQuery(sqls,firstResult,maxResult);	
		List<BookTypes> booksTypeses=this.getHibernateTemplate().executeFind(pagerQuery);
		return booksTypeses;
	}

	public BookTypes queryBookTypesById(Long id) {
		BookTypes bookTypes=(BookTypes)this.getHibernateTemplate().get(BookTypes.class, id);
		return bookTypes;
	}

	public void removeBookTypes(BookTypes bookTypes) {
		this.getHibernateTemplate().delete(bookTypes);
	}

	public void updateBookTypes(BookTypes bookTypes) {
		this.getHibernateTemplate().update(bookTypes);
	}

	public List<BookTypes> queryBookTypes(String sqls) {
		List<BookTypes> typelist=this.getHibernateTemplate().find(sqls);
		return typelist;
	}
/**
 * 在更新书籍信息时，查找书类名对应的类型，再更新
 */
	public List<BookTypes> queryBookTypes(String sqls, String typename) {
		List<BookTypes> typelist=this.getHibernateTemplate().find(sqls,typename);
		return typelist;
	}
	/**
	 * 查询所有记录数
	 */
		public int getAllRowCount(String hql) {
			return this.getHibernateTemplate().find(hql).size();
		}

}
