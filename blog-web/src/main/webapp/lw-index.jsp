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
<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/bootstarp/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/pagination/pagination.css">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/assets/i/favicon.png">
<meta name="mobile-web-app-capable" content="yes">
<link rel="icon" sizes="192x192" href="${pageContext.request.contextPath }/assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
<meta name="msapplication-TileImage" content="assets/i/app-icon72x72@2x.png">
<meta name="msapplication-TileColor" content="#0e90d2">
<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/amazeui.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/app.css">




<style type="text/css">
.am-radius a{
	color:#FFFFFF;
}
.am-radius a:hover{
	color:#33FF33;
	text-decoration: none;
}

</style>

</head>

<body id="blog">
	<!-- 头部 -->
	 <jsp:include page="nav2.jsp"></jsp:include>
	<hr>
	<!-- nav end -->
	<!-- banner start -->
	<div class="am-g am-g-fixed blog-fixed am-u-sm-centered blog-article-margin">
		<div data-am-widget="slider" class="am-slider am-slider-b1" data-am-slider='{&quot;controlNav&quot;:false}'>
			<ul class="am-slides">
				<li><img src="assets/i/b1.png"></li>
			</ul>
		</div>
	</div>
	<!-- banner end -->

	<!-- content srart -->
	<div class="am-g am-g-fixed blog-fixed">
		<div class="am-u-md-8 am-u-sm-12" id="contentByajax">
		<!-- 文章列表 -->
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
      
	<footer class="blog-footer">
		 <%@include file="foot.jsp"%>
	  </footer>

	<!--[if (gte IE 9)|!(IE)]><!-->
	
	<!--<![endif]-->


<script src="${pageContext.request.contextPath }/assets/js/amazeui.min.js"></script>
<script src="${pageContext.request.contextPath }/assets/bootstarp/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath }/assets/scripts/Myblog-commons.js"></script>
<script src="${pageContext.request.contextPath }/assets/pagination/jqPaginator.min.js"></script>
<script type="text/javascript">


$(function(){
    $("#index").addClass("am-active");
    
    function addContent(data){
    	for(var i=0;i<data.length;i++){
    		var v = $("#example").clone(false);
            $(v).find(".time").text(data[i].gmtModified+"  ");
            $(v).find(".viewCount").text("阅读 : "+data[i].pageViewingCount);
            $(v).find(".tag").text("  "+data[i].pageTag);
            $(v).find(".articleId").text(data[i].id);
            $(v).find(".url_title").attr("href",data[i].pageHtmlUrl);
            $(v).find(".url_title").text(data[i].pageTitle);
            $(v).find(".description").text(data[i].pageDescription);
            $("#contentByajax").append(v);
    	}
    }
    
    page({
    	pageSize : 10,
    	url:'/article/listArticle.do',
    	addContent:addContent,
    });
    
})

	
	
	
</script>
</body>
</html>