<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>lyh2016.cn - 后台管理</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<!-- VENDOR CSS -->
<link rel="stylesheet" type="text/css" href="/dist/css/wangEditor.css">
                             
<link rel="stylesheet" href="/assets/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/assets/vendor/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="/assets/vendor/linearicons/style.css">
<link rel="stylesheet" href="/assets/vendor/toastr/toastr.min.css">
                             
<!-- MAIN CSS -->
<link rel="stylesheet" href="/assets/css/main.css">
<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
<link rel="stylesheet" href="/assets/css/demo.css">
<!-- GOOGLE FONTS -->
<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
<!-- ICONS -->
<link rel="apple-touch-icon" sizes="76x76" href="/assets/img/apple-icon.png">
<link rel="icon" type="image/png" sizes="96x96" href="/assets/img/favicon.png">
</head>

<body>
	<!-- WRAPPER -->
	<div id="wrapper">
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<!-- OVERVIEW -->
					<div class="panel panel-headline">
						<div class="panel-heading">
							<h3 class="panel-title">编辑新文章</h3>
							<p class="panel-subtitle">Period: edit . </p>
						</div>
						<div class="panel-body">
							<div style="width:80%; margin:0 auto;">
								<form class="form-horizontal" id="pageForm" action="/admin/saveArticle" method="post" enctype="multipart/form-data">
									
									<label>题目:</label>
								
									<input type="text" value="" name="pageTitle" class="form-control" placeholder="Search dashboard..." >															
									<br>
									<label>标签:</label>
									<select  class="form-control" name="pageTag" style="width: 65%;">
									</select>
									
									<div style="height: 60px; width: 25%; margin-top: -54px; margin-left:75%; ">
										<label>是否公开:</label>
										<label class="fancy-radio" style="margin-top: 7px;">
											<input name="pageIsPrivateToByte" value="0" type="radio" checked="checked">
											<span><i></i>公开</span>
										</label>
										<label class="fancy-radio" style="margin-left: 82px;margin-top: -25px; ">
											<input name="pageIsPrivateToByte" value="1" type="radio">
											<span><i></i>私密</span>
										</label>
										
									</div>
									<br>
									<label>封面图片:</label>
									<input type="file" name="headFile" id="file1" value="" style="DISPLAY: none;">
									<div class="input-group" style="width: 60%;">
										<input type="text" value="" class="form-control" placeholder="Search dashboard..." id="file_text">
										<span class="input-group-btn" id="file_button"><button type="button" class="btn btn-primary">Click me</button></span>
									</div>
									<br>
									<label>内容:</label>
									<textarea id="div1" style="height: 300px;" >
									    <p>文章的第一段将显示在web页面,请注意不要过长(130字内)</p>
									</textarea>	
									<input type="hidden" name="pageContent" id="text1"/>
									<br>
									
									
									<div style="width: 80px; margin-left:  90%; ">
										<button type="button" id="submit1" class="btn btn-success" >提交</button>		
									</div>	
								</form>	
							</div>	
						</div>
					</div>
				</div>
				

				<div class="panel-body">
				
				</div>
			</div>

			<!-- END TASKS -->
		</div>
		<!-- END MAIN -->
		<div class="clearfix"></div>
	</div>
	
	
	<!-- END WRAPPER -->
	<!-- Javascript -->

	<script src="/assets/vendor/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="/dist/js/wangEditor.js"></script>
	<script src="/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="/assets/vendor/toastr/toastr.min.js"></script>
	<script src="/assets/scripts/klorofil-common.js"></script>
	<script>
	$(document).ready(function() {
		
	  
		var flag = "${empty flag}";  
		if(flag != "true" ){
			myPrompt();
		}
		
		 var editor = new wangEditor('div1');
	
		// 上传图片（举例）
	    editor.config.uploadImgUrl = '/pic/upload';

	    // 配置自定义参数（举例）
	    editor.config.uploadParams = {
	        token: 'abcdefg',
	        user: 'wangfupeng1988'
	    };

	    // 设置 headers（举例）
	    editor.config.uploadHeaders = {
	        'Accept' : 'text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8',
	        'Cache-Control':'max-age=0',
	        'Upgrade-Insecure-Requests':1
	    };

	    // 隐藏掉插入网络图片功能。该配置，只有在你正确配置了图片上传功能之后才可用。
	    editor.config.hideLinkImg = false;
	   
   		 editor.create();
   		 
   		 $("#submit1").click(function(){
   			if(confirm("是否提交")){
   			 var html = editor.$txt.html();
   			 $("#text1").val(html.trim());
   			// $.post("/admin/saveArticle",$("#pageForm").serialize(),function(data){
   			//	 
   			// });
   			$("#pageForm").submit();
   			}else{
   				return false;
   			}
   		 });
   		 
   		 $("#file_button").click(function(){
    		 	$("#file1").click();
    		 });

   		 $("#file1").change(function(){
   		 	$("#file_text").val($(this).val())
   		 })
   		 
   		 
	 })

	</script>

		
</body>

</html>
