<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="org.apache.struts2.ServletActionContext"%>
<%@page import="com.bookstore.bean.Vips" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
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

//验证用户名
	function validateUserName(){
		var username=document.getElementById("username").value;
		if(username.length==0){
			window.alert("用户名不能为空");
			return false;
			}else if(username.length<6){
				window.alert("用户名长度应大于六位");
				return false;
				}
		return true;
		
	}
//验证密码
	function validatePassword(){
		var password=document.getElementById("password").value;
		if(password.length==0){
			window.alert("密码不能为空");
				return false;
			}
		if(password.length<8){
			window.alert("密码长度不能少于八位");
			return false;
			}
		return true; 
		}

	//验证两次输入的密码一致
	function validateRePassword(){
		var repassword=document.getElementById("repassword").value;
		var password=document.getElementById("password").value;
		if(repassword.length==0){
		window.alert("请再次输入密码，不能为空");
		return false;
		}
		if(repassword!=password){
		 window.alert("两次输入的密码不一致，请重新输入");
			 return false;
			}
		
		return true;
		}
		
//验证密保问题是否为空
	function validateQuestions(){
		var question=document.getElementById("questions").value;
		if(question.length==0){
			window.alert("为了确保您的账号安全，请输入密保问题");
			return false;
			}
		return true;
		}
		
//验证密保答案是否为空
	function validateAnswers(){
		var answers=document.getElementById("answers").value;
		if(answers.length==0){
			window.alert("密保答案不能为空，请输入！");
			return false;
			}
		return true;
		}
//验证邮箱（如果不为空，说明填写了，则要进行验证）
		function validateEmail(){
		var email = document.getElementById("myemail").value;
		if(email.length == 0){
			return true;	
		}else
	{
		if(email.indexOf('@') == -1){
			alert("邮箱地址必须包含@符号!");
			document.myform.email.select();
			return false;
		}
		if(email.indexOf('.') == -1){
			alert("邮箱地址必须包含.符号!");
			document.myform.email.select();
			return false;
		}
		if(email.indexOf('@')-email.indexOf('.',email.indexOf('@')) == -1 ){
			alert("邮箱地址不合法!");
			document.myform.email.select();
			return false;
		}
		return true;
	}	
}
//总验证
function validater(){
	if(validateUserName()&&validatePassword()&&validateRePassword()&&validateQuestions()&&validateAnswers&&validateEmail()){
			return true;
			}
	else 
		return false;

	}
//根据验证结果，是否提交表单
function submitform(){
if(validater()){
document.getElementById("myform").submit();
}
}	
</script>
	

</head>
  
  
 <body style="text-align: center">

<div id="main_container">

	<div id="header">

       <div class="top_right">
       
           <div class="languages">
                <div class="lang_text">${applicationScope.login.username }欢迎您！</div><br/>
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
                 <%    
                	 }
                }
             	catch(Exception e){
             	%>
             	 <a href="login.jsp" class="lang_text">登录&nbsp;&nbsp;|</a>
             	 <%
             	}
               %>
               <a href="register.jsp" class="lang_text">&nbsp;&nbsp;注册&nbsp;&nbsp;|</a>       
                <a href="mainlogin.jsp" class="lang_text">&nbsp;&nbsp;管理&nbsp;&nbsp;|</a> 
                <a href="shoppingcar.jsp" class="lang_text">&nbsp;&nbsp;购物车 &nbsp;&nbsp;|</a> 
                <a href="myorder.action" class="lang_text">&nbsp;&nbsp;订单&nbsp;&nbsp;|</a> 
            </div>
            
            
            <div class="big_banner">
            <a href="#"><img src="images/banner728.jpg" alt="" title="" border="0" /></a>
            </div>
        
        </div>
    
  
        <div id="logo">
            <a href="beforeIndex.jsp"><img src="images/logo.png" alt="" title="" border="0" width="238" height="68" /></a>
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
         <div class="product_title"><a href="details.action?book.bookId=${s.bookId}">${applicationScope.choose.bookName }</a></div>
         <div class="product_img"><a href="details.action?book.bookId=${s.bookId}"><img src="${applicationScope.choose.bookImage }" alt="" title="" border="0"style="width:71px;height:90px;" /></a></div>
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
   

   
   
   	<div class="center_title_bar">注 册</div>
    
    	<div class="prod_box_big">
      
            <div class="center_prod_box_big">            
                 
              	<div class="contact_form">
              	<div >以下为必填项：</div>
                    <form action="register.action" id="myform" name="myform" onsubmit="return validater()" method="post"> 
                    <div class="form_row">
                    <label class="contact"><strong>*用户名:</strong></label>
                    <input id="username" name="vip.username"    onblur="loadXMLDoc()" type="text" class="contact_input" />长度不少于六位
                   
                    </div>  
                     <div id="myDiv"></div>
                    <div class="form_row">
                    <label class="contact"><strong>*密码:</strong></label>
                    <input id="password" name="vip.passwords" type="text" class="contact_input" />长度不少于八位
                    </div>


                    <div class="form_row">
                    <label class="contact"><strong>*确认密码:</strong></label>
                    <input id="repassword"  type="text" class="contact_input" />长度不少于八位
                    </div>
                    
                    <div class="form_row">
                    <label class="contact"><strong>*密保问题:</strong></label>
                    <input id="questions" name="vip.question" type="text" class="contact_input" />
                    </div>


                    <div class="form_row">
                    <label class="contact"><strong>*密保答案:</strong></label>
                     <input id="answers" name="vip.answer" type="text" class="contact_input" />
                    </div><br>
				<div>以下为选填项</div>
                    <div class="form_row">
                    <label class="contact"><strong>姓名:</strong></label>
                    <input type="text" name="vip.realname" class="contact_input" />
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>性别:</strong></label>
                    <input  type="radio" name="vip.sex" value="男" />男
                    <input type="radio" name="vip.sex" value="女" />女
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>年龄:</strong></label>
                    <input type="text" name="vip.age" class="contact_input" />
                    </div> 
                    
                    <div class="form_row">
                    <label class="contact"><strong>手机号:</strong></label>
                    <input type="text" name="vip.mobilephone" class="contact_input" />
                    </div>   
                    
                    <div class="form_row">
                    <label class="contact"><strong>Email:</strong></label>
                    <input type="text" id="myemail" name="vip.email"class="contact_input" />eg:123456@qq.com
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>QQ:</strong></label>
                    <input type="text" name="vip.qq" class="contact_input" />
                    </div>  
                    
                    <div class="form_row">
                    <label class="contact"><strong>住址:</strong></label>
                    <input type="text" name="vip.address" class="contact_input" />
                    <input type="hidden" name="vip.registertime" value=""/>
                    </div>   
                                     
                    <div class="form_row">
                    <input type="button" id="register" name="register" class="contact_input" value="注册" onclick="submitform()" />
                    </div>      
                  </form>      
                </div> 
            
                                     
            </div>
                                 
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
	
	<script type="text/javascript">
function loadXMLDoc()
{
var xmlhttp;
var cameraId = document.getElementById("username").value;
var name;

if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
    name = document.getElementById("myDiv").textContent;
   
    if(name.length>2){
    	document.myform.register.disabled = true;
    }
    else{
    	document.myform.register.disabled = false;
    }
    }
  }
xmlhttp.open("POST","registertwo.action?username="+cameraId,true);
xmlhttp.send();
}
</script>

