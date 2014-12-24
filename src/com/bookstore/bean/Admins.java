package com.bookstore.bean;
// default package



/**
 * Admins entity. @author MyEclipse Persistence Tools
 */

public class Admins  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -8349650497230484678L;
	private Long adminId;
     private String adminName;
     private String adminPassword;


    // Constructors

    /** default constructor */
    public Admins() {
    }

    
    /** full constructor */
    public Admins(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

   
    // Property accessors

    public Long getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return this.adminName;
    }
    
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return this.adminPassword;
    }
    
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
   








}