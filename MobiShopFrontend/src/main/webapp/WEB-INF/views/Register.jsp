<%@ page language="java" contentType="text/html"%>
<%@include file="GeneralHeader.jsp" %>
<html>
<body>
<h2>Register page for MobiShop Website</h2>

<form action="Register" method="get">
<table align="center">
<thead bgcolor="cyan">
	<th colspan="2">Register</th>
</thead>
<tr bgcolor="gray">
<td>User Name</td><td><input type="text" name="uname" required /></td>
</tr>

<tr bgcolor="gray">
<td>Password</td><td><input type="text" name="psswrd" required /></td>
</tr>

<tr bgcolor="gray">
<td>Customer Name</td><td><input type="text" name="cname" required /></td>
</tr>

<tr bgcolor="gray">
<td>Gender</td>
<td>
	<input type="radio" name="gender" value="M" />Male
	<input type="radio" name="gender" value="F" />Female
</td>

<tr bgcolor="gray">
<td>Country</td>
<td>
	<select name="country">
		<option vlaue="India">India</option>
		<option value="South Africa">South Africa</option>
		<option value="Srilanka">Srilanka</option>
	</select>
</td>

<tr bgcolor="gray">
<td>Email</td><td><input type="email" pattern="[a-z0-9._$+-]+[a-z0-9.-]+\.[a-z]{2,3}$" name="email" required></td>
</tr>

<tr bgcolor="gray">
<td>Mobile</td><td><input type="text" pattern="[789]\d{9}" name="mobile" required /></td>
</tr>
</table>
</form>
<%@include file="GeneralFooter.jsp" %>
</body>
</html>

	