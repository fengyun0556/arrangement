<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试 json</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
   $(document).ready(function(){
	   testRequestObject();
	});
	
	/* function testRequestBody(){
		$.ajax({
				url:"${pageContext.request.contextPath}/json/testRequestBody",
				dataType:"json",
				type:"post",
				contentType : "application/json;charset=UTF-8",
				//data:JSON.stringify({userId : 1, loginName : "admin"}),
				async:true,
				success:function(data){
					$("#userId").html(data.userId);
					$("#loginName").html(data.loginName);
					$("#userName").html(data.userName);
					console.log(data);
				},
				error:function(){
					alert("数据发送失败");
				}
			});
	} */
	
	function testRequestObject(){
		$.ajax({
			url:"${pageContext.request.contextPath}/json/testRequestObject",
			dataType:"json",
			type:"post",
			contentType : "application/json;charset=UTF-8",
			data:"",
			success:function(data){
				alert(data);
				$.each(data, function(){
					var tr = $("<tr align='center'>");
					$("<td/>").html(this.userId).appendTo(tr);
					$("<td/>").html(this.loginName).appendTo(tr);
					$("<td/>").html(this.userName).appendTo(tr);
					$("#userList").append(tr);
				})
			},
		});
	}
</script>
</head>
<body>
编号：<span id="userId"></span><br/>
登录名：<span id="loginName"></span><br/>
用户姓名：<span id="userName"></span><br/>
<hr>
<table id="userList" border="1" style="border-collapse: collapse;">
	<tr align="center">
		<th>编号</th>
		<th>登录名</th>
		<th>用户姓名</th>
	</tr>
</table>
</body>
</html>