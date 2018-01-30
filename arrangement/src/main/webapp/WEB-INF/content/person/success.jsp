<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
</head>
<body>
${sessionScope.personUser.loginName}登陆成功！<br>
<input type="button" value="完善账号" onclick="location.href='${pageContext.request.contextPath}/person/registerPerfect/${sessionScope.personUser.loginName}'"></input>
<a href="${pageContext.request.contextPath}/person/logout" >注销</a>
</body>
</html>