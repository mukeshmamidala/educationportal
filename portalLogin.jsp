<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>PortalLogin</title>
</head>
<body>
<div id="alertRes">
	<div class='alertbar' style="background: green">
		<%=request.getAttribute("errorMsg") %>
	</div>
	<form action="login" method="Get">

		<div class="form-group col-lg-12 "><!--  -->
			<input class="btn-outline1" style="width: 24%; margin-left: 41px;" type="submit"
				value="Click to Enter in Portal">
		</div>

	</form>
	</div>
</body>
</html>