<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome</title>
</head>
<body>
message:<br>
<hr>
${requestScope.message}
<br>
<form action="hello" method="post">
	method:post
	<input type="submit" value="submit"/>
</form>
<br>
<form action="hello" method="get">
	method:get
	<input type="submit" value="submit"/>
</form>
method:${requestScope.method}
</body>
</html>
