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
		
			<ul class="left-form">
			
			<%
				if(request.getAttribute("status") !=null){
					out.println("<h2 class='errMsg' id='errLbl' style='color: red'>"+request.getAttribute("status")+"</h2>");
				}else{
					out.println("<h2 class='errMsg' id='errLbl' style='color: red'></h2>");
				}
			%>
			
			<h1 id="err" style="color: black;background: red"></h1>
				<h2 style="margin-top: 39px; color: #ff7d40">Set Profile:</h2>
				
				<li style="width: 408px"><input type="number" placeholder="Max Student" id="maxStudent" required /> 
					<div class="clear"></div></li>
				
				<li style="width: 408px"><label
					style="opacity: 0.6; padding-left: 13px; font-size: 15px; margin-top: 5px; font-family: 'Open Sans', sans-serif;">Select a subject to search the Teacher</label> 
					<select name="subject" style="width: 100px; height: 44px; border: 1px solid #EBEBEB; margin-left: 40px; border-left: 0; border-top: 0; border-bottom: 0; opacity: 0.6; font-size: 15px;">
						<option value="Hindi">Hindi</option>
						<option value="English">English</option>
						<option value="Math">Math</option>
						<option value="Computer">Computer</option>
						<option value="Science">Science</option>
						<option value="Photography">Photography</option>
				</select>
			<div class="clear"></div></li>
				
				
				<div class="clear"></div>
			</ul>
<button class=myBtn id="tchrSaveProfile">Save profile</button>
			<div class="clear"></div>

		

	</div>







<script
		src="${pageContext.request.contextPath}/resources/js/ajaxService.js"></script>
<script
		src="${pageContext.request.contextPath}/resources/js/validator.js"></script>
</body>
</html>