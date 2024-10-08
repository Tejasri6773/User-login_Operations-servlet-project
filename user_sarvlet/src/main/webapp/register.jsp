<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="register.css">
</head>
<body>
  <form action="reg" method="post">
     <fieldset>
        <legend>Registration form</legend>
             firstName :<input type="text" name="fN"><br><br>
		     LastName :<input type="text" name="lN"><br><br>
		     Email :<input type="email" name="email"><br><br>
		     Password :<input type="password" name="pwd"><br><br>
		     Phone Number :<input type="number" name="phone"> <br><br>
		     Age :<input type="number" name="age"><br><br>
		     Gender :<input type="text" name="gen"><br><br>
		     <button id="btn">Submit</button>
        
     </fieldset>
  </form>

</body>
</html>