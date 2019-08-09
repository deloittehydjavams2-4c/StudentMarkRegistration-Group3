<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="submitid">
Student ID<select name="student_id">
	<c:forEach var = "std" items = "${list}">
		<option value="${std.student_id}">${std.student_id}</option>
	</c:forEach>
	</select>
	<input type = "submit">
</form>

<%-- 
<center>Student Name :<input type="text"  name="Student Name"></center><br><br>
<center>Student Standard :<input type="text" name="StudentStandard"></center><br><br>
<center>Student Category :<input type="text" name="StudentCategory"></center><br><br>
<center><input type="submit" value="add">
</center></form>
--%>

</body>
</html>