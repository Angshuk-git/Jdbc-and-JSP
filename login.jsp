<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login here</title>
</head>
<body>
<h1>Login page</h1>
<form action="read">
<label for="tbemaillog">Email</label>
<input type="email" id="tbemaillog" value="<%=request.getParameter("tbemail") %>" name="tbemaillog"><br/>
<label for="tbpasslog">Password</label>
<input type="password" id="tbpasslog" value="<%=request.getParameter("tbpass") %>" name="tbpasslog">
<button>login</button>
</form>
</body>
</html>