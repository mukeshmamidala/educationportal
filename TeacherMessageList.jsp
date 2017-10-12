<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User home</title>

<style type="text/css">
	.home{
		color: Orange;
		font-size: 20px;
		padding-left: 25px;
	}

th{
background-color: forestgreen;
color: white;
}
h3{
	padding-left: 25px;
	color: red;
}
</style>

</head>
<body>
	<h3> Your Message :</h3>
	   <div align="center">
        <table border="1" cellpadding="5" style='width: 500px;'>
            <caption><h2 style="color:blue">Teacher's Notification</h2></caption>
            <tr>
                <th>Student ID</th>
                <th>Subject</th>
                <th>Message</th>
                <th>Reject Request</th>
                <th>Confirm Request</th>
                

            </tr>
             
            <c:forEach var="notification" items="${notifications}" >
                <tr>
                	<td><c:out value="${notification.sender}" /></td>
                	<td><c:out value="${notification.course}" /></td>
                	<td><c:out value="${notification.msgDescription}" /></td>
                  	 <td><button class='teacherReject' id='teacherReject' sendTo="${notification.sender}" course="${notification.course}">Reject</button></td>
                    <td><button class='teacherApproved' id='teacherApproved' sendTo="${notification.sender}" course="${notification.course}">Confirm</button></td>
                </tr>
            </c:forEach>
        </table>
    </div>

	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-3.1.0.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/validator.js"></script>

	<script
		src="${pageContext.request.contextPath}/resources/js/ajaxService.js"></script>
	 
</body>
</html>