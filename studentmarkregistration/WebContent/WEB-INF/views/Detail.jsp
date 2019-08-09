<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>


<c:forEach var = "std" items = "${detlist}">
	
<form action ="add" method="post">
<center>Student Id :<input type="text"  name="id" value="${std.student_id}"></center><br><br>
<center>Student Name :<input type="text"  name="name" value="${std.student_name}"></center><br><br>
<center>Student Standard :<input type="text" name="standard" value="${std.standard}"></center><br><br>
<center>Student Category :<input type="text" name="category" value="${std.standard_category}"></center><br><br>
<center><input type="submit" value="Add"></center>
</form>
</c:forEach>
</body>
</html>