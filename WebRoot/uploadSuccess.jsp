<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
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

  </head>
  
  <body>
  
  <p style="text-align: center;font-size: 24px;color: red">图片修改成功，将跳转到主页面！</p>
    <div style ="padding: 3px; border: solid 1px #cccccc; text-align: center" > 
        <img src ='upload/<s:property value ="uploadFileName" /> ' />
        <br /> <br /> 
        <s:property value ="title" /> 
    </div > 
 <%
out.println("<meta http-equiv='refresh' content='3;url=main.jsp'> ");
%>
  </body>
</html>
