<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="assets/js/jquery.min.js"></script>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "htt://www.w3.org/TR/html4/loose.dtd">
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
<script src="assets/js/amazeui.min.js"></script>

<header class="am-g am-g-fixed blog-fixed blog-text-center blog-header">
<div class="am-u-sm-8 am-u-sm-centered">
	<h2 class="am-hide-sm-only"></h2>
</div>
</header>
<hr>
<!-- nav start -->
<nav class="am-g am-g-fixed blog-fixed blog-nav">
<div class="am-collapse am-topbar-collapse" id="blog-collapse">
	<ul class="am-nav am-nav-pills am-topbar-nav">
		<li class="" id="index"><a href="lw-index.html">首页</a></li>
		<li class="am-dropdown" id="fenlei" data-am-dropdown>
	        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="#">
	                         文章分类 <span class="am-icon-caret-down"></span>
	        </a>
	        <ul class="am-dropdown-content" id="category">
	        </ul>
        </li>
		<li id="timeline"><a href="lw-timeline.html">存档</a></li>
		<!-- <li><a href="webPageAction_getArticle">知识整理</a></li> -->
		<li id="aboutWeb"><a href="aboutWeb.html">关于本站</a></li>
	</ul>
	<form class="am-topbar-form am-topbar-right am-form-inline" id="conditionForm" role="search" method="post" action="webPageAction_condition">
		<div class="am-form-group">
			<input type="text" name="condition" value="" class="am-form-field am-input-sm" placeholder="搜索"> &nbsp; <span class="am-icon-search " id="search2"></span>
		</div>
	</form>
	<div style="display:none">
		<li id="nav_clone" ><a href="#">1. blog-index-standard</a></li>  
		<li style="margin-left: 50px;" id="nav_child" ><a href="#">222. blog-index-nosidebar</a></li>      
	</div>
</div>
</nav>


<script type="text/javascript">

$(function(){
	
	function addContentToCategory(data){
        for(var i=0;i<data.length;i++){
            var v = $("#example").clone(false);
            $(v).find(".time").text(data[i].gmtModified+"  ");
            $(v).find(".viewCount").text("阅读 : "+data[i].pageViewingCount);
            $(v).find(".tag").text("  "+data[i].pageTag);
            $(v).find(".articleId").text(data[i].id);
            $(v).find(".url_title").attr("href","/article/"+data[i].pageHtmlUrl+".html");
            $(v).find(".url_title").text(data[i].pageTitle);
            $(v).find(".description").text(data[i].pageDescription);
            $("#contentByajax").append(v);
        }
    }
	
    $("#fenlei").click(function(){
    	var v = $("#category");
    	$(v).show("700");
    })	
    
    $.post('/web/listAllCategory.do',function(data){
    	if(data!=null){
	    	var v = $("#category");
	    	for(var i =0;i<data.length;i++){
	    		if(data[i].parentId==0){
	    			var li = $("#nav_clone").clone(false);
	    			$(li).attr("id",data[i].id);
	    			$(li).attr("isChild","0");
	    			$(li).find("a").text(data[i].name);
	    			$("#category").append(li);
	    		}else{
	    			var parent = $(v).find("li[id='"+data[i].parentId+"']");
	    			var li = $("#nav_child").clone(false);
	    			$(li).attr("id",data[i].id);
	    			$(li).attr("isChild","1");
	    			$(li).hide();
	                $(li).find("a").text(data[i].name);
	    			$(parent).append(li);
	    		}
    		   }
	    	   $("li[isChild='0']").mouseenter(function(){
	    	        var s=$(this).find("li");
	    	        if(s.length>0){
	    	        	for(var i=0;i<s.length;i++){
	    	        		$(s[i]).show("700");
	    	        	}
	    	        }
	    	    })    
    	      $("#category li").click(function(event){
    	    	event.stopPropagation();
		        var v = $(this).find("a:first").text();
		        page({
		                pageSize : 10,
		                url:'/web/getCategoryArticle.do',
		                addContent:addContentToCategory,
		                tagName:v
		         });
		         })
    	   }
    });
	
   $("#category").mouseleave(function(){
    	$("#category").hide();
    	$("li[isChild='1']").each(function(){
    		$(this).hide();
    	})
   })
    
})
</script>


