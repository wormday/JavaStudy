<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for AddContactForm form</title>
	</head>
	<body>
		<html:form action="/addContact">
			firstName : <html:text property="firstName"/><html:errors property="firstName"/><br/>
			id : <html:hidden property="id"/><html:errors property="id"/><br/>
			lastName : <html:text property="lastName"/><html:errors property="lastName"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

