package com.bookstore.bean;
// default package




/**
 * BookAdjust entity. @author MyEclipse Persistence Tools
 */

public class BookAdjust  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 2495925103932813692L;
	// Fields    

     private Long adjustId;
     private Books books;
     private Vips vips;
     private String adjustContent;
     private String adjustTime;


    // Constructors

    /** default constructor */
    public BookAdjust() {
    }

    
    /** full constructor */
    public BookAdjust(Books books, Vips vips, String adjustContent, String adjustTime) {
        this.books = books;
        this.vips = vips;
        this.adjustContent = adjustContent;
        this.adjustTime = adjustTime;
    }

   
    // Property accessors

    public Long getAdjustId() {
        return this.adjustId;
    }
    
    public void setAdjustId(Long adjustId) {
        this.adjustId = adjustId;
    }

    public Books getBooks() {
        return this.books;
    }
    
    public void setBooks(Books books) {
        this.books = books;
    }

    public Vips getVips() {
        return this.vips;
    }
    
    public void setVips(Vips vips) {
        this.vips = vips;
    }

    public String getAdjustContent() {
        return this.adjustContent;
    }
    
    public void setAdjustContent(String adjustContent) {
        this.adjustContent = adjustContent;
    }

    public String getAdjustTime() {
        return this.adjustTime;
    }
    
    public void setAdjustTime(String adjustTime) {
        this.adjustTime = adjustTime;
    }
   








}