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
	<form:form action="saveStudent" modelAttribute="student" method="POST">
		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td>Gender :</td>
				<td><form:radiobutton path="gender" value="Male" />Male <form:radiobutton
						path="gender" value="Female" />Female</td>
			</tr>
			<tr>
				<td>Course :</td>
				<td><form:select path="course">
						<form:option value="java">Java</form:option>
						<form:option value="phython">Phython</form:option>
						<form:option value="devops">Devops</form:option>
					</form:select></td>
		</tr>
		<tr>
		<td>Timing :</td>
		<td><form:checkbox path="timings" value="Morning"/>Morning
		<form:checkbox path="timings" value="Evening"/>Evening</td>
		<td>
		<input type="submit" value="Register"></td>
		
			
		</table>

	</form:form>

</body>
</html>