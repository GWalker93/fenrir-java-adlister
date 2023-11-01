<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int num =20; %>
<%! int counter = 0; %>
<% counter++; %>
<html>
<head>
    <title><%= num > 19 %></title>

    <%@ include file="partials/head.jsp" %>
</head>
<body>

<%@ include file="partials/navbar.jsp" %>

    <h1>The current count is: <%= counter%></h1>

    <c:if test="<%= num == 20%>">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="${19 > 20}">
        <h1>Variable names</h1>
    </c:if>
    <c:if test="${19 < 20}">
        <h1>Variable names 1</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>

<%@ include file="partials/scripts.jsp" %>
</body>
</html>
