
<%@page import="java.util.List"%>
<%@page import="user_sarvlet.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="home.css">
</head>
<body>
	<h1>HI..... welcome</h1>
	
	<% List<User> user=(List<User>)request.getAttribute("user"); %>
	 <h2> ********* LIST OF USERS **************</h2>
	 <table style="border:4px solid;" id="div1"  cellpadding=10px;cellspacing=10px;>
	 <tr style="border:2px solid">
	 <th style="border:2px solid;">id</th>
	 <th style="border:2px solid;">firstName</th>
	 <th style="border:2px solid;">lastName</th>
	 <th style="border:2px solid;">Email</th>
	 <th style="border:2px solid;">phone</th>
	 <th style="border:2px solid;">Age</th>
	 <th style="border:2px solid;">Gender</th>
	 <th style="border:2px solid;">Update</th>
	 <th style="border:2px solid;">Delete</th>
	 </tr>
	 <%for(User u:user){%>
	 <tr style="border:2px solid">
	 <td style="border:2px solid;"><%=u.getId()%></td>
	 <td style="border:2px solid;"><%=u.getFirstname()%></td>
	 <td style="border:2px solid;"><%=u.getLastName()%></td>
	 <td style="border:2px solid;"><%=u.getEmail() %></td>
	 <td style="border:2px solid;"><%=u.getPhone()%></td>
	 <td style="border:2px solid;"><%=u.getAge()%></td>
	 <td style="border:2px solid;"><%=u.getGender()%></td>
	 <td><button style="background-color:blue;"><a href="update?id=<%=u.getId()%>">Update</a></button></td>
	 <td><button style="background-color:black;"><a href="delete?id=<%=u.getId()%>">Delete</a></button></td>
	 </tr>
	 <%} %>
	 </table>
	 
</body>
</html>