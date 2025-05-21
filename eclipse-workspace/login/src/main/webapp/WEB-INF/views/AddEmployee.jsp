<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<h1>Add Employee</h1>
        <form:form action="save" method="post" modelAttribute="employee1">
			First Name: <form:input path="firstname" /><br/>
			Middle Name: <form:input path="middlename" /><br/>
			Last Name: <form:input path="lastname" /><br/>
			Birth Date:<form:input path="birthdate"/><br/>
			Position:<form:input path="position"/><br/>
			<input type="submit" value="Save"/>
	

</form:form>
</body>
</html>