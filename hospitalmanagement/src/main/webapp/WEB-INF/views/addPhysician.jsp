<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page errorPage="errorPage"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	${error} Hospital Management System Physician!!
	<div align="center">
		<form:form action="physicianadded" method="post"
			modelAttribute="physician">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Add Physician</h2></td>
				</tr>
				<tr>
					<td>ID</td>
					<td><form:input path="Id" /></td>

				</tr>
				<tr>
					<td>First Name</td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td>Department</td>
					<td><form:input path="department" /></td>
				</tr>
				<tr>
					<td>Educational Qualification</td>
					<td><form:input path="eduQul" /></td>
					


				</tr>
				<tr>
					<td>Years of Experience</td>
					<td><form:input path="YOE" /></td>
				</tr>
				<tr>

					<td>State</td>
					<td><form:input path="state" /></td>
					<form:errors></form:errors>


				</tr>
				<tr>
					<td>Insurance Plan</td>
					<td><form:input path="insurancePlan" /></td>
				</tr>
				<tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit">Submit</button>
						<button type="reset">Reset</button>
					</td>
				</tr>
			</table>
		</form:form>
	</div>


</body>
</html>