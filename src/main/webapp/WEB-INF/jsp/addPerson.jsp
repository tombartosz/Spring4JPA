<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8" import="javax.servlet.jsp.PageContext"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Browse persons</title>
<c:url value="/resources/" var="resources" />
<link href="${resources}bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<p class="bg-primary lead">
			<b>Person</b>
		</p>
		
		<p><c:out value="${message }"></c:out>

		<form class="form-inline"
			action="${pageContext.request.contextPath}/person/store " method="get">
			<div class="form-group">
				<label for="firstName">First Name</label> <input type="text"
					class="form-control" name="firstName" id="firstName" placeholder="">
			</div>
			<div class="form-group">
				<label for="surname">Surname</label> <input type="text"
					class="form-control" name="surname" id="surname" placeholder="">
			</div>
			<div class="form-group">
				<label for="birthDate">Birth date</label> <input type="text"
					class="form-control" name="birthDate" id="birthDate" placeholder="">
			</div>
			<button type="submit" class="btn btn-default">Save</button>
		</form>


	</div>
	<script src="${resources}jquery.min.js"></script>
	<script src="${resources}bootstrap/js/bootstrap.min.js"></script>
</body>
</html>