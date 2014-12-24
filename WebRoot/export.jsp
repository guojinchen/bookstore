<%@page contentType="text/html;charset=GB2312"%>
<%
 String fileName="orders.xls";//随便定义，也可不定义
 response.setContentType( "Application;charset=GB2312");
 response.setHeader("Content-disposition","attachment;filename=\"" + fileName + "\";");
 java.io.PrintWriter bos = response.getWriter();
 String html = request.getParameter("excelText");
 bos.write(html);
 bos.close();
%>
