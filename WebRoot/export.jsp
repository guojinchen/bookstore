<%@page contentType="text/html;charset=GB2312"%>
<%
 String fileName="orders.xls";//��㶨�壬Ҳ�ɲ�����
 response.setContentType( "Application;charset=GB2312");
 response.setHeader("Content-disposition","attachment;filename=\"" + fileName + "\";");
 java.io.PrintWriter bos = response.getWriter();
 String html = request.getParameter("excelText");
 bos.write(html);
 bos.close();
%>
