<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<%@taglib prefix="s" uri="/struts-tags" %>
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
	 <script type="text/javascript" src="js/calendar.js"></script>
	<style type="text/css">
	table, td, th
  {
  border:1px solid orange;
  }

th
  {
  background-color:orange;
  color:white;
  }
body {
	margin:0 auto ;
	background:#F0FEFF;
}

.box {

	margin:0 auto ;
	padding:0;
	width:900px;

}

.box .logo{
	margin:0;
	padding:0;
}
.box .menu {
	
	font-family: arial, sans-serif; 
	width:750px; 
	margin:50px 0;
	position:absolute;
	top:420px;
}

.box .menu ul {
	
	padding:0; 
	margin:0;
	list-style-type: none;
	z-index:4;

}

.box .menu ul li {
	
	float:left; 
	position:relative;
	background-color:#FF6600;
	box-shadow: 0 0 6px #FF6600;
}


.box .menu ul li a, .menu ul li a:visited{
	display:block; 
	text-align:center; 
	text-decoration:none; 
	width:104px; 
	height:30px; 
	color:#000; 
	border-width:1px 1px 0 0;
	background:#FF9933; 
	line-height:30px; 
	font-size:11px;
	
}

.box .menu ul li ul{
	display: none;
}

.box .menu ul li:hover a{
	color:#fff; 
	background:#FF6600;
	border: 1px solid #FF6600;
	border-radius: 5px 5px 5px 5px;
	box-shadow: 0 0 6px #FF6600;

}
.box .menu ul li:hover ul {
	display:block; 
	float:left;
	

}

.box .menu ul li:hover ul li a {
	display:block; 
	background:#FF7546; 
	color:#fff;
	
	
}

.box .menu ul li:hover ul li a:hover {
	background:#FF6600; 
	color:#000066;
}

.header{
	position:absolute;
	
	width:100%;
	height:33px;
	margin:0px;
	padding:0px;
	background:#7AA0FA;
	z-index:6;
	border: 1px solid #7AA0FA;
	border-radius: 0px 0px 5px 5px;
	box-shadow: 0 0 4px #7AA0FA;
}

.search  {
	
	width:200px;
	height:25px;

}
.search input{
	border: 1px solid #7AA0FA;
	border-radius:5px 5px 5px 5px;
	box-shadow: 0 0 4px #7AA0FA;
	width:200px;
	height:25px;
	
}

.search img{
	position:absolute;
	top:5px;
	right:0px;
	height:20px;
}
.info{
	
	position:relative;
	float:right;
	right:20px;

}

.info ul {
	padding:0; 
	margin:0;
	list-style-type: none;

}

.info ul li {
	float:left; 
	position:relative;
}

 .info ul li a,.box .info ul li a:visited{
	display:block; 
	text-align:center; 
	text-decoration:none; 
	width:104px; 
	height:30px; 
	color:#000; 
	border:1px solid #7AA0FA;
	border-width:1px 1px 0 0;
	background:#6666FF; 
	line-height:30px; 
	font-size:11px;
}

 .info ul li ul{
	display: none;
}

 .info ul li:hover a{
	color:#fff; 
	background:#6633FF;

}
 .info ul li:hover ul {
	display:block; 
	position:absolute; 
	top:31px; 
	left:0; 
	width:105px;
}
 .info ul li:hover ul li a {
	display:block; 
	background:#003399; 
	color:#fff;
}

.info ul li:hover ul li a:hover {
	background:#000066; 
	color:yellow;
	border: 1px solid #7AA0FA;
	border-radius: 1px 1px 1px 1px;
	box-shadow: 0 0 6px #7AA0FA;
}


.goods{
	font-family: arial, sans-serif; 
	font-size:14px;
	width:900px;
	top:0px;
	position:relative;

}

.goods ul {
	list-style:none;
	width:200px;
}
.goods a{
	color:black;
	width:150px;
	height:300px;
	
	float:left;
}
.goods a ul,.goods a ul li , .goods a ul li img , .goods a ul li div {
	padding:0;
	margin:0;
}
.goods a {
	padding :10px 20px 0px 0px;
	margin:0px;
	text-decoration:none;
	color:#666666;
}

.goods a:hover{
	color:#3300FF;
	
}
.goods a ul li img {
	border: 1px solid #E5E5E5;
	border-radius: 5px 5px 5px 5px;
	box-shadow: 0 0 6px gray;
	margin:0;
	padding:0;
	width:150px;
	height:180px;
}
.goods a ul li div{
	overflow:hidden;
	margin:0;
	padding:0;
	width:150px;
	height:100px;
	text-indent:18pt;
}
.upImgBack{
	width:128px;
	height:128px;
	position:absolute;
	top:126px;
	right:-160px;
}
.loading{
	width:100%;
	height:20px;
	text-align:center;
	float:left;
	margin:20px 0;
}
.loading span{
	display:block;
	margin:0 auto;
	height:20px;
	width:100px;
	background:url("load.gif") no-repeat left top;
}

