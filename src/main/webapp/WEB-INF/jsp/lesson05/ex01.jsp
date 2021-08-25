<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>
	<h1>JSTL</h1>
	<h1>변수선언하기 (c:set)</h1>
	<c:set var="number1" value="100"></c:set>
	<c:set var="number2">200</c:set>
	
	<h4>number1 : ${number1 }</h4>	
	<h4>number2 :  ${number2 }</h4>
	
	<h3>변수 출력하기(c:out)</h3>
	<h4>number : <c:out value="10" /></h4>
	<h4>number1 : <c:out value="${number1 }" /></h4>
	
	<!--<script>alert('출력');</script>-->
	<!--<c:out value="<script>alert('출력');</script>" />-->
	<!--<c:out value="<script>alert('뜬다');</script>" escapeXml="false"/>-->
	
	<c:if test="true">
		<h4>조건이참이다.</h4>
	</c:if>
	
	<c:if test="${number1 > 50 }">
		<h4>number1이 50보다 크다.</h4>
	</c:if>
	
	<c:if test="${number1 == 100 }">
		<h4>number2는 100이다</h4>
	</c:if>
	
	<c:if test="${number2 ne 222}">
		<h4>number2는 222가 아니다.</h4>
	</c:if>
	
	<c:if test="${empty number3 }">
		<h4>number3이 비어있다.</h4>
	</c:if>
</body>
</html>