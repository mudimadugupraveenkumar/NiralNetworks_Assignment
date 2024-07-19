<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form:form action="student_save" modelAttribute="student"> 


<table>
<tr><td>Enter name:</td><td><form:input path="name"/></td></tr>
<tr><td>Enter E_mail:</td><td><form:input path="E_mail"/></td></tr>
<tr><td>Enter phoneno:</td><td><form:input path="phoneno"/></td></tr>
<tr><td>Enter Address:</td><td><form:input path="Address"/></td></tr>

<tr><td>Enter gender:</td><td><form:input path="gender"/></td></tr>
<tr><td>Enter  Bataofbirth:</td><td><form:input path="Dateofbirth"/></td></tr>

</table>
<input type="submit"> 

</form:form>

</body>
</html>