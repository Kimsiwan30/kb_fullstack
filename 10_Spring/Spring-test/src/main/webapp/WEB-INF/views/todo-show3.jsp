<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Member List</title>
</head>
<body>
<%@ include file="header.jsp"%>
<h1>Todo 목록 V3</h1>
<ul>
    <li><b>할 일</b></li>
    <c:forEach var="todo" items="${todoDtoList}">
        <li>${todo.todo}</li>
    </c:forEach>
</ul>
</body>
</html>
