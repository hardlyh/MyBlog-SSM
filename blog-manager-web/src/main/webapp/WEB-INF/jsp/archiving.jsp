<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<heml>

<head>
<title>lyh2016.cn - 文章归档</title>
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
		<%@ include file="nav.jsp"%>
		</nav>
			
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
							<h3 class="panel-title">文章归档</h3>
							<p class="panel-subtitle">Period: timeline .</p>
						</div>
						<div class="panel-body">

							<div style="width: 80%; margin: 0 auto;">


								
								<div class="panel-body">
									<!-- 主要内容 -->
									<table class="table">
										<colgroup>
											<col style="width: 60%">
											<col style="width: 15%;">
											<col style="width: 25%;">
										</colgroup>
										<!-- table列表 -->

										<c:forEach items="${map }" var="m">
											
													<th><h3>${m.key }</h3></th>
												<tbody>
													<tr>
														<td><a href="../${list.htmlUrl}.jsp">${list.title }(${list.pageview })</a></td>
														<td>${list.tag }</td>
														<td>${list.time }</td>
													</tr>
												</tbody>
										</c:forEach>
									</table>


								</div>
							</div>
						</div>

					</div>
				
					</div>
				</div>
			</div>


			<div class="panel-body"></div>
		</div>


		<!-- END MAIN -->
		<div class="clearfix"></div>
		<%@ include file="footer.jsp"%>

	</div>


	<!-- END WRAPPER -->
	<!-- Javascript -->
    <script src="/assets/vendor/jquery/jquery.min.js"></script>
    <script src="/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
    <script src="/assets/vendor/toastr/toastr.min.js"></script>
    <script src="/assets/scripts/klorofil-common.js"></script>


	<script type="text/javascript">
		$("#archiving").addClass("active");
	</script>
</body>

</html>