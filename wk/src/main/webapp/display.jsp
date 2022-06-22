<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>

<body>


<!-- ${students} -->  
      
  <!--    <c:forEach items="${ students}" var="s">
          ${s.name} <br> -->  
 <!--          
  length of string        
          <c:set var="str" value = "Mahi is a cricketer"   />
      Length : ${fn:length(str)}
 -->  
 <!--  spliting of a string(SPLIT METHOD)
<c:set var="str" value = "Mahi is a cricketer"   />
      
      <c:forEach items = "${fn:split(str, ' ')}" var ="s">  
      <br>
      ${s}
      
      </c:forEach>
  -->    
  
<!--  indexOf method -->
   <c:set var="str" value = "Mahi is a cricketer"   />
      
      index : ${fn:indexOf(str,"is")}
 
<!-- contain -->     
      <c:set var="str" value = "Mahi is a cricketer"   />
      
      is there : ${fn:contains(str,"Mahi")}
<!-- endsWith -->      
      <c:set var="str" value = "Mahi is a cricketer"   />
      
    <c:if  test = "${fn:endsWith(str,'cricketer')}">
         you are right buddy
    </c:if>
    
<!-- toUpper toLower -->
<c:set var="str" value = "Mahi is a cricketer"   />
      
    <c:if  test = "${fn:endsWith(str,'cricketer')}">
         you are right buddy
    </c:if>
      
      ${fn:toUpperCase(str)}
 

  
    
    
    <c:set var="str" value = "Mahi is a cricketer"   />
      
    <c:if  test = "${fn:endsWith(str,'cricketer')}">
         you are right buddy
    </c:if>
      
      ${fn:toUpperCase(str)}
      
      
 
 
 
 
</body>
</html>