	package com.bookstore.action;
	
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Set;
	
	import org.apache.struts2.ServletActionContext;
	
	import com.bookstore.bean.Books;
	import com.bookstore.bean.ShoppingCar;
	import com.bookstore.bean.Vips;
import com.bookstore.service.BooksService;
import com.bookstore.service.ShoppingCarService;
import com.bookstore.service.VipsService;
	
	public class IsLoginAction {
	
	private ShoppingCarService shoppingCarService;
	private BooksService booksService;
	private VipsService vipsService;
	private ShoppingCar shoppingCar;
			

	public ShoppingCarService getShoppingCarService() {
		return shoppingCarService;
	}


	public void setShoppingCarService(ShoppingCarService shoppingCarService) {
		this.shoppingCarService = shoppingCarService;
	}


	public BooksService getBooksService() {
		return booksService;
	}


	public void setBooksService(BooksService booksService) {
		this.booksService = booksService;
	}


	public VipsService getVipsService() {
		return vipsService;
	}


	public void setVipsService(VipsService vipsService) {
		this.vipsService = vipsService;
	}


	public ShoppingCar getShoppingCar() {
		return shoppingCar;
	}


	public void setShoppingCar(ShoppingCar shoppingCar) {
		this.shoppingCar = shoppingCar;
	}


	public String execute(){
	Map session=ServletActionContext.getContext().getSession();	
	Vips vip=(Vips) ServletActionContext.getServletContext().getAttribute("login");//��ȡ��¼����
	String[] s=ServletActionContext.getRequest().getParameterValues("count");//��ȡ��Ʒ����
	Set<Books>  bookset=null;
	try {
		bookset=(Set<Books>) session.get("set");//��ȡ�ѹ���
		System.out.println("bookset"+bookset);
		if(bookset.size()==0){
			ServletActionContext.getRequest().setAttribute("message","���ﳵ��û����Ʒ����ȥ������ϲ������Ʒ��");
		}
	} catch (NullPointerException e) {
		ServletActionContext.getRequest().setAttribute("message","���ﳵ��û����Ʒ����ȥ������ϲ������Ʒ��");
	}
	int[] count=new int[s.length];//����ȡ����������ת��
	for(int i=0;i<s.length;i++){
			count[i]=Integer.parseInt(s[i]);
			System.out.println("count:"+count[i]);
	}
	
	//����������Session�����¶�����ʱ������鼮���еĿ�漰����������
	session.put("count",count);
	
	double amunt=0;
	int i=0;
	Iterator<Books> it=bookset.iterator();//�����ܶ�
	while(it.hasNext()){
		Books book=it.next();
		System.out.println("book:"+book.getBookName());
		amunt=amunt+(book.getPrice()-book.getDiscountprice())*count[i++];
	}
	System.out.println("amount:"+amunt);
	session.put("amount",amunt);
	
	//��������Ϣ�������ݿ�
	int j=0;
	ShoppingCar shop=new ShoppingCar();
	for(Books b:bookset){
		
		
		
		Books bk=booksService.queryBooksById(b.getBookId().longValue());
		System.out.println("====="+bk.getBookId());
		booksService.updateBooks(bk);
//		Books bs=booksService.queryBooksById(bk.getBookId().longValue());
//		System.out.println("bbb;"+bs.getBookId()+bs.getBookName());
				
		shop.setShopcount(count[j++]);
		shop.setBooks(bk);
				
	}	
	shoppingCarService.addShoppingCar(shop);
	
	
	if(vip==null){		
			return"fail";
		}
	else{
			Vips v=vipsService.queryVips(vip.getVipId().longValue());
			shop.setVips(v);
			shoppingCarService.updateShoppingCar(shop);
			return"success";
		}
		
		
	}
	
	}
