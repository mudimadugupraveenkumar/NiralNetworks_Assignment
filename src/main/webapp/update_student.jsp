<%@page import="STUDENT_ENTITY.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


 <% Student p=(Student)request.getAttribute("edit_student"); %>
     
     <form action="update_student" method="post">
     
     enter id:<input type="number" name="id" value=<%=p.getId() %> readonly="true">
     <br>
     enter name:<input type="text" name="name" value=<%=p.getName()%>>
     <br>
     enter E_mail:<input type="text" name="E_mail" value=<%=p.getE_mail() %>>
     <br>
     enter phoneno:<input type="number" name="phoneno" value=<%=p.getPhoneno() %>>
     <br>
      <br>
     enter Address:<input type="text" name="Address" value=<%=p.getAddress() %>>
     <br>
      
     enter gender:<input type="text" name="gender" value=<%=p.getGender() %>>
     <br>
      enter Dateofbirth:<input type="text" name="Dateofbirth" value=<%=p.getDateofbirth() %>>
     <br>
   
     <input type="submit">
     
      
</body>
</html>