<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>lyh2016.cn - 个人信息</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<!-- VENDOR CSS -->
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
		<!-- NAVBAR -->
		<nav class="navbar navbar-default navbar-fixed-top">
			<%@ include file="nav.jsp" %>  
		</nav>
		<!-- END NAVBAR -->
		<!-- LEFT SIDEBAR -->
		<div id="sidebar-nav" class="sidebar">
			<%@ include file="siderbar-nav.jsp" %>  
		</div>
		<!-- END LEFT SIDEBAR -->
		<!-- MAIN -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<div class="panel panel-profile">
						<div class="clearfix" >
							<!-- LEFT COLUMN -->
							<div id="left" class="left profile-right" style="margin-right:190px;">
								<!-- PROFILE HEADER -->
								<div class="profile-header">
									<div class="overlay"></div>
									<div class="profile-main">
										<img src="${mp.headPortraitUrl }" class="img-circle" alt="Avatar">
										<h3 class="name">${mp.name }</h3>
										<span class="online-status status-available">Available</span>
									</div>
									
								</div>
								<!-- END PROFILE HEADER -->
								<!-- PROFILE DETAIL -->
								<div class="profile-detail">
									<div class="profile-info">
										<h4 class="heading">Basic Info</h4>
										<ul class="list-unstyled list-justify">
											<li>年龄 <span>${mp.age }</span></li>
											<li>Email <span>${mp.email }</span></li>
											<li>Website <span><a href="#">${mp.mywebUrl }</a></span></li>
										</ul>
									</div>
									<div class="profile-info">
										<h4 class="heading">Social</h4>
										<ul class="list-inline social-icons ">
											<li><a href="${mp.weibo }"  target="_blank" class="facebook-bg"><i class="fa fa fa-weibo" style="margin-top:10px;"></i></a></li>
											<li><a href="${mp.github }"  target="_blank" class="github-bg"><i class="fa fa-github" style="margin-top:10px;"></i></a></li>
										</ul>
									</div>
									<div class="profile-info">
										<h4 class="heading">About Me</h4>
										<p>${mp.introduction }</p>
									</div>
									<div class="text-center" id="edit"><a href="#" class="btn btn-primary">Edit Profile</a></div>
								</div>
								<!-- END PROFILE DETAIL -->
							</div>
							<!-- END LEFT COLUMN -->
							<!-- 修改个人信息 -->
								<div id="right" class="profile-right">
								<h4 class="heading">修改个人信息</h4>
								<!-- form  -->
								    <br>
									<form id="profileForm" class="form-horizontal" style="width: 90%;" action="/admin/updateProfile" method="post" enctype="multipart/form-data">
										<input type="hidden" value="${mp.id }" name="id">
										<div class="profile-main" style="margin-left: 50%;" id="head">
											<img src="${mp.headPortraitUrl }" class="img-circle" alt="Avatar" title="100*100/.png .jpg">
										</div>
									
										<input type="file" name="headImg" id="file2" >
										
										<br><br>

										<div class="form-group">
										    <label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
										    <div class="col-sm-10">
										      <input type="text" class="form-control" id="inputEmail3" value="${mp.name }" name="name">
										    </div>
										 </div>

										 <div class="form-group">
										    <label for="inputEmail3" class="col-sm-2 control-label">年龄</label>
										    <div class="col-sm-10">
										      <input type="text" class="form-control" id="inputEmail3" value="${mp.age }" name="age">
										    </div>
										 </div>

										 <div class="form-group">
										    <label for="inputEmail3" class="col-sm-2 control-label">email</label>
										    <div class="col-sm-10">
										      <input type="eamil" class="form-control" id="inputEmail3" value="${mp.email }" name="email">
										    </div>
										 </div>

										 <div class="form-group">
										    <label for="inputEmail3" class="col-sm-2 control-label">微博</label>
										    <div class="col-sm-10">
										      <input type="text" class="form-control" id="inputEmail3" value="${mp.weibo }" name="weibo">
										    </div>
										 </div>

										 <div class="form-group">
										    <label for="inputEmail3" class="col-sm-2 control-label">github</label>
										    <div class="col-sm-10">
										      <input type="text" class="form-control" id="inputEmail3" value="${mp.github }" name="github">
										    </div>
										 </div>

										 <div class="form-group">
										    <label for="inputEmail3" class="col-sm-2 control-label">个人简介</label>
										    <div class="col-sm-10">
										      <input type="text" class="form-control" id="inputEmail3" value="${mp.introduction }" name="introduction">
										    </div>
										 </div>

										 <div class="form-group">
										    <label for="inputEmail3" class="col-sm-2 control-label">网站地址</label>
										    <div class="col-sm-10">
										      <input type="text" class="form-control" id="inputEmail3" value="${mp.mywebUrl }" name="mywebUrl">
										    </div>
										 </div>
										 <br>
										<button type="button" class="btn btn-success update_herf" id="add" style="margin-left:87%;">提交</button>
									</form>
										<br><br>
									
								</div>
								<!-- END TABBED CONTENT -->
							</div>
							<!-- END RIGHT COLUMN -->
						</div>
					</div>
				</div>
			</div>
			
			<!-- END MAIN CONTENT -->
		</div>
		<!-- END MAIN -->
		<div class="clearfix"></div>
			<%@ include file="footer.jsp" %>  
	</div>
	<!-- END WRAPPER -->
    <script src="/assets/vendor/jquery/jquery.min.js"></script>
    <script src="/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
    <script src="/assets/vendor/toastr/toastr.min.js"></script>
    <script src="/assets/scripts/klorofil-common.js"></script>
	<script type="text/javascript">
		$().ready(function(){
			
			var flag = "${empty flag}";  
	        if(flag != "true" ){
	            myPrompt("操作成功");
	        }
			
			$("#profile").addClass("active");
			
			var s=1;
			
			$("#right").hide();
			
			$("#file2").hide();
			
			$("#edit").click(function(){
				if(s==1){
					$("#left").attr("class","profile-left");
					$("#div1").fadeTo("slow",0.15);
					$("#right").fadeToggle(1000);
					s=2;
				}else{
					$("#left").attr("class","left profile-right");
					$("#div1").fadeTo("slow",0.15);
					$("#right").fadeToggle(1000);
					s=1;	

				}
			});

			$("#head").click(function(){
				$("#file2").click();
				
			});
			
			$("#add").click(function(){
				var v = confirm('是否提交');
				if(v){
					$("#profileForm").submit();
				}
				
			})
		});



	</script>
</body>

</html>
