<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <c:forEach items="${vector}" var="vector"> 
      <tr>     
       <td>
      ${vector.id}
      
        </td>
        <td>
        ${vector.vector_num}
        </td>
        <td>
        ${vector.vector_id}
        </td>
      </tr>
    </c:forEach>
    </tbody>
    </table>
    </div>
</body>
</html>