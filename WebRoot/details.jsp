<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@page import="org.apache.struts2.ServletActionContext"%>
<%@page import="com.bookstore.bean.Vips" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎来到我的网上购物系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- 引入外部 的js -->
	<script type="text/javascript" src="js/boxOver.js"></script>
	<!-- 引入外部的jquery -->
	<script type="text/javascript" src="js/jquery-1.8.2.js"></script>
	<!-- 引入外部的css -->
	<link rel="stylesheet" type="text/css" href="css/style.css">
	
		<style type="text/css">
		 tr.odd a{font-size:16px;width:166px;height:25px;display:block; border-bottom:1px #e4e4e4 dashed;
					text-decoration:none;color:#504b4b;padding:0 0 0 14px; line-height:25px;}
		 tr.even a{font-size:16px;width:166px;height:25px;display:block; border-bottom:1px #e4e4e4 dashed; background-color:#f0f4f5;
					text-decoration:none;color:#504b4b;padding:0 0 0 14px; line-height:25px;}
		</style>
	<script type="text/javascript">
		$(document).ready(function(){
			   $('#tbody1 tr:odd').addClass('odd');
			   $('#tbody1 tr:even').addClass('even'); 
			   $('#tbody2 tr:odd').addClass('odd');
			   $('#tbody2 tr:even').addClass('even'); 
			});
</script>
<script>
PositionX = 100;
PositionY = 100;


defaultWidth  = 500;
defaultHeight = 500;
var AutoClose = true;

if (parseInt(navigator.appVersion.charAt(0))>=4){
var isNN=(navigator.appName=="Netscape")?1:0;
var isIE=(navigator.appName.indexOf("Microsoft")!=-1)?1:0;}
var optNN='scrollbars=no,width='+defaultWidth+',height='+defaultHeight+',left='+PositionX+',top='+PositionY;
var optIE='scrollbars=no,width=150,height=100,left='+PositionX+',top='+PositionY;
function popImage(imageURL,imageTitle){
if (isNN){imgWin=window.open('about:blank','',optNN);}
if (isIE){imgWin=window.open('about:blank','',optIE);}
with (imgWin.document){
writeln('<html><head><title>Loading...</title><style>body{margin:0px;}</style>');writeln('<sc'+'ript>');
writeln('var isNN,isIE;');writeln('if (parseInt(navigator.appVersion.charAt(0))>=4){');
writeln('isNN=(navigator.appName=="Netscape")?1:0;');writeln('isIE=(navigator.appName.indexOf("Microsoft")!=-1)?1:0;}');
writeln('function reSizeToImage(){');writeln('if (isIE){');writeln('window.resizeTo(300,300);');
writeln('width=300-(document.body.clientWidth-document.images[0].width);');
writeln('height=300-(document.body.clientHeight-document.images[0].height);');
writeln('window.resizeTo(width,height);}');writeln('if (isNN){');       
writeln('window.innerWidth=document.images["George"].width;');writeln('window.innerHeight=document.images["George"].height;}}');
writeln('function doTitle(){document.title="'+imageTitle+'";}');writeln('</sc'+'ript>');
if (!AutoClose) writeln('</head><body bgcolor=ffffff scroll="no" onload="reSizeToImage();doTitle();self.focus()">')
else writeln('</head><body bgcolor=ffffff scroll="no" onload="reSizeToImage();doTitle();self.focus()" onblur="self.close()">');
writeln('<img name="George" src='+imageURL+' style="display:block"></body></html>');
close();		
}}

</script>

</head>
  
  
 <body style="text-align: center">
<div id="main_container">

	<div id="header">

       <div class="top_right">
       
            <div class="languages">
                <div class="lang_text">${applicationScope.logi n.username }欢迎您！</div><br/>
                <%
                try{
                 Vips  vips=(Vips) ServletActionContext.getServletContext().getAttribute("login");
                 if(vips!=null){
                 %>
                 <a href="LoginOut.action" class="lang_text">注销&nbsp;&nbsp;|</a>
                 <%
                 	}
                 else
                 	{
                 %>
                  <a href="login.jsp" class="lang_text">登录&nbsp;&nbsp;|</a>
                    <a href="register.jsp" class="lang_text">&nbsp;&nbsp;注册&nbsp;&nbsp;|</a>    
                 <%    
                	 }
                }
             	catch(Exception e){
             	%>
             	 <a href="login.jsp" class="lang_text">登录&nbsp;&nbsp;|</a>
             	 <%
             	}
               %>
                
                <a href="mainlogin.jsp" class="lang_text">&nbsp;&nbsp;管理&nbsp;&nbsp;|</a> 
                <a href="shoppingcar.jsp" class="lang_text">&nbsp;&nbsp;购物车 &nbsp;&nbsp;|</a> 
                <a href="myorder.action" class="lang_text">&nbsp;&nbsp;订单&nbsp;&nbsp;|</a> 
            </div>
            
            
            <div class="big_banner">
            <a href="#"><img src="images/banner728.jpg" alt="" title="" border="0" /></a>
            </div>
        
        </div>
    
  
        <div id="logo">
            <a href="beforeIndex.jsp"><img src="images/logo.png" alt="" title="" border="0" width="182" height="85" /></a>
	    </div>
        

        

    </div>
    
     <div id="main_content"> 
   
            <div id="menu_tab">
                    <ul class="menu">
                         <li><a href="index.jsp" class="nav">  主&nbsp;&nbsp;页 </a></li>
                         <li class="divider"></li>
                         <li><a href="newbook.action" class="nav">新&nbsp;&nbsp;书</a></li>
                         <li class="divider"></li>
                         <li><a href="specialbook.action" class="nav">特价书</a></li>
                         <li class="divider"></li>
                         <li><a href="sortbook.action" class="nav">图书排行榜</a></li>
                         <li class="divider"></li>
                          <li><a href="contact.jsp" class="nav">联系我们</a></li>
                         <li class="divider"></li>                         


                    </ul>

            </div><!-- end of menu tab -->
            
            
    <div class="crumb_navigation">
<span class="current"></span>
    </div>        
    
   <div class="left_content">
    <div class="title_box" >图书分类列表</div>
    
    <input type="hidden" id="hid" value="0"/><%--
   <ul class="left_menu">
      <c:forEach items="${list}" var="s">   
        <li class="odd"><a href="details.html">${s.booktypeName}</a></li>
      </c:forEach>
    </ul>
    --%>    
    <table style="font-size: 14px">
    <tbody id="tbody1">
   <c:forEach items="${applicationScope.type}" var="s">   
    <tr>
    <td><a href="typelist.action?book.bookTypes.booktypeId=${s.booktypeId}">${s.booktypeName}</a></td>
    </tr>
    </c:forEach>
    </tbody>
    </table>
        
<div class="title_box">特别推荐</div>  
     <div class="border_box">
         <div class="product_title"><a href="details.action?book.bookId=${applicationScope.choose.bookId}">${applicationScope.choose.bookName }</a></div>
         <div class="product_img"><a href="details.action?book.bookId=${applicationScope.choose.bookId}"><img src="${applicationScope.choose.bookImage }" alt="" title="" border="0"style="width:71px;height:90px;" /></a></div>
         <div class="prod_price"><span class="reduce">${applicationScope.choose.price }</span> <span class="price"><fmt:formatNumber value="${applicationScope.choose.price-applicationScope.choose.discountprice}" pattern="#.00"/></span></div>
     </div>  
     
     
     <div class="title_box">Newsletter</div>  
     <div class="border_box">
		<input type="text" name="newsletter" class="newsletter_input" value="your email"/>
        <a href="#" class="join">subscribe</a>
     </div>  
     
     <div class="banner_adds">
     
     <a href="#"><img src="bookimages/11.jpg" alt="" title="" border="0" /></a>
     </div>    
        
    
   </div><!-- end of left content --> 



 <div class="center_content">
   

   
   
   	<div class="center_title_bar">书籍详细信息</div>
    
    	<div class="prod_box_big">

            <div class="center_prod_box_big">            
                 
                 <div class="product_img_big">
                 <a href="" title="header=[Zoom] body=[&nbsp;] fade=[on]"><img src="${book.bookImage}" alt="" title="" border="0" /></a>
                 </div>
                     <div class="details_big_box">
                         <div class="product_title_big">${book.bookName}</div>
                         <div class="specifications">
               		          作者: <span class="blue">  ${book.bookAuthor }</span><br />

                           	 出版日期: <span class="blue">${book.publishtime }</span><br />
                            
                           原价:  <div class="prod_price_big"> <span class="reduce">
                            ${book.price }</span><br /></div>
                            
                            现价:  <div class="prod_price_big"><span class="price"><fmt:parseNumber value="${book.price-book.discountprice}" pattern="#.00"/> </span><br /></div>
                             内容简介:<span class="blue"> ${applicationScope.info} </span><br />
                         </div>                       
                         <a href="addcar.action?book.bookId=${book.bookId }" class="prod_buy">加入购物车</a>
                     </div>                        
            </div>
                              
        </div>
        
    	<div class="center_title_bar">其他信息</div>
		    <div style="text-align:center; 310px;font-size:14px"> 
		   			 言：${book.languages }<br/>
            	    出版日期:${book.publishtime }<br/>
					
					总页数：${book.bookPages }<br/>
  					作者： ${book.bookAuthor }<br/>
                	出版社：${book.publisher }<br/>
                	字数： ${book.words}<br/>
        	</div>
	   <div class="center_title_bar">主要内容</div><br/><br/><br/><br/>
	   <div style="font-size: 14px">
	   ${applicationScope.content }
	   </div>
	   <div class="center_title_bar">目录</div><br/><br/><br/><br/>
	   <div style="font-size: 14px">
	   ${applicationScope.directory }
	   </div>
   </div><!-- end of center content -->



 <div class="right_content">
 
      <div class="title_box">图书搜索</div>  
     <div class="border_box">
     <form name="myform" action="find.action">
		<input type="text" name="book.bookName" class="newsletter_input" value="keyword"/>
        <input type="submit"  class="join" value="搜索" />
     </form>
     </div>  
     

     
 
   		<div class="shopping_cart">
        	<div class="title_box">购物车</div>
            
            <div class="cart_details">
           商品数：${sessionScope.item } <br />
            <span class="border_cart"></span>
     	       总计: <span class="price"><fmt:formatNumber value="${sessionScope.amount }" pattern="#.00"/>￥</span>
            </div>
            
            <div class="cart_icon"><a href="shoppingcar.jsp" title=""><img src="images/shoppingcart.png" alt="" title="" width="35" height="35" border="0" /></a></div>
        
        </div>
   
   
   
     <div class="title_box">最新推荐</div>  
     <c:forEach items="${applicationScope.newone}" var="s">
      <div class="border_box">
         <div class="product_title"><a href="details.action?book.bookId=${s.bookId}">${s.bookName }</a></div>
         <div class="product_img"><a href="details.action?book.bookId=${s.bookId}"><img src="${s.bookImage }" alt="" title="" border="0" style="width:71px;height:90px;"/></a></div>
         <div class="prod_price"><span class="reduce">${s.price }</span> <span class="price"><fmt:formatNumber value="${s.price-s.discountprice}" pattern="#.00"/></span></div>
     </div>  
     </c:forEach>
     
     <div class="title_box">公告</div>
     <c:forEach items="${applicationScope.notice}" var="s">
     <div class="banner_adds">
     ${s.noticeContent }<br>
     </div>        
     </c:forEach>
     
     
    <div class="title_box">出版社</div>
    
   <table  style="font-size: 14px">
    <tbody id="tbody2">
   <c:forEach items="${applicationScope.publisher}" var="s">   
    <tr>
    <td><a href="publisherlist.action?book.publisher=${s.publisher}">${s.publisher}</a></td>
    </tr>
    </c:forEach>
    </tbody>
    </table>
     
      
   </div><!-- end of right content -->   


            
   </div><!-- end of main content -->
   
   
 <div class="footer">
   

        <div class="left_footer">
        <img src="images/footer_logo.png" alt="" title="" width="89" height="42"/>
        </div>
        
        <div class="center_footer">
        Template name. All Rights Reserved 2008<br />
        <a href="http://www.cssmoban.com/" title="free css templates">cssmoban.com</a><br />
        <img src="images/payment.gif" alt="" title="" />
        </div>
        
        <div class="right_footer">
        <a href="index.jsp">主&nbsp;页</a>
        <a href="about.html">关&nbsp;于</a>
        <a href="contact.jsp">联系我们</a>
        </div>   
   
   </div>          

</div>
<!-- end of main_container -->
</body>
</html>
