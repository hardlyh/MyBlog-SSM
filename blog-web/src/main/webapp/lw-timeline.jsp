<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  <meta http-equiv="Cache-Control" content="no-siteapp"/>
  <link rel="icon" type="image/png" href="assets/i/favicon.png">
  <meta name="mobile-web-app-capable" content="yes">
  <link rel="icon" sizes="192x192" href="assets/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">
  <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
  <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
  <meta name="msapplication-TileImage" content="assets/i/app-icon72x72@2x.png">
  <meta name="msapplication-TileColor" content="#0e90d2">
  <link rel="stylesheet" href="assets/css/amazeui.min.css">
  <link rel="stylesheet" href="assets/css/app.css">
  <style type="text/css">
   li{
        list-style:none;
        line-height:30px;
   }
  </style>
</head>

<body id="blog-article-sidebar">
<!-- header start -->
 <%@include file="nav.jsp"%> 
<!-- nav end -->
<hr>
<!-- content srart -->
<div class="am-g am-g-fixed blog-fixed blog-content">
    <div class="am-u-md-8 am-u-sm-12">
      <article class="am-article blog-article-p">
        <div class="am-article-hd">
          <h1 class="am-article-title blog-text-center">文章存档</h1>
          <p class="am-article-meta blog-text-center">
              <span><a href="#" class="blog-color">article &nbsp;</a></span>
              <span><a href="#">@myself &nbsp;</a></span>
          </p>
          <ul>
             <li>
                 <span class="am-u-sm-4 am-u-md-2 timeline-span"><b>Time</b></span>
                 <span class="am-u-sm-8 am-u-md-6"><a href="#" ><b>Title</b></a></span>
                 <span class="am-u-sm-4 am-u-md-2 am-hide-sm-only"><b>Tag</b></span>  
                 <span class="am-u-sm-4 am-u-md-2 am-hide-sm-only"><b>View</b></span>
              </li>
          </ul>
          <br>
          <hr>
          <ul id="ul_clone">
              <div style="display:none">
                 <li id="li_clone">
                    <span class="am-u-sm-4 am-u-md-2 timeline-span">2015/10/18</span>
                    <span class="am-u-sm-8 am-u-md-6"><a href="#" name="title">君埋泉下泥销骨，我寄人间雪满头</a></span>
                    <span class="am-u-sm-4 am-u-md-2 am-hide-sm-only" name="tag">lyh</span>  
                    <span class="am-u-sm-4 am-u-md-2 am-hide-sm-only" name="proview">ss</span>
                  </li>
              </div>
          </ul>
        </div>        
        <div class="am-article-bd">
        </p>
        </div>
      </article>
        
        <div class="am-g blog-article-widget blog-article-margin">
          <div class="am-u-lg-4 am-u-md-5 am-u-sm-7 am-u-sm-centered blog-text-center">
            <span class="am-icon-tags"> &nbsp;</span><a href="#">命中含笑m</a>
            <hr>
          </div>
        </div>

    

        

        <hr>
    </div>

   
     <%@include file="left.jsp" %>
</div>
<!-- content end -->


 <footer class="blog-footer">
   <%@include file="foot.jsp"%>
  </footer>

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="assets/js/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script src="assets/js/amazeui.min.js"></script>
<!-- <script src="assets/js/app.js"></script> -->
<script type="text/javascript">
    $("#pageList").addClass("am-active");
    
    $.post('/web/timelineArticle.do',function(data){
        if(data!=null){
            for(var i=0;i<data.length;i++){
                var li = $("#li_clone").clone(false);
                $(li).find(".timeline-span").text(data[i].gmtModified);
                $(li).find("a[name='title']").text(data[i].pageTitle);
            //  $(li).find("a[name='title']").attr('href',data[i].pageHtmlUrl);
                $(li).find("span[name='tag']").text(data[i].pageTag);
                $(li).find("span[name='proview']").text(data[i].pageViewingCount);
                $("#ul_clone").append(li);
            }
        }
    })
    
    </script>
</body>
</html>