.top {
	width: 50px;
	height: 50px;
	position: fixed;
	right: 20px;
	bottom: 10px;
}
.top a {
	background: url("top.png") no-repeat left top;
	background-position: 0 0;
	display: block;
	width: 50px;
	height: 50px;
}
.top a:hover {
	background-position: 0 -50px;
}
</style>

<script>
function $(id){
return document.getElementById(id);
}

window.onload=function(){
	 var header = $("header");
	
	 var topBtn = $("topBtn");
	
	window.onscroll=function(){
		
		header.style.top = getPageScroll()  + "px";
		if(!document.documentElement.scrollTop){
			topBtn.style.display="none";
		}else{
			topBtn.style.display="block";
		}
		
	};
	
	topBtn.onclick=function(){
	
		topBtn.style.display="none";
	};
	
	
}

//获取滚动条高度
function getPageScroll(){ 
 
var yScroll; 
if (self.pageYOffset) { 
yScroll = self.pageYOffset; 
        //xScroll = self.pageXOffset; 
} else if (document.documentElement && document.documentElement.scrollTop){ 
yScroll = document.documentElement.scrollTop; 
} else if (document.body) { 
yScroll = document.body.scrollTop; 
} 


 
return yScroll; 
}

//获得浏览器宽度
function getClientWidth() {
	return document.documentElement.clientWidth || document.body.clientWidth;
}

//获取浏览器高度
function getClientHeight() {
	return document.documentElement.clientHeight || document.body.clientHeight;
	
}
function search(){
	var search =$("search");
	alert("请稍等。。。 搜索'"+search.value+"'");
	search.value="";
	

}
</script>

