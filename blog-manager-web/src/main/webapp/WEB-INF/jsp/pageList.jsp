<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<heml>

<head>
<title>lyh2016.cn - 文章管理</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<!-- VENDOR CSS -->
<link rel="stylesheet" href="/assets/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/assets/vendor/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="/assets/vendor/linearicons/style.css">
<link rel="stylesheet" href="/assets/vendor/toastr/toastr.min.css">
<link rel="stylesheet" href="/assets/pagination/pagination.css">
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
							<h3 class="panel-title">标签管理</h3>
							<p class="panel-subtitle">Period: tag_message .</p>
						</div>
						<div class="panel-body">

							<div style="width: 80%; margin: 0 auto;">


								<div class="panel-heading">
									<h3 class="panel-title">所有文章:</h3>
								</div>

								<div class="panel-body">
									<!-- 主要内容 -->
									<table class="table">
									 <colgroup>
											<col style="width: 5%">
											<col style="width: 40%;">
											<col style="width: 10%">
											<col style="width: 5%">
											<col style="width: 5%">
											<col style="width: 5%"> 
										</colgroup>
										<!-- table列表 -->
										<thead id="rowLogo">
											<tr>
												<th myfile="id">#</th>
												<th myfile="pageTitle">标题</th>
												<th myfile="pageTag">类目</th>
												<th myfile="privateStr">状态</th>
												<th>修改</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody id="contentByajax">
										</tbody>
									</table>
                                    <ul id="M-box" class="pagination"></ul>
								</div>
								<div style="width: 80px; margin-left: 90%;">
									<a href="edit.jsp">
										<button type="button" class="btn btn-success" id="add">添加</button>
									</a>
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
<script src="/assets/vendor/jquery/jquery.min.js"></script>
<script src="/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="/assets/vendor/toastr/toastr.min.js"></script>
<script src="/assets/pagination/jqPaginator.min.js"></script>
<script src="/assets/scripts/klorofil-common.js"></script>
<script src="/assets/scripts/Myblog-commons.js"></script>
</body>

<script type="text/javascript">

$(function(){
	
	var flag = "${empty flag}";  
    if(flag != "true" ){
        myPrompt("更新成功");
    }
	
	$("#pageList").addClass("active");
	function addContent(data) {
		var num=1;
	    for (var j = 0; j < data.length; j++) {
	        var $tr = $("<tr/>");
	        $tr.append("<td>" + num + "</td>");  // 前面的序号
	        for (var i = 1; i < arr.length; i++) {
	            var txt = "<td>" + data[j][arr[i]] + "</td>";
	            $tr.append(txt);
	        }
	        $tr.data('id',data[j].id);  // 将id存放到tr的data域
	        $tr.append('<td class="look"><a href="Javascript:void(0)"><i class="lnr lnr-pencil"></i></a></td>');
	        $tr.append('<td class="delete"><a href="Javascript:void(0)"><i class="lnr lnr-trash"></i></a></td>');
	        $("#contentByajax").append($tr);
	        num++;
	    }
	}
	
	page({        
	    pageSize : 10,
	    url:'/admin/articleList',   // ajax请求的地址
	    addContent:addContent  // 自定义方法
	});
	
	
	
	
	  $(document).on('click', '.look', function(){
		  var td = $(this).parent();
		  window.location.href="/admin/toUpdateArticle?id="+$(td).data('id')+"";
	  })
	
})

</script>


</html>