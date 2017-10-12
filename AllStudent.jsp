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
	<h3> Available Teacher :</h3>
	   <div align="center">
        <table border="1" cellpadding="5" style='width: 500px;'>
            <caption><h2 style="color:blue">Teacher List</h2></caption>
            <tr>
                <th>Teacher Id</th>
                <th>Course</th>
                <th>Teacher Name</th>
                <th>Maximum Student</th>
                <th>Request to teacher</th>
                

            </tr>
             
            <c:forEach var="teacher" items="${teacherList}" >
                <tr>
                	<td><c:out value="${teacher.user.userId}" /></td>
                	<td><c:out value="${teacher.subjectType}" /></td>
                  	 <td><c:out value="${teacher.user.userName}" /></td>
                    <td><c:out value="${teacher.maxStudent}" /></td>
                   <td><button class='teacherRequest' id="teacherRequest" tid="${teacher.user.userId}" subjectType="${teacher.subjectType}">Send Request</button></td>
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