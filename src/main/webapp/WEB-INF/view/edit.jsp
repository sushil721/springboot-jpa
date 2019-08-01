<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h2>Hello</h2>

<form action="/userAdd" modelAttribute="user" method="post">
ID:-<input type="text" name="id" value="${user.id}">
Country:- <input type="text" name="country" value="${user.country}"><br>
Name:- <input type="text" name="name" value="${user.name}"><br>
<input type="submit" name="submit" value="submit">
</form>

<br><br>


</body>
</html>
