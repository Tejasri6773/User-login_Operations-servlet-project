<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!String s[]={"apple","mango","prommagranate","bananna","grapes","cherries","guva"}; %>
<%for(int i=1;i<=s.length;i++){%>
<%for(String a:s){ %>
<%!String c=a; %>

<%} %>
<%} %> 
<%--<%if(s[i].equals("apple")) %>
<div style="color:red"><%= s[i]%></div>
<%else if(s[i].equals("mango")) %>
 --%>


<%} %>

</body>
</html>