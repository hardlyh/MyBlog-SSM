<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>lyh2016.cn - 分类更新</title>
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
							<h3 class="panel-title">修改标签</h3>
							<p class="panel-subtitle">Period: tag_message .</p>
						</div>
						<div class="panel-body">
							<div style="width: 80%; margin: 0 auto;">
								<form id="saveForm" class="form-horizontal"  method="post">
									<input type="hidden" name="id" value="${param.id }">
									<label>名字:</label> 
									<input type="text" value="${param.name }" class="form-control" name="name" > 
									<br>
									
									<label>选择父级:</label>
                                        <select  class="form-control" name="parentId" style="width: 65%;">
                                            <option value="0">Null(无)</option>
                                        </select>  

									<div style="width: 80px; margin-left: 90%;">
										<br>
										<button type="button" id="saveButton" class="btn btn-success update_herf">提交</button>
									</div>

								</form>
							</div>

						</div>
					</div>
				</div>


				<div class="panel-body"></div>
			</div>

			<!-- END TASKS -->
		</div>


		<!-- END MAIN -->
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
	<!-- END WRAPPER -->
	<!-- Javascript -->
<script src="/assets/vendor/jquery/jquery.min.js"></script>
<script src="/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="/assets/vendor/toastr/toastr.min.js"></script>
<script src="/assets/pagination/jqPaginator.min.js"></script>
<script src="/assets/scripts/klorofil-common.js"></script>
</body>
<script src="/assets/vendor/jquery/jquery.min.js"></script>
<script src="/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="/assets/vendor/toastr/toastr.min.js"></script>
<script src="/assets/pagination/jqPaginator.min.js"></script>
<script src="/assets/scripts/klorofil-common.js"></script>
<script src="/assets/scripts/Myblog-commons.js"></script>

<script type="text/javascript">
$(function(){
	$.post('/admin/listIsParent',function(data){
	    var $m = $("select[name='parentId']");
	    if(data!=null ){
	        for(var i=0;i<data.length;i++){
	            if(${param.parentId} == data[i].id){
	                    $m.append("<option selected='selected' value='"+data[i].id+"'>"+data[i].name+"</option>");
	            }else{
	                $m.append("<option value='"+data[i].id+"'>"+data[i].name+"</option>");
	            }
	        }
	    }
	    
	})
	
	 $("#saveButton").click(function(){
          var v = confirm('是否提交')
          if(v){
              $.post('/admin/updateCategory',$("#saveForm").serialize(),function(data){
                  if(data.status==200){
                      myPrompt('更新操作成功');
                  }else{
                	  $("input[name='name']").val('');
                      myPrompt('更新操作失败','error');
                  }
              })
          }
      })

	
})


$("#tag").addClass("active");
</script>

</html>
