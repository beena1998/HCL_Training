<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Search Physician by:
	<br>
	<br> State
	<form action="searchPhysicianByState">
		<input type="text" name="state">
		<button>Find</button>
	</form>


	<table>
		<tbody>
			<c:forEach items="${physician}" var="phy">
				<tr>
					<td>${phy.firstName}</td>
					<td>${pet.petName}</td>


				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>