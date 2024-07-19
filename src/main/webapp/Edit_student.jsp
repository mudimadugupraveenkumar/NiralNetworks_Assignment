<%@page import="STUDENT_ENTITY.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
      <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%  List<Student> p=(List)request.getAttribute("view_students"); %>

<table cellpadding="5px" border="5px">
  <tr>
  <th>id</th>
  <th>name</th>
  <th>E_mail</th>
  <th>phoneno</th>
  <th>Address</th>
  <th>gender</th>
   <th>Date of birth</th>
   <th>Edit<th>
  <tr>
<% for(Student pp:p)
	{%>
	
	 <tr> 
	    <td><%= pp.getId() %></td>
	    <td><%= pp.getName() %></td>
	    <td><%= pp.getE_mail()%></td>
	    <td><%= pp.getPhoneno()%></td>
	    
	    <td><%= pp.getAddress() %></td>
	    <td><%= pp.getGender()%></td>
	    <td><%= pp.getDateofbirth()%></td>
	     <td><a href="Edit_student_inf?id=<%= pp.getId()%>">Edit</a></td>
	
	 </tr>
	
	
	<%} %>
	
	</table>
	
	<a href="Home.jsp">Home page</a>

</body>
</html>