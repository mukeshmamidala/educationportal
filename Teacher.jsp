<%@page import="sunspot.com.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bank.css" />

</head>
<body>
	<!-- <h1>Welcome</h1> -->



	<div id="topPane" class="topPane">
		<div id="header" class="header">

			<%
				boolean status = (Boolean) request.getAttribute("isMsg");
				if (status) {
					String msgSymbol = "<a href='#' id='getTeacherNotification'>"
							+ "<img src='images/msg.ico' title='You have a message' alt='Incoming Message' width='52' height='52' style='padding-left: 20px;padding-top: 20px;padding-right: 20px;' border='0'/>"
							+ "</a>";
					out.println(msgSymbol);
				}
			%>

			<button class="myBtn" id="techrSetProfile">Set Profile</button>
			<button class="myBtn" id="tchrAllStd">Get All Student List</button>
			<div id='info'>
			
			<form id="lo" action="logout">
			<button class="logout" id='logOut'>logOut</button>
		</form>
			
				<%
					out.println("Logged in user : "
							+ ((User) session.getAttribute("user")).getUserName()
							+ " || ");
					out.println("Role : "
							+ ((User) session.getAttribute("user")).getRole());
				%>
			</div>
		</div>


	</div>

	<div id="mainContent" class="mainContent"></div>

	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-3.1.0.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/validator.js"></script>

	<script
		src="${pageContext.request.contextPath}/resources/js/ajaxService.js"></script>


</body>
</html>