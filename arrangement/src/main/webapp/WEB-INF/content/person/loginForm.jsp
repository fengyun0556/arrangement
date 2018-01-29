<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
<form:form modelAttribute="registerInitDTO" method="post" action="${pageContext.request.contextPath}/person/login">
	<table align="center">
		<tr>
			<td align="right">登录名：</td>
			<td><form:input path="loginName"></form:input></td>
			<td><font color="red"><form:errors path="loginName"/></font></td>
		</tr>
		<tr>
			<td align="right">密码：</td>
			<td><form:password path="userPassword"></form:password></td>
			<td><font color="red"><form:errors path="userPassword"/></font></td>
		</tr>
		<tr>
			<td align="center" colspan="3">
				<input value="登录" type="submit"/>
				<input value="没有账号？点击注册" type="button" onclick="location.href='${pageContext.request.contextPath}/person/registerInit'">
			</td>
			
		</tr>
	</table>
</form:form>
</body>
</html>