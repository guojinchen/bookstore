package com.bookstore.action;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;

import com.bookstore.bean.Books;
import com.bookstore.service.BooksService;

public class DetailsAction {		
 private Books book;	
 
private BooksService booksService;
	public Books getBook() {
	return book;
}

public void setBook(Books book) {
	this.book = book;
}

	public BooksService getBooksService() {
	return booksService;
}

public void setBooksService(BooksService booksService) {
	this.booksService = booksService;
}



	/**
		 * 读取表中的BLOB数据
	 * @throws SQLException 
		 * @throws SQLException
		 * @throws IOException
		 */
		public String execute(){
//			BigDecimal big=new BigDecimal(130002);
			book=booksService.queryBooksById(book.getBookId());
			Blob blob1=book.getInformation();
			Blob blob2=book.getBookDirectory();
			Blob blob3=book.getMaincontent();

			try {
				InputStream is1=blob1.getBinaryStream();
				InputStream is2=blob2.getBinaryStream();
				InputStream is3=blob3.getBinaryStream();
				StringBuffer info=new StringBuffer();
				StringBuffer directory=new StringBuffer();
				StringBuffer maincontent=new StringBuffer();
				byte[] buf = new byte[2048];
				int len;
				while((len = is1.read(buf)) != -1){
				info.append(new String(buf));
				}
				while((len = is2.read(buf)) != -1){
					directory.append(new String(buf));
					}
				while((len = is3.read(buf)) != -1){
					maincontent.append(new String(buf));
					}
				ServletActionContext.getServletContext().setAttribute("info",info);
				ServletActionContext.getServletContext().setAttribute("directory",directory);
				ServletActionContext.getServletContext().setAttribute("content",maincontent);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			return "success";
	}
		
	}
