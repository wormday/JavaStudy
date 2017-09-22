<%@ page import="org.springframework.beans.factory.annotation.Autowired" %>
<%@ page import="org.springframework.context.annotation.Configuration" %><%--
  Created by IntelliJ IDEA.
  User: sunwq
  Date: 2016/12/3
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!

    @Autowired
    private net.ICompactDisc oo;

%>
<%
    net.ICompactDisc o = new net.SgtPeppers();
    out.println(o.play());
    out.println(oo.play());


%>
</body>
</html>
