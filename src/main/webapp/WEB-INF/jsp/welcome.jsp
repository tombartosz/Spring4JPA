<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8" import="javax.servlet.jsp.PageContext"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Welcome</title>
<c:url value="/resources/bootstrap/css/bootstrap.min.css" var="bootstrap_css" />
<c:url value="/" var="root" />
<link href="${bootstrap_css}" rel="stylesheet">

</head>
<body>

	<h3>Welcome message is: ${message}</h3>
	
	<div class="container">
		<a href="${pageContext.request.contextPath}/person/all">All persons</a>
		<br/>
		<a href="${pageContext.request.contextPath}/person/add">New person</a>
	</div>


	<script src="resources/jquery.min.js"></script>
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>