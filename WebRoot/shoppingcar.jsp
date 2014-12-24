<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	table, td, th
  {
  border:1px solid black;
  }

th
  {
  background-color:gray;
  color:white;
  }
	</style>

<script type="text/javascript">
function back(){
	window.location.href="beforeIndex.jsp";
}
function count(){

}
</script>

</head>
  
  
 <body style="text-align: center">
<div id="main_container">

	<div id="header">

       <div class="top_right">        
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
      <br/><br/><br/>
            
  <div class="main_content">
  <p style="text-align:center; font-size:24px;">购物车</p><br/>
  <form action="islogin.action">
  <P>${requestScope.message }</P>
 <table align="center">
 <tr>
 <th>商品名称</th>
 <th>现价</th>
 <th>优惠</th>
 <th>数量</th>
 <th>操作</th>
 </tr>
 <c:forEach items="${sessionScope.set}" var="s">
 <tr>
 <td>${s.bookName }</td>
 <td><fmt:formatNumber value="${s.price-s.discountprice}" pattern="#.00"/></td>
 <td>${s.discountprice }</td>
 <td><input style="width: 30px;" type="text" value="1" name="count" /></td>
 <td><a href="delcar.action?book.bookId=${s.bookId }">取消</a></td>
 </tr>
 </c:forEach>
 </table>
 总价：<fmt:formatNumber value="${sessionScope.amount }" pattern="#.00"/><br/><br/>
 <input type="button" value="继续购物" onclick="back()"/>
 <input type="button" value="结算"onclick="count()"/>
 <input type="submit" value="生成订单" />
 </form> 
  
  </div>
                    
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