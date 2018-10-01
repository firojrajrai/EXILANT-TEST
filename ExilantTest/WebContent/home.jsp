<%@page import="com.exilant.to.EmployeeTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME HOME</h1>
<%
EmployeeTO eto=(EmployeeTO)request.getAttribute("ETO");
%>
<h2>Your Details: </h2>
<table>
<tr>
<td>Name:</td><td><%=eto.getFname() +" "+eto.getLname() %></td>
</tr>
<tr>
<td>Age:</td><td><%=eto.getAge() %></td>
</tr>
<tr>
<td>phone:</td><td><%=eto.getPhone() %></td>
</tr>
<tr>
<td>Email:</td><td><%=eto.getEmail() %></td>
</tr>
<tr>
<td>Gender:</td><td><%=eto.getGender()%></td>
</tr>
</table>
<%
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
%>
<form action="logout">
<input type="submit" value="LOGOUT">
</form>
<!-- <a href="index.jsp">Logout</a> -->
</body>
</html>