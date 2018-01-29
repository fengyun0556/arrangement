<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
<form:form modelAttribute="registerPerfectDTO" enctype="multipart/form-data" method="post" 
	action="${pageContext.request.contextPath}/person/register">
	<table align="center">
		<tr>
			<td>登录名称/昵称：</td>
			<td><form:input readonly="true" path="loginName"/></td>
			<td><font color="red"><form:errors path="loginName"/></font></td>
		</tr>
		<tr>
			<td>用户姓名：</td>
			<td><form:input path="userName"/></td>
			<td><font color="red"><form:errors path="userName"/></font></td>
		</tr>
		<tr>
			<td>性别：</td>
			<td><form:radiobuttons path="sex" items="${sexMap}"/></td>
			<td><font color="red"><form:errors path="sex"/></font></td>
		</tr>
		<tr>
			<td>生日：</td>
			<td><form:input path="birthday"/></td>
			<td><font color="red"><form:errors path="birthday"/></font></td>
		</tr>
		<tr>
			<td>邮箱：</td>
			<td><form:input path="email"/></td>
			<td><font color="red"><form:errors path="email"/></font></td>
		</tr>
		<tr>
			<td>手机号码：</td>
			<td><form:input path="mobilePhone"/></td>
			<td><font color="red"><form:errors path="mobilePhone"/></font></td>
		</tr>
		<tr>
			<td>部门：</td>
			<td><form:checkboxes items="${departmentMap}" path="departmentId"/></td>
			<td><font color="red"><form:errors path="departmentId"/></font></td>
		</tr>
		<tr>
			<td>员工类型：</td>
			<td><form:select path="employeeTypeId" items="${employeeTypeMap}"/></td>
			<td><font color="red"><form:errors path="employeeTypeId"/></font></td>
		</tr>
		<tr>
			<td>头像：</td>
			<td><input type="file" name="image" /></td>
			<td></td>
		</tr>
		<tr>
			<td colspan="3"><input type="submit" value="提交" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>