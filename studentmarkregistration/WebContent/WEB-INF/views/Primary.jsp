<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Primary Student</title>
</head>

<body>
<form action="addprimarymarks" method="post">
<center>
Student ID: <input type="text" name="student_id" value = "${id}" ><br><br></center>
<center>English: <input type= "text" name= "english_mark"><br><br></center>
<center>Hindi: <input type= "text" name = "hindi_mark"><br><br></center>
<center>Science: <input type="text" name = "science_mark"><br><br></center>
<center>Maths: <input type="text" name = "maths_mark"><br><br></center>
<center>
<button type="submit"  value="Submit">Submit</button>
<button type="reset" value="Reset">Reset</button>
</center>
</form>


</body>
</html>
