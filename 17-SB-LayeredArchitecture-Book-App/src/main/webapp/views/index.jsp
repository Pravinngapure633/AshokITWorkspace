<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<font color="green">${success} </font>
	<font color="red">${failure} </font>

	<form:form action="saveBook" modelAttribute="book" method="POST">

		<table>
			<tr>
			<td>Book Name : </td>
			<td><form:input path="name"/></td>
			</tr>
			
			<tr>
			<td>Book Price :</td>
			<td><form:input path="price"/></td>
			</tr>
			
			<tr>
			<td>Book Author :</td>
			<td><form:input path="author"/></td>
			</tr>
			
			<tr>
			<td><input type="submit" value="Save"/></td>
			</tr>
			

		</table>
				<a href="viewBooks">View All Books</a>
	</form:form>
</body>
</html>