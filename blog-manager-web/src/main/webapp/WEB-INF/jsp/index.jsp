<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<title>lyh2016.cn - 后台管理</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<!-- VENDOR CSS -->
<link rel="stylesheet" href="/assets/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/assets/vendor/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="/assets/vendor/linearicons/style.css">
<link rel="stylesheet" href="/assets/vendor/toastr/toastr.min.css">
<link rel="stylesheet" href="/assets/vendor/chartist/css/chartist-custom.css">
<!-- MAIN CSS -->
<link rel="stylesheet" href="/assets/css/main.css">
<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
<link rel="stylesheet" href="/assets/css/demo.css">
<!-- GOOGLE FONTS -->
<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
<!-- ICONS -->
<link rel="apple-touch-icon" sizes="76x76" href="/assets/img/apple-icon.png">
<link rel="icon" type="image/png" sizes="96x96" href="/assets/img/favicon.png">
<style type="text/css">
</style>
<body>
	<!-- 页头 -->
	<div id="wrapper">
		<nav class="navbar navbar-default navbar-fixed-top">
		<div class="brand">
			<a href="index.html"><img src="assets/img/logo-dark.png" alt="Klorofil Logo" class="img-responsive logo"></a>
		</div>
		<div class="container-fluid">
			<div class="navbar-btn">
				<button type="button" class="btn-toggle-fullwidth">
					<i class="lnr lnr-arrow-left-circle"></i>
				</button>
			</div>
			<div id="navbar-menu">
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"> <img src="assets/img/user-medium.png" class="img-circle" alt="Avatar"> <span>${session.user.username }</span>
							<i class="icon-submenu lnr lnr-chevron-down"></i></a>
						<ul class="dropdown-menu">
							<li><a href="myProfileAction_findMyProfile.action"><i class="lnr lnr-user"></i> <span>个人信息</span></a></li>
							<li><a href="adminAction_updateOne"><i class="lnr lnr-cog"></i> <span>修改密码</span></a></li>
							<li><a href="adminAction_quit" onclick="return confirm('是否注销');"><i class="lnr lnr-exit"></i> <span>注销</span></a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		</nav>
		<div id="sidebar-nav" class="sidebar">
			<div class="sidebar-scroll">
				<nav>
				<ul class="nav">
					<li><a style="cursor:pointer;" id="index" class=""><i class="lnr lnr-home"></i> <span>主页</span></a></li>
					<li><a style="cursor:pointer;" id="editPage" class=""><i class="lnr lnr-pencil"></i> <span>编辑新文章</span></a></li>
					<li><a style="cursor:pointer;" id="tag" class=""><i class="lnr lnr-bookmark"></i> <span>标签管理</span></a></li>
					<li><a style="cursor:pointer;" id="pageList" class=""><i class="lnr lnr-code"></i> <span>文章管理</span></a></li>
					<li><a style="cursor:pointer;" id="profile" class=""><i class="lnr lnr-dice"></i> <span>个人信息</span></a></li>
					<li><a style="cursor:pointer;" id="article" class=""><i class="lnr lnr-linearicons"></i> <span>网页管理</span></a></li>
					<li><a style="cursor:pointer;" id="message" class=""><i class="lnr lnr-alarm"></i> <span>图片管理</span></a></li>
					<li><a style="cursor:pointer;" id="archiving" class=""><i class="lnr lnr-text-format"></i> <span>文章归档</span></a></li>
				</ul>
				</nav>
			</div>
		</div>
	</div>
	<!-- 包含内容  -->
	<div class="embed-responsive embed-responsive-16by9">
		<iframe class="embed-responsive-item" id="jumpPage" src="/admin/index2.html"> </iframe>
	</div>


	<!-- 页脚 -->
	<div class="clearfix"></div>
	<footer>
	<div class="container-fluid">
		<p class="copyright">
			&copy; 2017 <a href="#" target="_blank">Theme I Need</a>. All Rights Reserved. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a
				href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
		</p>
	</div>
	</footer>
	</div>

</body>
<script src="/assets/vendor/jquery/jquery.min.js"></script>
<script src="/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="/assets/scripts/klorofil-common.js"></script>
<script src="/assets/vendor/toastr/toastr.min.js"></script>
<script src="/assets/vendor/chartist/js/chartist.min.js"></script>
<!-- END WRAPPER -->
<!-- Javascript -->

<script>
	$(function() {
		
		 var flag = "${empty flag}";  
		    if(flag != "true" ){
		        myPrompt('${flag}');
		    }
		    
		
		$("#index").addClass("active");
		$("#index").click(function() {
			$("#jumpPage").attr("src", "/admin/index2.html").ready();
			$(".active").removeClass("active");
			$("#index").addClass("active");
		})

		$("#editPage").click(function() {
			$("#jumpPage").attr("src", "/admin/edit.html");
			$(".active").removeClass("active");
			$("#editPage").addClass("active");
		})
		
		$("#tag").click(function() {
            $("#jumpPage").attr("src", "/admin/tag.html");
            $(".active").removeClass("active");
            $("#tag").addClass("active");
        })

	});
</script>
</html>
