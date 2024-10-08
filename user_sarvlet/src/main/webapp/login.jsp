<%@page import="user_sarvlet.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
 
    <form action="login" method="post">
      <fieldset>
         <h2>Login form</h2>
         Email :<input type="email" name="mail"><br><br>
         Password :<input type="password" name="pwd"><br><br>
         <button id="btn">login</button>
      </fieldset>
    </form>
    
    
   <% String  s=(String)request.getAttribute("msg"); 
   if(s!=null){%>
   <h1> <%= s%></h1>
   <%} %>
  

</body>
</html>