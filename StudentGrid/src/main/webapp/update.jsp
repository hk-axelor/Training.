<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="com.axelor.studentdb.Subject"%>
<%@page import="com.axelor.studentdb.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.axelor.studentmain.Operations"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<%

Operations ops= new Operations();
List<Student> stds=ops.ListStud();
List<Subject> subs=ops.ListSub();
session.setAttribute("subbs", subs);
session.setAttribute("stdds", stds);

EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit01");
EntityManager em = emf.createEntityManager();
if(Integer.parseInt(request.getParameter("sid"))!=0||request.getParameter("sid")!=null)
{
int sid=Integer.parseInt(request.getParameter("sid"));
Student stdu = em.find(Student.class, sid);
session.setAttribute("std", stdu);
}

%>
<body>
	<form name="insertwalaform" id="form-1" action="insert?sid=${std.getId()}" method="get">
	
	`<input id="input-1" type=h name="sid" 
		type="text" value="${std.getId()}" /> <br> 
		<h2> Insert Student Details:</h2>
		<br>
		<br> <label for="input-1">Id:</label> <br> 
		<input id="input-1" name="id" placeholder="${std.getId()}" 
		type="text" value="${std.getId()}" /> <br> 
		
	<br> <label for="input-2">Name:</label> <br> 
		<input id="input-2" name="name" placeholder="Text" type="text" 
		value="${std.getName()}"/> <br>	
		
		<br> <label for="input-3">book</label> <br> 
		<input id="input-3" name="book" placeholder="Text" type="text" 
		value="${std.getBook().getBid()}"/> <br>
		
		
		<br> <label for="input-4">Subject</label> <br>
		<br> <select name="subject">
			<c:forEach var="sub" items="${subbs}">
				<option value="${sub.getSubid()}">
					<c:out value="${sub.getSubname()}"></c:out>
				</option>
			</c:forEach>
		</select> <br>
		
		<br> <label for="input-5">school</label><br> 
		<input id="input-5" name="school" placeholder="${std.getSchool().getSclname()}" 
		type="text" value="${std.getSchool().getId()}"/><br>
		<br> <input type="submit" value="update" id="button-1" />
		
		</form>
</body>
</html>
		