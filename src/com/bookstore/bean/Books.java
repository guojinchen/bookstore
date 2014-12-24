package com.bookstore.bean;
// default package


import java.sql.Blob;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Books entity. @author MyEclipse Persistence Tools
 */

public class Books  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = -7519950831696232614L;
	// Fields    

     /**
	 * 
	 */

	private Long bookId;
     private BookTypes bookTypes;
     private String bookName;
     private String bookAuthor;
     private Long allsum;
     private Long sellsum;
     private Double price;
     private Blob information;
     private String checked;
     private Double discountprice;
     private Timestamp publishtime;
     private String bookImage;
     private Long bookPages;
     private String languages;
     private Long words;
     private Blob maincontent;//将数据类型改为Blob
     private String authorInfo;
     private Blob bookDirectory;//将数据类型改为Blob
     private String publisher;
     private Set bookAdjusts = new HashSet(0);
     private Set orderLists = new HashSet(0);
  

    // Constructors

    /** default constructor */
    public Books() {
    }

    
    /** full constructor */
    public Books(BookTypes bookTypes, String bookName, String bookAuthor, Long allsum, Long sellsum, Double price, Blob information, String checked, Double discountprice, Timestamp publishtime, String bookImage, Long bookPages, String languages, Long words, Blob maincontent, String authorInfo, Blob bookDirectory, String publisher, Set bookAdjusts, Set orderLists) {
        this.bookTypes = bookTypes;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.allsum = allsum;
        this.sellsum = sellsum;
        this.price = price;
        this.information = information;
        this.checked = checked;
        this.discountprice = discountprice;
        this.publishtime = publishtime;
        this.bookImage = bookImage;
        this.bookPages = bookPages;
        this.languages = languages;
        this.words = words;
        this.maincontent = maincontent;
        this.authorInfo = authorInfo;
        this.bookDirectory = bookDirectory;
        this.publisher = publisher;
        this.bookAdjusts = bookAdjusts;
        this.orderLists = orderLists;
    }

   
    // Property accessors

    public Long getBookId() {
        return this.bookId;
    }
    
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public BookTypes getBookTypes() {
        return this.bookTypes;
    }
    
    public void setBookTypes(BookTypes bookTypes) {
        this.bookTypes = bookTypes;
    }

    public String getBookName() {
        return this.bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }
    
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Long getAllsum() {
        return this.allsum;
    }
    
    public void setAllsum(Long allsum) {
        this.allsum = allsum;
    }

    public Long getSellsum() {
        return this.sellsum;
    }
    
    public void setSellsum(Long sellsum) {
        this.sellsum = sellsum;
    }

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public Blob getInformation() {
        return this.information;
    }
    
    public void setInformation(Blob information) {
        this.information = information;
    }

    public String getChecked() {
        return this.checked;
    }
    
    public void setChecked(String checked) {
        this.checked = checked;
    }

    public Double getDiscountprice() {
        return this.discountprice;
    }
    
    public void setDiscountprice(Double discountprice) {
        this.discountprice = discountprice;
    }

    public Timestamp getPublishtime() {
        return this.publishtime;
    }
    
    public void setPublishtime(Timestamp publishtime) {
        this.publishtime = publishtime;
    }

    public String getBookImage() {
        return this.bookImage;
    }
    
    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public Long getBookPages() {
        return this.bookPages;
    }
    
    public void setBookPages(Long bookPages) {
        this.bookPages = bookPages;
    }

    public String getLanguages() {
        return this.languages;
    }
    
    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Long getWords() {
        return this.words;
    }
    
    public void setWords(Long words) {
        this.words = words;
    }

    public Blob getMaincontent() {
        return this.maincontent;
    }
    
    public void setMaincontent(Blob maincontent) {
        this.maincontent = maincontent;
    }

    public String getAuthorInfo() {
        return this.authorInfo;
    }
    
    public void setAuthorInfo(String authorInfo) {
        this.authorInfo = authorInfo;
    }

    public Blob getBookDirectory() {
        return this.bookDirectory;
    }
    
    public void setBookDirectory(Blob bookDirectory) {
        this.bookDirectory = bookDirectory;
    }

    public String getPublisher() {
        return this.publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set getBookAdjusts() {
        return this.bookAdjusts;
    }
    
    public void setBookAdjusts(Set bookAdjusts) {
        this.bookAdjusts = bookAdjusts;
    }

    public Set getOrderLists() {
        return this.orderLists;
    }
    
    public void setOrderLists(Set orderLists) {
        this.orderLists = orderLists;
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		return true;
	}



	
}