<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
.table {
border:1px solid #ccc;

}
.table td{
border:1px solid #ccc;
padding:10px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>LoginPage</title>
</head>
<body>
<%
if(request.getAttribute("MSG")!=null)
	session.invalidate();
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
%>
<span>${MSG}</span>
<center><h3>Login Here</h3></center>
<form action="login" method="POST"> 
<table  align="center" border="0" cellspacing="0" cellpadding="0" class="table">
<tr>
	<td>username: </td>
	<td><input type="text" name="userName"></td>
</tr>
<tr>
	<td>password: </td>
	<td><input type="password" name="password"></td>
</tr>
<tr>
	<td colspan="4" align="center"><input type="submit" value="LOGIN"></td>
</tr>
</table>
<center><a href="register.jsp">New User</a></center>
 </form>

</body>
</html>