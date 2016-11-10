<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Actions JDBC</h1>
	<ul>
		<li><a href="${pageContext.request.contextPath}/hibernate?action=connexion">Connexion</a></li>
		<li><a href="${pageContext.request.contextPath}/hibernate?action=insertion">Insertion</a></li>
		<li><a href="${pageContext.request.contextPath}/hibernate?action=requetePays">Requete Pays</a></li>
		<li><a href="${pageContext.request.contextPath}/hibernate?action=requeteFilm">Requete Film</a></li>
		<li><a href="${pageContext.request.contextPath}/hibernate?action=deco">deco</a>
	</ul>
</body>
</html>