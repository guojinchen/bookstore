package com.bookstore.bean;

import java.math.BigDecimal;


/**
 * Orderlist entity. @author MyEclipse Persistence Tools
 */

public class OrderList  implements java.io.Serializable {


    // Fields    

     private Long listId;
     private Books books;
     private Orders orders;
     private int count;


    // Constructors

    /** default constructor */
    public OrderList() {
    }

    
    /** full constructor */
    public OrderList(Books books, Orders orders, Short count) {
        this.books = books;
        this.orders = orders;
        this.count = count;
    }

   
    // Property accessors

    public Long getListId() {
        return this.listId;
    }
    
    public void setListId(Long listId) {
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

    public int getCount() {
        return this.count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
   








}