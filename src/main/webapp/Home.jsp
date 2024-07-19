<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<style>
body
{
 background-color: rgb(55, 55, 88);
}


td{
height: 50px;

}

table {
	
	
	width: 200px
	 
}
a
{
text-decoration: none;
text-align: right;
font-size: 50px;
color:white;
}
form {
	width: 300PX;
	background: green;
}
</style>
</head>
<body>

${save }

<form action="">
<fieldset>
<legend>STUDENT INFORMATION</legend>
<table>

<tr><td><a href="student_register">Register</a></td></tr>
<tr><td><a href="view_all_student">View</a></td></tr>
<tr><td><a href="Edit_student">Edit</a></td></tr>
<tr><td><a href="Delete_student">Delete</a></td></tr>
</table>
</fieldset>
</form>
</body>
</html>