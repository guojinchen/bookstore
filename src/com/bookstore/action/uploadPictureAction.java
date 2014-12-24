package com.bookstore.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.bookstore.bean.Books;
import com.bookstore.service.BooksService;
import com.opensymphony.xwork2.ActionSupport;

public class uploadPictureAction extends ActionSupport{
    private static final long serialVersionUID = -7887613751080170362L;
   private String title;//设置上传文件的标题
    private File upload;//封装上传文件
    private String uploadFileName;//设置上传文件的文件名
    private String uploadContentType;//上传文件的类型
    private String savePath;//上传文件的保存路径
    private BooksService booksService;
    private Books imgbook;
    
    public BooksService getBooksService() {
		return booksService;
	}
	public void setBooksService(BooksService booksService) {
		this.booksService = booksService;
	}
	public Books getImgbook() {
		return imgbook;
	}
	public void setImgbook(Books imgbook) {
		this.imgbook = imgbook;
	}
	public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public File getUpload() {
        return upload;
    }
    public void setUpload(File upload) {
        this.upload = upload;
    }
    
    public String getUploadFileName() {
        return uploadFileName;
    }
    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }
    public String getUploadContentType() {
        return uploadContentType;
    }
    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }
    public String getSavePath() {
        System.out.println(ServletActionContext.getServletContext().getRealPath(savePath));//获取绝对路径
        return ServletActionContext.getServletContext().getRealPath(savePath);
    }
    public void setSavePath(String savePath) {
        this.savePath = savePath;
        System.out.println("savePath: "+savePath);
    }
    public String execute()throws Exception{
    	File file=new File(getSavePath());
    	File[] files=file.listFiles();
    	for(int i=0;i<files.length;i++){
    		if(files[i].getName().equals(getUploadFileName())){
    			setUploadFileName("1"+getUploadFileName());
    		}
    	}
        FileOutputStream fos=new FileOutputStream(getSavePath()+"\\"+getUploadFileName());
        FileInputStream fis=new FileInputStream(getUpload());
        byte[] buffer=new byte[1024];
        int len=0;
        while((len=fis.read(buffer))>0){
            fos.write(buffer, 0, len);
        }
        imgbook=booksService.queryBooksById(imgbook.getBookId());//根据隐藏域传过来的ID，查到相应的BOOK
        imgbook.setBookImage("upload/"+getUploadFileName());
        booksService.updateBooks(imgbook);//更新数据库中的图片信息
        return SUCCESS;
    }
}