<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="number" value="123456789" />
	
	<h2>숫자 출력</h2>
	<fmt:formatNumber value="${number }" />
	
	<h2>type</h2>
	<h4>숫자 : <fmt:formatNumber value="${number }" type="number" /></h4>
	
	<h2>percent</h2>
	<h4>100% : <fmt:formatNumber value="1" type="percent"/></h4>
	<h4>40% : <fmt:formatNumber value="0.4" type="percent"/></h4>
	
	<h2>통화</h2>
	<h4>통화 (원) : <fmt:formatNumber value="${number }" type="currency"/></h4>
	<h4>통화 (달러) : <fmt:formatNumber value="${number }" type="currency" currencySymbol="$"/></h4>
	<fmt:formatNumber value="${number }" type="currency" currencySymbol="$" var="dollar"/>
	<h4>${dollar }</h4>
	
	<h2>pattern</h2>
	<c:set var="pi" value="3.141592" />
	<fmt:formatNumber value="${pi }" />
	<h4><fmt:formatNumber value="${pi }" pattern="#.##"/></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.##########"/></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="0.0000000000"/></h4>
	
	<hr>
	
	<h2>date객체</h2>
	<!-- 2021년 08월 24일 14시 14분 -->
	<h4><fmt:formatDate value="${today }" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초"/></h4>
	<fmt:formatDate value="${today }" pattern="yyyy/MM/dd hh:mm:ss" var="now"/>
	
	<h2>String을  DAte객체로변환</h2>
	<fmt:parseDate value="${now }" pattern="yyyy/MM/dd hh:mm:ss" var="date" />
	${date }
</body>
</html>