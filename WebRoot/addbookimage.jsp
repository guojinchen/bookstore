<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s"uri="/struts-tags" %>
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
  <table align="center" border="1" width="900" style="text-align: center">
 <tr>
  <td colspan="2" align="center">
  
  <label><strong>书籍图片：</strong></label><br/>
   <img  src="bookimages/20121215.jpg"  > 
      <br/><br/>
      <p>修改书籍图片：</p>
       <div style="color.red">
        <s:fielderror /> 
    </div>
    <s:form action ="uploadPicture" method ="post" enctype ="multipart/form-data" > 
          <input type="hidden" value="${books.bookId }" name="imgbook.bookId">
         <s:textfield name ="title" label ="文件标题" /> 
        <s:file name ="upload" label ="选择文件" />      
        <s:submit value="上传" /> 
    </s:form>
  </td>
  </tr>
</table>
  </body>
</html>
