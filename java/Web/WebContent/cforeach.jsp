<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import ="java.util.List" %>
    <%@page import ="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
ddddddddddddddddddddddddddddddddddddddd
<%
List a=new ArrayList();
a.add("ABC1000");
a.add("DEF2000");
a.add("GHI3000");
a.add("ABC4000");
a.add("DEF5000");
a.add("GHI6000");
a.add("ABC1000");
a.add("DEF2000");
a.add("GHI3000");
a.add("ABC4000");
a.add("DEF5000");
a.add("GHI6000");
request.setAttribute("b", a);
%>
<c:forEach var="item" items="${b}">
<c:out value="${item}"></c:out>
</c:forEach>
ddddddddddddddddddddddddddddddddddd
</body>
</html>