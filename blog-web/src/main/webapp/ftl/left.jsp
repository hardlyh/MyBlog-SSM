<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="am-u-md-4 am-u-sm-12 blog-sidebar">
			<div class="blog-sidebar-widget blog-bor">
				<h2 class="blog-text-center blog-title">
					<span>${myprofile.name }</span>
				</h2>
				<img alt="about me" src="${myprofile.headPortraitUrl }" class="blog-entry-img">
				<p><b>age : ${myprofile.age }</b></p>
				<p><b>email : ${myprofile.email }</b></p>
				<p><b>web_url : ${myprofile.mywebUrl }</b></p>
			</div>
			<div class="blog-sidebar-widget blog-bor">
				<h2 class="blog-text-center blog-title">
					<span>Contact ME</span>
				</h2>
				<p>
	                <a href="${myprofile.github }" target="_blank"><span class="am-icon-github am-icon-fw blog-icon" ></span></a>
	                <a href="${myprofile.weibo }" target="_blank"><span class="am-icon-weibo am-icon-fw blog-icon" ></span></a>
	             </p>
			</div>
			
			

		    <div class="blog-sidebar-widget blog-bor">
				<h2 class="blog-title">
					<span>推荐文章</span>
				</h2>
				<ul class="am-list">
				 <#list listPage as lp>
                      <li><a href="/article/${lp.pageHtmlUrl }.html">${lp.pageTitle }(${lp.pageViewingCount })</a></li>
                </#list>
               
				</ul>
			</div>   
		</div>