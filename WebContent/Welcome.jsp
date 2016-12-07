<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

<% 
//if("Your Data stored successfully".equals(session.getAttribute("msg")))
//out.print(session.getAttribute("msg")); %>
<form action="insert" method="post">
First Name<input type="text" name ="fname">
Last name<input type="text" name="lname">

Mobile No<input type="text" name="mno">
<input type="submit" value="submit">
</form>
</body>
</html>