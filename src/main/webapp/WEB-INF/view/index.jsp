<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h2>Hello</h2>

<form action="${pageContext.request.contextPath}/userAdd" modelAttribute="user" method="post">
Country:- <input type="text" name="country"><br>
Name:- <input type="text" name="name"><br>
<input type="submit" name="submit" value="submit">
</form>

<br><br>
<table border="5">
<thead>
<th>Id</th>
<th>country</th>
<th>name</th>
<th>edit</th>
<th>delete</th>
</thead>
<tbody>
<c:forEach items="${listUser}" var="u">
<tr>
<td>${u.id}</td>
<td>${u.country}</td>
<td>${u.name}</td>
<td><a href="<c:url value="/editUser/${u.id}"/>">Edit</a></td>
<td><a href="<c:url value="/deleteUser/${u.id}"/>">Delete</a></td>
</tr>
</c:forEach>

</tbody>

</table>

</body>
</html>
