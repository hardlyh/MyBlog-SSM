<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>lyh2016.cn</title>
<meta name="renderer" content="webkit">
<link rel="stylesheet" href="assets/bootstarp/bootstrap.min.css">
<link rel="stylesheet" href="assets/pagination/pagination.css">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<meta name="mobile-web-app-capable" content="yes">
<link rel="icon" sizes="192x192" href="assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
<meta name="msapplication-TileImage" content="assets/i/app-icon72x72@2x.png">
<meta name="msapplication-TileColor" content="#0e90d2">
<link rel="stylesheet" href="assets/css/amazeui.css">
<link rel="stylesheet" href="assets/css/app.css">
<style type="text/css">
.am-radius a{
	color:#FFFFFF;
}
.am-radius a:hover{
	color:#33FF33;
	text-decoration: none;
}

#promet{
    margin-left:100px;
    margin-top:100px;
}
</style>

</head>

<body id="blog">

	<%@include file="nav2.jsp"%> 
	<!-- nav end -->
	<!-- banner start -->
	
	<!-- banner end -->

	<!-- content srart -->
    <div class="am-g am-g-fixed blog-fixed">
    
    
       <div id="promet">
       <span><a href="" class="blog-color">lyh_Article &nbsp;</a></span> <br>              
           <h1 class="blog-h-margin"><a href="">欢迎来到文章分类页面</a></h1>
           <p>请再次点击文章分类选项来选择需要的内容
           </p>
       <span>2017/10/9</span> 
       </div>
        
        
        <div class="am-u-md-8 am-u-sm-12" id="contentByajax">
        </div>
        <!-- 分页 -->
        <!-- 左边栏 -->
          <%@include file="left.jsp" %>
    </div>
    <div class="am-g am-g-fixed blog-fixed" >
       <ul id="M-box" class="pagination"></ul>
    </div>
    
    <!-- content end -->
      
   


    <!-- 样本文章块 -->
    <div style="display:none;">
           <article class="am-g blog-entry-article" id="example">
           <div class="am-u-lg-6 am-u-md-12 am-u-sm-12 blog-entry-text">
               <span><a class="blog-color"> @author &nbsp;</a></span> <span class="time">&nbsp;</span> <span class="am-icon-tags tag"><b> </b> &nbsp;</span>
               <span><font size="-1.5" class="viewCount"></font></span>
               <h1 class="hrefAmount">
                   <input type="hidden" value="2312" class="articleId">
                   <a class="url_title" href=""></a>
               </h1>
               <p class="description"></p>
           </div>
           </article>
      </div>
    <!-- /样本文章块 -->

</div>

	<footer class="blog-footer"> <%@include file="foot.jsp"%> </footer>





	<!--[if (gte IE 9)|!(IE)]><!-->
	
	<!--<![endif]-->
	<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
	<script src="assets/js/amazeui.min.js"></script>
	<script src="assets/bootstarp/bootstrap.min.js"></script>
<script src="assets/scripts/Myblog-commons.js"></script>
<script src="assets/pagination/jqPaginator.min.js"></script>
	<script type="text/javascript">
	$("#pageList").addClass("am-active");
	
	$("#promet").hide(7000);
	</script>
</body>
</html>