</head>
  
  
  <body>
	<div id="header" class="header">
	
	
     <div class="info" id="info">
			<ul>
			<li><a href="main.jsp">系统主页</a></li>
				<li><a href="javascript:void(0);">图书管理</a>
					<ul>
						<li><a href="viewbook.action?page=1" title="修改图书信息">查看书籍信息</a></li>
					<li><a href="addbook.jsp" title="添加图书">添加书籍</a></li>
					</ul>
				</li>
				<li><a  href="javascript:void(0);">用户管理</a>
					<ul>
					<li><a href="addvip.jsp" title="添加用户">添加用户</a></li>
					<li><a href="viewvip.action?page=1" title="查看用户">查看用户</a></li>
					</ul>
				</li>
				<li><a  href="javascript:void(0);">订单管理</a>
					<ul>
					<li><a href="vieworder.action?page=1" title="查看订单">查看订单</a></li>
					</ul>
				</li>
				<li><a  href="javascript:void(0);">建议管理</a>
					<ul>
					<li><a href="queryadvice.action?page=1" title="用户建议">查看建议</a></li>
					</ul>
				</li>
				<li><a  href="javascript:void(0);">公告管理</a>
					<ul>
					<li><a href="viewnotice.action?page=1" title="站内信息发布">查看公告信息</a></li>
					<li><a href="addnotice.jsp" title="查看站内信息">添加公告信息</a></li>
					</ul>
				</li>
				
			</ul>
		</div>
	</div>
	<div class="box">
	
	
		
		<div class="logo">
			<img src="images/11.jpg" width="900" />
		</div>
		
		
		
		<div class="menu" style="top: 230px; left: 215px; ">
			<ul>
				<li><a class="hide" href="javascript:void(0);">书籍管理</a>
					<ul>
					<li><a href="viewbook.action?page=1" title="修改图书信息">查看书籍信息</a></li>
					<li><a href="addbook.jsp" title="添加图书">添加书籍</a></li>
				
					</ul>
				</li>
				<li><a class="hide" href="javascript:void(0);">用户管理</a>
					<ul>
					<li><a href="addvip.jsp" title="添加用户">添加用户</a></li>
					<li><a href="viewvip.action?page=1" title="查看用户">查看用户</a></li>
					
					</ul>
				</li>
				<li><a class="hide" href="javascript:void(0);">订单管理</a>
					<ul>
					<li><a href="vieworder.action?page=1" title="查看订单">查看订单</a></li>
					
					</ul>
				</li>
				<li><a class="hide" href="javascript:void(0);">建议管理</a>
					<ul>
					<li><a href="queryadvice.action?page=1" title="用户建议">查看建议</a></li>					
					</ul>
				</li>
				<li><a class="hide" href="javascript:void(0);">公告管理</a>
					<ul>
					<li><a href="viewnotice.action?page=1" title="站内信息发布">查看公告信息</a></li>
					<li><a href="addnotice.jsp" title="查看站内信息">添加公告信息</a></li>
					</ul>
				</li>
			</ul>
		</div>
		
		
		<br />
		<br /><br /><br /><br />
		<div class="goods">
		
	  <form action="relupdatebook.action" method="post">
  <table align="center" border="1" width="900" style="text-align: center">

  <tr>
  <td colspan="2">   <p style="font-size: 36px">更新书籍信息</p> </td>
  </tr>
  <tr>
  <td>
  <input type="hidden" value="${books.bookId }" name="books.bookId">
  <input type="hidden" value="${books.bookImage }" name="books.bookImage">
         <label><strong>原价&nbsp;&nbsp;&nbsp;&nbsp;：</strong></label>  <input type="text" name="books.price" value="${books.price}"/><br/><br/>
        <label><strong>出版社&nbsp;&nbsp;：</strong></label>  <input type="text" name="books.publisher" value="${books.publisher}"/><br/><br/>
        <label><strong>出版时间：</strong></label>   <input type="text" onfocus="SelectDate(this,'yyyy-MM-dd hh:mm:ss',0,-150)" name="books.publishtime" value="${books.publishtime}"/><br/><br/>
        <label><strong>总数量&nbsp;&nbsp;：</strong></label>  <input type="text" name="books.allsum" value="${books.allsum}"/><br/><br/>
       <label><strong>已销售&nbsp;&nbsp;：</strong></label> <input type="text" name="books.sellsum" value="${books.sellsum}"/><br/><br/>
      <label><strong>字数&nbsp;&nbsp;&nbsp;&nbsp;：</strong></label> <input type="text" name="books.words" value="${books.words }"/><br/><br/>
      

  </td>
  <td>
     <label><strong>书名&nbsp;&nbsp;：</strong></label><input type="text" name="books.bookName" value="${books.bookName}"/><br/><br/>
     <label><strong>作者&nbsp;&nbsp;：</strong></label> <input type="text" name="books.bookAuthor" value="${books.bookAuthor}"/><br/><br/>
     <label><strong>总页数：</strong></label><input type="text" name="books.bookPages" value="${books.bookPages}"/><br/><br/>
     <label><strong>类型&nbsp;&nbsp;：</strong></label> 
     <select id="b" name="btype">
     <c:forEach items="${typelist}" var="s">
     <option >${s.booktypeName}</option>
     </c:forEach>
     </select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     <br/><br/>
      <label><strong>状态&nbsp;&nbsp;：</strong></label>  <input type="text" name="books.checked" value="${books.checked}"/><br/><br/>
     <label><strong>折价&nbsp;&nbsp;：</strong></label> <input type="text" name="books.discountprice" value="${books.discountprice}"/><br/><br/>
      <label><strong>语种&nbsp;&nbsp;：</strong></label>  <input type="text" name="books.languages" value="${books.languages}"/><br/><br/>
  </td>
  </tr>
  <tr>
  <td colspan="2">
  
  <label><strong>作者简介：</strong></label>  <textarea rows="7" cols="100" name="books.authorInfo" > 
      ${books.authorInfo}
      </textarea><br/><br/>
  </td>
  </tr>
  <tr>
  <td colspan="2">
  
  <label><strong>书籍简介：</strong></label>  <textarea rows="10" cols="100" name="info" > 
      ${applicationScope.info1}
      </textarea><br/><br/>
  </td>
  </tr>
  <tr>
  <td colspan="2">
  
  <label><strong>主要内容：</strong></label>  <textarea rows="10" cols="100" name="content" > 
      ${applicationScope.content1}
      </textarea><br/><br/>
  </td>
  </tr>
  <tr>
  <td colspan="2">
  
  <label><strong>书籍目录：</strong></label>  <textarea rows="10" cols="100" name="directory" > 
      ${applicationScope.directory1}
      </textarea><br/><br/>
  </td>
  </tr>

  <tr>
  <td colspan="2"> <input type="submit" value="提交"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/></td>
  </tr>    
  </table> 
     </form>
  
<table align="center" border="1" width="900" style="text-align: center">
 <tr>
  <td colspan="2" align="center">
  
  <label><strong>书籍图片：</strong></label><br/>
   <img  src=" ${books.bookImage}"  > 
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
    
    

	</div>
		
	</div>
	<div class="loading" id="loading">
				<span></span>
	</div>
	<div id="topBtn" class="top" style="display: block;">
			<!-- <a href="javascript:scroll(0,0)" ></a> -->
			<a href="#"></a>
	</div>

</body>
  
 
</html>
