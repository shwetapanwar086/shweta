<%@ page language="java" contentType="text/html"%>
<%@include file="GeneralHeader.jsp" %>
<html>
<head>

</head>
<body>
<form action="LoginCheck" method="post">
<table align="center">
<thead bgcolor="blue">
	<th colspan="2">Login Dialog</th>
</thead>

<tr>
<td bgcolor="gray">
<td>User Name</td><td><input type="text" name="uname" /></td>
</tr>

<tr>
<td bgcolor="gray">
<td>Password</td><td><input type="text" name="psswrd" /></td>
</tr>

<tr>
<td bgcolor="brown">
<td colspan="2"><center><input type="submit" value="SUBMIT" /></center></td>
</tr>
</table>

</form>
</body>
</html>
<%@include file="GeneralFooter.jsp" %>
