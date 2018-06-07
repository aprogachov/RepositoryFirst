<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REQUEST</title>
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
  <h2>Request Form</h2>
  <hr />
  <form:form action="saveRequest" method="post" modelAttribute="request">
    <table>
      <tr>
        <th>Discipline</th>
        <td>
          <form:input path="discipline" /> 
          <form:errors path="discipline" cssClass="error" />
         </td>
      </tr>
      <tr>
        <th>Group</th>
        <td>
          <form:input path="group" /> 
          <form:errors path="group" cssClass="error" />
         </td>
      </tr>      
      <tr>
        <th>PairsInWeek</th>
        <td>
            <form:input path="pairsInWeek" /> 
            <form:errors path="pairsInWeek" cssClass="error" />
         </td>
      </tr>
      <tr>
        <th>UserId</th>
        <td>
            <form:input path="userId" /> 
            <form:errors path="userId" cssClass="error" />
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
    <h2>AllRequests</h2>
    <table class="resltTable">
      <tr>
        <th>Discipline</th>
        <th>Group</th>
        <th>PairsInWeek</th>
        <th>UserId</th>
      </tr>
      <c:forEach items="${requests}" var="request">
        <tr>
          <td>${request.discipline}</td>
          <td>${request.group}</td>
          <td>${request.pairsInWeek}</td>
          <td>${request.userId}</td>
        </tr>
      </c:forEach>

    </table>
  </fieldset>
 
</body>
</html>