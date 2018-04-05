<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
<title>注册</title>
</head>
<body>
<form:form modelAttribute="personUser" method="post" action="${pageContext.request.contextPath}/person/register">
	<table align="center">
		<tr>
			<td>登录名称/昵称：</td>
			<td><form:input path="loginName"/></td>
			<td><font color="red"><form:errors path="loginName"/></font></td>
		</tr>
		<tr>
			<td>请输入用户密码：</td>
			<td><form:password path="userPassword"/></td>
			<td><font color="red"><form:errors path="userPassword"/></font></td>
		</tr>
		<tr>
			<td>请重新输入用户密码：</td>
			<td><form:password path="" id="rePassword" /></td>
			<td></td>
		</tr>
		<tr>
			<td colspan="3" align="center">
				<input type="submit" value="提交" />
				<input type="button" value="已有账号，直接登录" onclick="location.href='${pageContext.request.contextPath}/person/loginForm'"/>
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>