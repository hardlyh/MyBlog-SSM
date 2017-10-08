<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<heml>

<head>
<title>lyh2016.cn - 分类管理</title>
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
							<h3 class="panel-title">分类管理</h3>
							<p class="panel-subtitle">Period: All_Categroy .</p>
						</div>
						<div class="panel-body">

							<div style="width: 80%; margin: 0 auto;">


								<div class="panel-heading">
									<h3 class="panel-title">所有标签:</h3>
								</div>
								<!-- 查询表单
								<form class="form-inline" id="titleForm" style="margin-left: 30%;" >
									<div class="form-group">
										<label for="类别"></label> <input type="text" name="condition" class="form-control" id="exampleInputEmail2" placeholder="标题关键字">
									</div>
									<button type="submit" class="btn btn-link">
										<span class="fa fa-search"></span>
									</button>
								</form> -->
								<!-- tag列表 -->
								<div class="panel-body">
									<table class="table">
										<thead id="rowLogo">
											<tr>
												<th myfile="id">#</th>
												<th myfile="name">类目</th>
												<th myfile="gmtModified">更新时间</th>
												<th>修改</th>
												<th>子/父分类</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody id="contentByajax">  
											
										</tbody>
									</table>
                                    <ul id="M-box" class="pagination"></ul>
								</div>
								<div style="width: 80px; margin-left: 90%;">
									<a href="/admin/addTag.html">
										<button type="button" class="btn btn-success" id="add">添加</button>
									</a>
									<div></div>

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
<script src="/assets/pagination/jqPaginator.min.js"></script>
<script src="/assets/scripts/klorofil-common.js"></script>
<script src="/assets/scripts/Myblog-commons.js"></script>
<script type="text/javascript">
$(function(){
	
    function addContent(data) {
    	var num=1;
           for (var j = 0; j < data.length; j++) {
               var $tr = $("<tr/>");
               $tr.append("<td>" + num + "</td>");
               for (var i = 1; i < arr.length; i++) {
                   var txt = "<td>" + data[j][arr[i]] + "</td>";
                   $tr.append(txt);
               }
               $tr.data("parentId",data[j].parentId);
               $tr.data("name",data[j].name);
               $tr.data("id",data[j].id);
               $tr.append('<td class="look"><a href="Javascript:void(0)"><i class="lnr lnr-pencil"></i></a></td>');
               $tr.append('<td class="list"><a href="Javascript:void(0)"><i class="lnr lnr-list"></i></a></td>');
               $tr.append('<td class="delete"><a href="Javascript:void(0)"><i class="lnr lnr-trash"></i></a></td>');
               $("#contentByajax").append($tr);
               num++;
           }
       }
    
	function addContent2(data) {
		var num=1;
		if(data.length>0){
            for (var j = 0; j < data.length; j++) {
                var $tr = $("<tr/>");
                $tr.append("<td>" + num + "</td>");
                for (var i = 1; i < arr.length; i++) {
                    var txt = "<td>" + data[j][arr[i]] + "</td>";
                    $tr.append(txt);
                }
                $tr.data("parentId",data[j].parentId);
                $tr.data("name",data[j].name);
                $tr.data("id",data[j].id);
                $tr.append('<td class="look"><a href="Javascript:void(0)"><i class="lnr lnr-pencil"></i></a></td>');
                $tr.append('<td class="toParent"><a href="Javascript:void(0)"><i class="lnr lnr-list"></i></a></td>');
                $tr.append('<td class="delete"><a href="Javascript:void(0)"><i class="lnr lnr-trash"></i></a></td>');
                $("#contentByajax").append($tr);
                num++;
           }
		}else{
			var $tr = $("<tr/>");
			$tr.append('<td class="toParent"><a href="Javascript:void(0)"><i class="lnr lnr-list"></i></a></td>');
			$("#contentByajax").append($tr);
		}
		
     }
	
	
    $(document).on('click', '.look', function(){   // 点击修改
        var parentId = $(this).parent().data("parentId");
        var name = $(this).parent().data("name");
        var id = $(this).parent().data("id");
        window.location.href="/admin/updateTag.html?parentId="+parentId+"&&name="+name+"&&id="+id+"";
    })
	
	$(document).on('click', '.list', function(){   // 父级别点击查看
		var $td = $(this).parent();
		page({
            pageSize : 10,
            url:'/admin/AllCategory',   // ajax请求的地址
            parentId:$td.data('id'),
            addContent:addContent2
        });
    })
    
    $(document).on('click', '.delete', function(){  //  点击删除
    	var v = confirm('是否删除');
        if(v){
        	var $td = $(this).parent();
			var id = $td.data('id');
			   $.post('/admin/deleteCategory',{id:id},function(data){
			       if(data.status == 200){
			      	 myPrompt();
			      	 page({
			      		 pageSize : 10,
			      		 url:'/admin/AllCategory',
			      		 addContent:addContent
			      	 });
			       }else{
			      	 myPrompt('删除操作失败','error');
			       }
			   })
        }
    })
    
     $(document).on('click', '.toParent', function(){// 字父类面板点击查看
    	 page({
             pageSize : 10,
             url:'/admin/AllCategory',   // ajax请求的地址
             addContent:addContent  // 自定义方法
         });
    })
    
	page({        
		pageSize : 10,
        url:'/admin/AllCategory',   // ajax请求的地址
        addContent:addContent  // 自定义方法
	});
    
	$("#tag").addClass("active");
	
	})
</script>
</body>

</html>