<%@ page language="java" contentType="text/html"%>

<html>
<head>

<title>Category</title>
</head>
<body>
<form action="CategoryAddition" method="get">
<table>
	<tr><td colspan="2"><center>Category Details</center></td></tr>
	
	<tr>
		<td>CategoryID</td>
		<td><input type="text" name="catid" /></td>
	</tr>
	<tr>
		<td>Category Name</td>
		<td><input type="text" name="catname" /></td>
	</tr>
	<tr>
		<td>Category Desc</td>
		<td><textarea name="catdesc" cols="20" rows="5"></textarea></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="SUBMIT" /></td>
	</tr>
	
</table>
</form>

</body>
</html>
