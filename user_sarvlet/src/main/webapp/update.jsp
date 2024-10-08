<%@page import="user_sarvlet.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% User db=(User)request.getAttribute("user"); %>
<form action="edit" method="post">
    id:<input type="number" name="id" readonly="readonly" value="<%= db.getId()%>">
	FirstName:<input type="text" name="fN" value="<%= db.getFirstname()%>">
	LastName:<input type="text" name="lN" value="<%= db.getLastName()%>">
	Email:<input type="email" name="email" value="<%= db.getEmail()%>">
	Age:<input type="number" name="age" value="<%= db.getAge()%>">
	phoneNumber:<input type="number" name="phone" value="<%= db.getPhone()%>">
	Gender:<input type="text" name="gen" value="<%= db.getGender()%>">
	
	<button>Edit</button>
    
</form>
</body>
</html>