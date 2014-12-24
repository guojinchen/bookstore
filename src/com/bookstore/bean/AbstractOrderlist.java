package com.bookstore.bean;

import java.math.BigDecimal;


/**
 * AbstractOrderlist entity provides the base persistence definition of the Orderlist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrderlist  implements java.io.Serializable {


    // Fields    

     private BigDecimal listId;
     private Books books;
     private Orders orders;
     private Short count;


    // Constructors

    /** default constructor */
    public AbstractOrderlist() {
    }

    
    /** full constructor */
    public AbstractOrderlist(Books books, Orders orders, Short count) {
        this.books = books;
        this.orders = orders;
        this.count = count;
    }

   
    // Property accessors

    public BigDecimal getListId() {
        return this.listId;
    }
    
    public void setListId(BigDecimal listId) {
        this.listId = listId;
    }

    public Books getBooks() {
        return this.books;
    }
    
    public void setBooks(Books books) {
        this.books = books;
    }

    public Orders getOrders() {
        return this.orders;
    }
    
    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Short getCount() {
        return this.count;
    }
    
    public void setCount(Short count) {
        this.count = count;
    }
   








}