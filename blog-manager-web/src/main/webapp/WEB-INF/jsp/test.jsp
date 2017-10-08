<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/assets/vendor/toastr/toastr.min.css">
<script src="/assets/vendor/jquery/jquery.min.js"></script>
<script src="/assets/vendor/toastr/toastr.min.js"></script>
<script src="/assets/scripts/klorofil-common.js"></script>
</head>
<body>



	<input type="button" class="clickTest btn btn-primary" click-option="top-right" click-status="success" click-content="1" value="1">
	<input type="button" class="clickTest" click-option="top-center" click-status="success" click-content="2" value="12">
	<input type="button" class="clickTest" click-option="top-right" click-status="error" click-content="3" value="13">
	<input type="button" class="clickTest" click-option="top-center" click-status="" error"" click-content="4" " value="14">
</body>


<a href="updateTag.html?name=ssss">ssss</a>

<script type="text/javascript">
	$(function() {
		myPrompt();
		$(".clickTest").click(function() {
			test('删除成功');
		})

	})
</script>

</html>