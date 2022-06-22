
<!-- Declarative tag -->
<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<%-- JSP Directive 
<%@ include file="header.jsp" %>    
--%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
</head>
<body>
 <h1>hi</h1>

 
 <%-- JSP Implicit object 

      pageContext.setAttribute("name", "Harish" ,PageContext.SESSION_SCOPE);

--%>

<%-- Declaration tag 
<%!
    int n = 1 ;
%>
 --%> 
 
 
 
<%-- Scriptlet tag 

  <%

          int i = Integer.parseInt(request.getParameter("num1"));
		  int j = Integer.parseInt(request.getParameter("num2"));
	
		  int k=i+j;
		  out.println("Output : " +k);
  %>
--%>  
<%-- Expression tag  

        My Fav Num is : <%= n %>
        
  --%>
</body>
</html>