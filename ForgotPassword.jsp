<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css"
	media="screen" />
<title></title>
</head>
<body>

	<div class="main">
		<form action="changepassword" method="post">
			<ul class="left-form">
			
			<%
				if(request.getAttribute("status") !=null){
					out.println("<h2 class='errMsg' id='errLbl' style='color: red'>"+request.getAttribute("status")+"</h2>");
				}
			%>
			
			
			<h1 id="err" style="color: black;background: red"></h1>
				<h2 style="margin-top: 39px; color: #ff7d40">Change password:</h2>
				
				<li style="width: 408px"><input name="userId" type="number" placeholder="User Id" id="maxStudent" required /> 
					<div class="clear"></div></li>
			
				
				<li style="width: 408px"><input name="newPwd" type="password" placeholder="New password" id="maxStudent" required /> 
					<div class="clear"></div></li>
				
			<li style="width: 408px"><input name="confrmPwd" type="password" placeholder="Re Enter New password" id="maxStudent" required /> 
					<div class="clear"></div></li>
					
				<div class="clear"></div>
				
				<input type='submit' value="Confirm"/>
			</ul>
		
			</form>
	</div>







<script
		src="${pageContext.request.contextPath}/resources/js/ajaxService.js"></script>
<script
		src="${pageContext.request.contextPath}/resources/js/validator.js"></script>
</body>
</html>