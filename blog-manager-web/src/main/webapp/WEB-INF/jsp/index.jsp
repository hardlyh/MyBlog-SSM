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
<!-- MAIN CSS -->
<link rel="stylesheet" href="/assets/css/main.css">
<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
<link rel="stylesheet" href="/assets/css/demo.css">
<!-- GOOGLE FONTS -->
<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
<!-- ICONS -->
<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
<link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
<link rel="stylesheet" href="/assets/vendor/chartist/css/chartist-custom.css">
<style type="text/css">
</style>

<body>
	<!-- WRAPPER --><div id="wrapper">
	<!-- NAVBAR -->
	<nav class="navbar navbar-default navbar-fixed-top"> <%@ include file="nav.jsp"%> </nav>
	<!-- END NAVBAR -->
	<!-- LEFT SIDEBAR -->
	<div id="sidebar-nav" class="sidebar">
	   <%@ include file="siderbar-nav.jsp"%>
	</div>
	<!-- END LEFT SIDEBAR -->
	<!-- MAIN -->
	<div class="main"> 
		<!-- MAIN CONTENT -->
		<div class="main-content">
			<div class="container-fluid">
				<!-- OVERVIEW -->
				<div class="panel panel-headline">
					<div class="panel-heading">
						<h3 class="panel-title">统计数据</h3>
						<p class="panel-subtitle">Period: </p>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-md-3">
								<div class="metric">
									<span class="icon"><i class="fa fa-eye" style="margin-top: 30%;"></i></span>
									<p>
										<span class="number">${infor.totalcount }</span> <span class="title">访问量</span>
									</p>
								</div>
							</div>

							<div class="col-md-3">
								<div class="metric">
									<span class="icon"><i class="fa fa-sun-o" style="margin-top: 30%;"></i></span>
									<p>
										<span class="number">${infor.todaycount }</span> <span class="title">日访问量</span>
									</p>
								</div>
							</div>
							<div class="col-md-3">
								<div class="metric">
									<span class="icon"><i class="fa fa-file-text-o" style="margin-top: 30%;"></i></span>
									<p>
										<span class="number">${infor.articlecount }</span> <span class="title">文章数</span>
									</p>
								</div>
							</div>

							<div class="col-md-3">
								<div class="metric">
									<span class="icon"><i class="fa fa-adjust" style="margin-top: 30%;"></i></span>
									<p>
										<span class="number">${privates }</span> <span class="title">私密文章</span>
									</p>
								</div>
							</div>

						</div>


						<div class="row">


							<div class="col-md-9" style="width: 80%; margin-left: 10%;">
								<h3 class="panel-title">近五天访问人数</h3>
								<br>
								<div id="headline-chart" class="ct-chart"></div>
							</div>

						</div>
					</div>
				</div>
			</div>
			<!-- END OVERVIEW -->


			<!-- TASKS -->
			<!-- 
							<div class="panel">
								<div class="panel-heading">
									<h3 class="panel-title">My Tasks</h3>
									<div class="right">
										<button type="button" class="btn-toggle-collapse"><i class="lnr lnr-chevron-up"></i></button>
										<button type="button" class="btn-remove"><i class="lnr lnr-cross"></i></button>
									</div>
								</div>
								 -->


 
			<div class="col-md-4" style="width: 80%; margin-left: 10%;">
				<!-- VISIT CHART -->
				<!--
				<div class="panel">
					<div class="panel-heading">
						<h3 class="panel-title">文章占比</h3>
						<div class="right">
							<button type="button" class="btn-toggle-collapse">
								<i class="lnr lnr-chevron-up"></i>
							</button>
							<button type="button" class="btn-remove">
								<i class="lnr lnr-cross"></i>
							</button>
						</div>
					</div>
					<div class="panel-body">
						<div id="visits-chart" class="ct-chart"></div>
					</div>
				</div>
				 -->
				<!-- END VISIT CHART -->
			</div>
			</iframe>
        </div>
		</div>
	</div>
</div>
<!-- END MAIN -->
<!-- END WRAPPER -->
<!-- Javascript-->
<script src="/assets/vendor/jquery/jquery.min.js"></script>
<script src="/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="/assets/scripts/klorofil-common.js"></script>
<script src="/assets/vendor/toastr/toastr.min.js"></script>
<script src="/assets/vendor/chartist/js/chartist.min.js"></script>
<script>
		$("#index").addClass("active");
		$(function() {
			var ajaxdata;
			
			var labels;
			
			var labels1;
			
			var series;
			
			var series1;
			
			$.post("/admin/indexInfor",function(data){
				<!-- -->
				var data, options;
				// headline charts
				data = {
					labels : data.time ,
					series : [ data.amount ]
				};

				options = {
					height : 300,
					showArea : true,
					showLine : false,
					showPoint : true,
					fullWidth : false,
					axisX : {
						showGrid : false
					},
					lineSmooth : false,
				};

				new Chartist.Line('#headline-chart', data, options);

				
				
				// visits chart
				
			/*	data = {
					labels:
					series: [
						
					] 
				};

				options = {
					height: 300,
					axisX: {
						showGrid: false
					},
				};

			  new Chartist.Bar('#visits-chart', data, options);*/
				
				
				
				var updateInterval = 3000; // in milliseconds

				setInterval(function() {
					var randomVal;
					randomVal = getRandomInt(0, 100);
				}, updateInterval);

				function getRandomInt(min, max) {
					return Math.floor(Math.random() * (max - min + 1)) + min;
				}

			});
			
			
		});
	</script>
</body>

</html>
