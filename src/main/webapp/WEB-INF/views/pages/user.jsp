<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USER</title>
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
  <h2>User Form</h2>
  <hr />
  <form:form action="saveUser" method="post" modelAttribute="user">
    <table>
      <tr>
        <th>ProfessorName</th>
        <td>
          <form:input path="professor" /> 
          <form:errors path="professor" cssClass="error" />
         </td>
      </tr>
      <tr>
        <th>Login</th>
        <td>
          <form:input path="login" /> 
          <form:errors path="login" cssClass="error" />
         </td>
      </tr>      
      <tr>
        <th>Password</th>
        <td>
          <form:input path="password" /> 
          <form:errors path="password" cssClass="error" />
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
    <h2>AllUsers</h2>
    <table class="resltTable">
      <tr>
        <th>Professor</th>
        <th>Login</th>
        <th>Password</th>
      </tr>
      <c:forEach items="${users}" var="user">
        <tr>
          <td>${user.professor}</td>
          <td>${user.login}</td>
          <td>${user.password}</td>
        </tr>
      </c:forEach>

    </table>
  </fieldset>
 
</body>
</html>