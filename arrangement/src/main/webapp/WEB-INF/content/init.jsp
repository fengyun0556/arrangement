<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
${sessionScope.personUser.userId}<br>
${sessionScope.personUser.loginName}，欢迎您！<br/>
<input type="button" value="完善账号" onclick="location.href='${pageContext.request.contextPath}/person/registerPerfect/${sessionScope.personUser.userId}'"></input><br>
<a href="${pageContext.request.contextPath}/person/logout" >注销</a>
</body>
</html>