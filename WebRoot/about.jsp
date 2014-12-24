<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
<link rel="stylesheet" type="text/css" href="css/style.css">
	
		<style type="text/css">
		 tr.odd a{width:166px;height:25px;display:block; border-bottom:1px #e4e4e4 dashed;
					text-decoration:none;color:#504b4b;padding:0 0 0 14px; line-height:25px;}
		 tr.even a{width:166px;height:25px;display:block; border-bottom:1px #e4e4e4 dashed; background-color:#f0f4f5;
					text-decoration:none;color:#504b4b;padding:0 0 0 14px; line-height:25px;}
		</style>
  </head>
  
  <body style="text-align: center"><p align="center"><br><br><br><br><br>
  欢迎登陆学天涯网上购物系统<br><br><br><br>
  
  本系统是基于SSH框架采用B/S架构运用B2C模式的一个网上购物系统，希望大家多多给予意见<br/>
  
  由于现实中的物品太多，所以为了做的更精确，更有针对性，就选取了只卖书这一类的物品，暂时不卖其它物品，谢谢大家
  
  <br><br>
   
   作者：郭津辰<br><br><br>
   时间:2013年5月2日<br><br><br>
   版本：1.0.0<br><br><br>
   </p>
  </body>
</html>
