<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UNIVER</title>
<style type="text/css">
fieldset {
	border: 1px solid #dedede;
}

legend {
	font-size: 20px;
	text-transform: uppercase;
}

.error {
	color: red;
}

.resltTable {
	width: 50%;
	border-collapse: collapse;
	border-spacing: 0px;
}

.resltTable td, .resltTable th {
	border: 1px solid #565454;
}
</style>
</head>
<body>
 <fieldset>    
  <h2>FreeRooms Form</h2>
  <hr />
  <form:form action="saveUniver" method="post" modelAttribute="univer">
    <table>
      <tr>
        <th>Day</th>
        <td>
          <form:input path="day" /> 
          <form:errors path="day" cssClass="error" />
         </td>
      </tr>
      <tr>
        <th>FreeRooms</th>
        <td>
          <form:input path="freeRooms" /> 
          <form:errors path="freeRooms" cssClass="error" />
         </td>
      </tr>      
      <tr>
        <td><button type="submit">Submit</button></td>
      </tr>
    </table>
  </form:form>
 </fieldset>  
 <br>
 <br>    
 
  <fieldset>
    <h2>AllFreeRooms</h2>
    <table class="resltTable">
      <tr>
        <th>Day</th>
        <th>FreeRooms</th>
      </tr>
      <c:forEach items="${univers}" var="univer">
        <tr>
          <td>${univer.day}</td>
          <td>${univer.freeRooms}</td>
        </tr>
      </c:forEach>

    </table>
  </fieldset>
    
</body>
</html>