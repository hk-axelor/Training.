<%@page import="com.axelor.studentdb.Subject"%>
<%@page import="com.axelor.studentdb.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.axelor.studentdb.Book" %>
<%@page import="com.axelor.studentmain.Operations"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<%

Operations ops= new Operations();
List<Student> stds=ops.ListStud();
session.setAttribute("stdds", stds);
%>
	<h2>Student Details:</h2>
<br><br>

	<table data-role="table" id="table-2"
		class="ui-responsive">
		<thead>
			<tr>
				<th data-priority="1">Student ID:</th>
				<th data-priority="2">Name:</th>
				<th data-priority="3">School:</th>
				<th data-priority="4">Subject:</th>
				<th data-priority="5">Book:</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="std" items="${stdds}" >
			<tr>
				<td>${std.getId()}</td>
				<td>${std.getName()}</td>
				<td>${std.getSchool().getSclname()}</td>
				<td>
				<c:forEach var="sub" items="${std.getSubject()}">
				<c:out value="${sub.getSubname()}"></c:out>
				</c:forEach>
				</td>
				<td>
				${std.getBook().getBname()}
				</td>
				<td>
				
				<a href="update.jsp?sid=${std.getId()}">Edit</a>
				<a href="delete?sid=${std.getId()}">delete</a>
					
				
				
				</td>
				
			</tr>
		</c:forEach>
		</tbody>
	</table>
	
	<%-- <form action="update.jsp?sid=${std.getId()}">
   <input type="submit" value="Add a Student" />
</form> --%>
<a href="update.jsp?sid=0">Add a Student</a>



</body>
</html>