package com.bookstore.bean;


/**
 * Shoppingcar entity. @author MyEclipse Persistence Tools
 */

public class ShoppingCar  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 769399730810729062L;
	private Long carId;
     private Vips vips;
     private Books books;
     private int shopcount;


    // Constructors

    /** default constructor */
    public ShoppingCar() {
    }

    
    /** full constructor */
    public ShoppingCar(Vips vips, Books books, int shopcount) {
        this.vips = vips;
        this.books = books;
        this.shopcount = shopcount;
    }

   
    // Property accessors

    public Long getCarId() {
        return this.carId;
    }
    
    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Vips getVips() {
        return this.vips;
    }
    
    public void setVips(Vips vips) {
        this.vips = vips;
    }

    public Books getBooks() {
        return this.books;
    }
    
    public void setBooks(Books books) {
        this.books = books;
    }

    public int getShopcount() {
        return this.shopcount;
    }
    
    public void setShopcount(int shopcount) {
        this.shopcount = shopcount;
    }
}