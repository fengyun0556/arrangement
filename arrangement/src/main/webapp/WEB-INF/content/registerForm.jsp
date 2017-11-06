<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
<form action="register" method="post">
	<table>
		<tr>
			<td><label>登录名</label></td>
			<td><input type="text" id="loginname" name="loginname"></input></td>
		</tr>
		<tr>
			<td><label>密码</label></td>
			<td><input type="password" id="password" name="password"></input></td>
		</tr>
		<tr>
			<td><label>真实姓名</label></td>
			<td><input type="text" id="username" name="username"></input></td>
		</tr>
		<tr>
			<td><input type="submit" value="注册"></input></td>
		</tr>
	</table>
</form>
</body>
</html>