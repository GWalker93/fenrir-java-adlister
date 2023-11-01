<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title><%="Log In"%></title>

    <%@ include file="partials/head.jsp" %>

  </head>
  <body>

  <%@ include file="partials/navbar.jsp" %>

    <h1>Please Log In</h1>

    <form method=POST action=Login.jsp>
      <label for="username">Email</label>
      <input type="text" id="username" name="username" placeholder="Email">

      <label for="password">Password</label>
      <input type="text" id="password" name="password" placeholder="Password">

      <button type="submit">Submit</button>
    </form>

    <% String username = request.getParameter("username");%>
    <% String password = request.getParameter("password");%>

    <c:choose>
      <c:when test='${param.username.equals("admin") && param.password.equals("password")}'>
          <%response.sendRedirect("/Profiles.jsp");%>
      </c:when>
    </c:choose>

  <%@ include file="partials/scripts.jsp" %>

  </body>
</html>
