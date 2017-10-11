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
  <link rel="icon" type="image/png" href="/assets/i/favicon.png">
  <meta name="mobile-web-app-capable" content="yes">
  <link rel="icon" sizes="192x192" href="/assets/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">
  <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
  <link rel="apple-touch-icon-precomposed" href="/assets/i/app-icon72x72@2x.png">
  <meta name="msapplication-TileImage" content="/assets/i/app-icon72x72@2x.png">
  <meta name="msapplication-TileColor" content="#0e90d2">
  <link rel="stylesheet" href="/assets/css/amazeui.min.css">
  <link rel="stylesheet" href="/assets/css/app.css">
</head>

<body id="blog-article-sidebar">
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
        <li><a href="webPageAction_getArticle">知识整理</a></li>
        <li id="aboutWeb"><a href="aboutWeb.jsp">关于本站</a></li>
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

<!-- content srart -->
<div class="am-g am-g-fixed blog-fixed blog-content">
    <div class="am-u-md-8 am-u-sm-12">
      <article class="am-article blog-article-p">
        <div class="am-article-hd">
          <h1 class="am-article-title blog-text-center">强22大易用的日期和时间库 Joda Time</h1>
          <p class="am-article-meta blog-text-center">
              <span><a href="#" class="blog-color">article &nbsp;</a></span>-
              <span><a href="#">@myself &nbsp;</a></span>-
              <span><a href="#">2017-10-10</a></span>
          </p>
        </div>        
        <div class="am-article-bd">
        <p class="class="am-article-lead"">
       
          从此摩擦没从
   
        </p>
        </div>
      </article>
        
        <div class="am-g blog-article-widget blog-article-margin">
          <div class="am-u-lg-4 am-u-md-5 am-u-sm-7 am-u-sm-centered blog-text-center">
            <span class="am-icon-tags"> &nbsp;</span><a href="#">标签</a> , <a href="#">母婴用品</a> 
            <hr>
            
          </div>
        </div>
        <hr>
    </div>

     <%@include file="../left.jsp" %>
</div>
<!-- content end -->


  <footer class="blog-footer">
   <%@include file="../foot.jsp"%>
  </footer>

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="/assets/js/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script src="/assets/js/amazeui.min.js"></script>
<!-- <script src="assets/js/app.js"></script> -->
<script type="text/javascript">
	$("#pageList").addClass("am-active");
	
	$(function(){
	    
        
        $("#fenlei").click(function(){
            window.location.href="FreeMarker template error (DEBUG mode; use RETHROW in production!):
The following has evaluated to null or missing:
==> pageContext  [in template "template.jsp" at line 123, column 37]

----
Tip: If the failing expression is known to be legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${pageContext.request.contextPath}  [in template "template.jsp" at line 123, column 35]
----

Java stack trace (for programmers):
----
freemarker.core.InvalidReferenceException: [... Exception message was already printed; see it above ...]
	at freemarker.core.InvalidReferenceException.getInstance(InvalidReferenceException.java:131)
	at freemarker.core.UnexpectedTypeException.newDesciptionBuilder(UnexpectedTypeException.java:77)
	at freemarker.core.UnexpectedTypeException.<init>(UnexpectedTypeException.java:40)
	at freemarker.core.NonHashException.<init>(NonHashException.java:46)
	at freemarker.core.Dot._eval(Dot.java:45)
	at freemarker.core.Expression.eval(Expression.java:78)
	at freemarker.core.Dot._eval(Dot.java:38)
	at freemarker.core.Expression.eval(Expression.java:78)
	at freemarker.core.Expression.evalAndCoerceToString(Expression.java:82)
	at freemarker.core.DollarVariable.accept(DollarVariable.java:41)
	at freemarker.core.Environment.visit(Environment.java:324)
	at freemarker.core.MixedContent.accept(MixedContent.java:54)
	at freemarker.core.Environment.visit(Environment.java:324)
	at freemarker.core.Environment.process(Environment.java:302)
	at freemarker.template.Template.process(Template.java:325)
	at lyh.blog.activemq.listener.MyMessageListener.createPage(MyMessageListener.java:77)
	at lyh.blog.activemq.listener.MyMessageListener.onMessage(MyMessageListener.java:51)
	at org.springframework.jms.listener.AbstractMessageListenerContainer.doInvokeListener(AbstractMessageListenerContainer.java:746)
	at org.springframework.jms.listener.AbstractMessageListenerContainer.invokeListener(AbstractMessageListenerContainer.java:684)
	at org.springframework.jms.listener.AbstractMessageListenerContainer.doExecuteListener(AbstractMessageListenerContainer.java:651)
	at org.springframework.jms.listener.AbstractPollingMessageListenerContainer.doReceiveAndExecute(AbstractPollingMessageListenerContainer.java:315)
	at org.springframework.jms.listener.AbstractPollingMessageListenerContainer.receiveAndExecute(AbstractPollingMessageListenerContainer.java:253)
	at org.springframework.jms.listener.DefaultMessageListenerContainer$AsyncMessageListenerInvoker.invokeListener(DefaultMessageListenerContainer.java:1150)
	at org.springframework.jms.listener.DefaultMessageListenerContainer$AsyncMessageListenerInvoker.executeOngoingLoop(DefaultMessageListenerContainer.java:1142)
	at org.springframework.jms.listener.DefaultMessageListenerContainer$AsyncMessageListenerInvoker.run(DefaultMessageListenerContainer.java:1039)
	at java.lang.Thread.run(Thread.java:745)
