<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<table>
<tbody>

    <c:forEach items="${mean}" var="mean"> 
      <tr> <td>Mean is : ${mean}</td></tr>
    </c:forEach>
    
    <c:forEach items="${standarddeviation}" var="standarddeviation"> 
      <tr> <td>Standard Deviation is : ${standarddeviation}</td></tr>
    </c:forEach>
    
    </tbody>
    </table>
    </div>
</body>
</html>