package com.bookstore.bean;
// default package

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


/**
 * BookTypes entity. @author MyEclipse Persistence Tools
 */

public class BookTypes  implements java.io.Serializable {

	private static final long serialVersionUID = -1726316948485149250L;
	private Long booktypeId;
     private String booktypeName;
     private Set bookses = new HashSet(0);


    // Constructors

    /** default constructor */
    public BookTypes() {
    }

    
    /** full constructor */
    public BookTypes(String booktypeName, Set bookses) {
        this.booktypeName = booktypeName;
        this.bookses = bookses;
    }

   
    // Property accessors

    public Long getBooktypeId() {
        return this.booktypeId;
    }
    
    public void setBooktypeId(Long booktypeId) {
        this.booktypeId = booktypeId;
    }

    public String getBooktypeName() {
        return this.booktypeName;
    }
    
    public void setBooktypeName(String booktypeName) {
        this.booktypeName = booktypeName;
    }

    public Set getBookses() {
        return this.bookses;
    }
    
    public void setBookses(Set bookses) {
        this.bookses = bookses;
    }
   








}