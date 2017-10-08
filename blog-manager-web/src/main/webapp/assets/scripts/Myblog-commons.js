
/*
 * 分页整合
 * 
 * 
 * 
 * */


var arr = new Array();
	
var $ths = $("#rowLogo th");

$ths.each(function() {
    var fi = $(this).attr("myfile");
    if (fi) {
        arr.push(fi);
    }
})
    
function page(options){
	var dft = {
		// 以下为该插件的属性及其默认值
		totalCounts:2,  // 总条数
		pageSize : 2,	// 每页的条数
		url:'',   // ajax请求的地址
		addContent:'',  // 自定义方法
		parentId:0,
		id:0
	};
	
	var ops = $.extend(dft,options);
	
	$('#M-box').jqPaginator({
		totalCounts : ops.totalCounts,
		pageSize : ops.pageSize,
		onPageChange : function(num) {
			data = {
				row : ops.pageSize,
				page : num,
				parentId:ops.parentId,
				id:ops.id
			}
			$.post(ops.url, data, function(data) {
				if (data != null) {
					// 设置页数
					$('#M-box').jqPaginator('option', {
						totalCounts : data.total,
					});
					
					$("#contentByajax").empty();
					ops.addContent(data.rows);
				} else {
					myPrompt("查询错误", 'error');
				}
			})
		},
		visiblePages : 6,
		currentPage : 1,
	});
}