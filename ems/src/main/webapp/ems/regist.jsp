<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<title>注册</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/ems/css/style.css" />
</head>

<body>
	<div id="wrap">
		<div id="top_content">
			<div id="header">
				<div id="rightheader">
					<p>
						2009/11/20
						<br />
					</p>
				</div>
				<div id="topheader">
					<h1 id="title">
						<a href="#">main</a>
					</h1>
				</div>
				<div id="navigation">
				</div>
			</div>
			<div id="content">
				<p id="whereami">
				</p>
				<h1>
					注册
				</h1>
				<form action="${pageContext.request.contextPath}/user/regist" method="post">
					<table cellpadding="0" cellspacing="0" border="0" class="form_table">
						<tr>
							<td valign="middle" align="right">
								用户名:
							</td>
							<td valign="middle" align="left">
								<input type="text" class="inputgri" name="username" />
							</td>
						</tr>
						<tr>
							<td valign="middle" align="right">
								真实姓名:
							</td>
							<td valign="middle" align="left">
								<input type="text" class="inputgri" name="realname" />
							</td>
						</tr>
						<tr>
							<td valign="middle" align="right">
								密码:
							</td>
							<td valign="middle" align="left">
								<input type="password" class="inputgri" name="password" />
							</td>
						</tr>
						<tr>
							<td valign="middle" align="right">
								性别:
							</td>
							<td valign="middle" align="left">
								男
								<input type="radio" class="inputgri" name="sex" value="男" checked="checked" />
								女
								<input type="radio" class="inputgri" name="sex" value="女" />
							</td>
						</tr>

						<tr>
							<td valign="middle" align="right">
								验证码:
								<img id="num" src="${pageContext.request.contextPath}/user/getImage" />
								<a href="javascript:;"
									onclick="document.getElementById('num').src = '${pageContext.request.contextPath}/user/getImage?'+ (new Date().getTime())">换一张</a>
								<!-- 
									dateObject.getTime()
										返回指定的日期和时间距 1970 年 1 月 1 日午夜（GMT 时间）之间的毫秒数
									...?+(new Date().getTime())
										重复请求的的路径浏览器用缓存
										url后加时间戳让浏览器请求新的
										常用于验证码申请、数据库数据请求等 
								-->
							</td>
							<td valign="middle" align="left">
								<input type="text" class="inputgri" name="code" />
							</td>
						</tr>
					</table>
					<p>
						<input type="submit" class="button" value="Submit &raquo;" />
						<input type="button" class="button" onclick="location.href='${pageContext.request.contextPath}/ems/login.jsp'"
							value="Login &raquo;" />
					</p>
				</form>
			</div>
		</div>
		<div id="footer">
			<div id="footer_bg">
				ABC@126.com
			</div>
		</div>
	</div>
</body>

</html>