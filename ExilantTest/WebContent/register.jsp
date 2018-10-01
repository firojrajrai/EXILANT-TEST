<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>RegistrationPage</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
%>
<center><span>${MSG}</span></center>
<center><h3>Register Here</h3></center>
<form action="register" method="POST">
<table  align="center" border="0" cellspacing="0" cellpadding="0" class="table">
<tr>
	<td>First Name: </td>
	<td><input type="text" name="firstName"></td>
</tr>
<tr>
	<td>Last Name: </td>
	<td><input type="text" name="lastName"></td>
</tr>
<tr>
	<td>Age: </td>
	<td><input type="text" name="age"></td>
</tr>
<tr>
	<td>Phone: </td>
	<td><input type="text" name="phone"></td>
</tr>
<tr>
	<td>Email: </td>
	<td><input type="text" name="email"></td>
</tr>
<tr>
	<td>Gender: </td>
	<td><input type="radio" name="gender" value="MALE">MALE<br><hr>
	<input type="radio" name="gender" value="FEMALE">FEMALE</td>
</tr>
<tr>
	<td>Username: </td>
	<td><input type="text" name="unm"></td>
</tr>
<tr>
	<td>Password: </td>
	<td><input type="password" name="pwd"></td>
</tr>
<tr>
	<td align="center" colspan="3"><input type="submit" value="REGISTER"></td>
</tr>
</table>
 </form>

</body>
</html>