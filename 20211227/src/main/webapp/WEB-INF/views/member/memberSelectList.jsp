<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../home/menu.jsp"/>
<div align="center">
	
	<div><h3>회원목록</h3></div>
	<div>
	<c:forEach items="${members}" var="member">
		${member.id } : ${member.name } <br>
	
	</c:forEach>
	</div>
</div>
</body>
</html>