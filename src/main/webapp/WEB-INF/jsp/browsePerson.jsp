<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Browse persons</title>
<c:url value="/resources/"
	var="resources" />
<link href="${resources}bootstrap/css/bootstrap.min.css"
	 rel="stylesheet">
</head>
<body>
	<div class="container">
		<p class="bg-primary lead">
			<b>Persons</b> in database.
		</p>
		<table class="table-striped" style="width: 100%">

			<tr>
				<th>First Name</th>
				<th>Second Name</th>
				<th>Surname</th>
				<th>Birth date</th>
			</tr>

			<c:forEach items="${persons}" var="person">
				<tr>
					<td><c:out value="${person.firstName}"></c:out></td>
					<td><c:out value="${person.secondName}"></c:out></td>
					<td><c:out value="${person.surname}"></c:out></td>
					<td><f:formatDate value="${person.birthDate}"
							pattern="yyyy-MM-dd" />
				</tr>
			</c:forEach>
		</table>
	</div>
	<script src="${resources}jquery.min.js"></script>
	<script src="${resources}bootstrap/js/bootstrap.min.js"></script>
</body>
</html>