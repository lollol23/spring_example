<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>조건문</h2>
	
	<c:set var="weight" value="78" />
	
	<c:choose>
		<c:when test="${weight <= 70 }">
			<h4>치킨먹자</h4>
		</c:when>
		<c:when test="${weight < 80 }">
			<h4>셀러드먹자</h4>
		</c:when>
		<c:otherwise>
			<h4>굶어~</h4>
		</c:otherwise>
	</c:choose>
	
	<h2>반복문</h2>
	<c:forEach var="i" begin="0" end="4" step="1">
		${i }
	</c:forEach>
	
	<c:forEach var="i" begin="16" end="20" step="1" varStatus="status">
		${i }, ${status.current }, ${status.first }, ${status.last }, ${status.count }, ${status.index } 
	</c:forEach>
	<hr>
	<c:forEach var="fruit" items="${fruits }" varStatus="status">
		${fruit }, ${status.count }, ${status.index }
	</c:forEach>
	<hr>
	<c:forEach var="user" items="${users }" varStatus="status">
		<h4>${status.count }번째 사람 정보</h4>
		이름 : ${user.name }
		나이 : ${user.age }
		취미 : ${user.hobby }
	</c:forEach>
</body>
</html>