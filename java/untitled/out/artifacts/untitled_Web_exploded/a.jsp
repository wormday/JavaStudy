<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: sunwq
  Date: 2016/12/2
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    private int initVar=0;
    private int serviceVar=0;
    private int destroyVar=0;
%>

<%!
    public void jspInit(){
        initVar++;
        System.out.println("jspInit(): JSP被初始化了"+initVar+"次");
    }
    public void jspDestroy(){
        destroyVar++;
        System.out.println("jspDestroy(): JSP被销毁了"+destroyVar+"次");
    }
%>

<%
    serviceVar++;
    System.out.println("_jspService(): JSP共响应了"+serviceVar+"次请求");

    String content1="初始化次数 : "+initVar;
    String content2="响应客户请求次数 : "+serviceVar;
    String content3="销毁次数 : "+destroyVar;
    out.println("Your IP address is " + request.getRemoteAddr());
%>
<p><%=content1 %></p>
<p><%=content2 %></p>
<p><%=content3 %></p>
<jsp:useBean id="test" class="com.TestBean" />
<jsp:useBean id="test1" class="net.TestBean" />
<jsp:getProperty name="test" property="message" />
<jsp:getProperty name="test1" property="message" />
<table>
<%

    Enumeration headerNames = request.getHeaderNames();
    while(headerNames.hasMoreElements()) {
        String paramName = (String)headerNames.nextElement();
        out.print("<tr><td>" + paramName + "</td>\n");
        String paramValue = request.getHeader(paramName);
        out.println("<td> " + paramValue + "</td></tr>\n");
    }

    Enumeration attrNames = request.getAttributeNames();
    while(attrNames.hasMoreElements()) {
        String paramName = (String)attrNames.nextElement();
        out.print("<tr><td>" + paramName + "</td>\n");
        String paramValue = (String)request.getAttribute(paramName);
        out.println("<td> " + paramValue + "</td></tr>\n");
    }

    attrNames = request.getParameterNames();
    while(attrNames.hasMoreElements()) {
        String paramName = (String)attrNames.nextElement();
        out.print("<tr><td>" + paramName + "</td>\n");
        String paramValue = request.getParameter(paramName);
        out.println("<td> " + paramValue + "</td></tr>\n");
    }
%>
</table>
    <%
        int[] attr={0,1,2,3,4};
        for (int i:attr
                ) {
            out.println(i);
        }
    %>

</body>
</html>
