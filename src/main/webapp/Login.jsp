<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title><%="Log In"%></title>
  </head>
  <body>
    <h1>Please Log In</h1>

    <form method=POST action=Login.jsp>
      <label>Email</label>
      <input placeholder="Email">
      <label>Password</label>
      <input placeholder="Password">
      <button type="reset">Submit</button>
    </form>

  </body>
</html>
