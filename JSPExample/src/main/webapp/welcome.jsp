<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="Test.Employee" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="e" class="Test.Employee"></jsp:useBean> 
	
	<jsp:setProperty property="*" name="e"/>
	Records are: 
	<jsp:getProperty property="id" name="e"    />
	<jsp:getProperty property="name" name="e"  />

</body>
</html>  