<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"
	media="all" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/ep.css" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- /css files -->
<!-- font files -->
<link
	href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'
	rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/ep.css" />
<title>Alert</title>
</head>
<body>
<div id="alertRes">
	<div class='alertbar' style="background: lime">
		<%=request.getAttribute("errorMsg") %>
	</div>
	<form action="index.jsp">
	<div class="form-group col-lg-12 ">
		<input type="submit" value="Go to Home Page" class="btn-outline1" style="width: 24%;color:white; margin-left: 41px; background: purple">
		</div>
		
	</form>
	</div>
</body>
</html>