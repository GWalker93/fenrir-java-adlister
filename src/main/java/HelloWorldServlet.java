import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>Hello, World!</h1>");

    }
}

// <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
//<%@ page contentType="text/html;charset=UTF-8" language="java" %>
//<%! int num =20; %>
//<%! int counter = 0; %>
//<% counter++; %>
//<html>
//<head>
//    <title><%= num > 19 %></title>
//</head>
//<body>
//
//    <h1>The current count is: <%= counter%></h1>
//
//<%--    <h1>Welcome To The Site!</h1>--%>
//<%--    <p>Path: <%= request.getRequestURL() %></p>--%>
//<%--    <p>Query String: <%= request.getQueryString() %></p>--%>
//<%--    <p>"name" parameter: <%= request.getParameter("name") %></p>--%>
//<%--    <p>"method" attribute: <%= request.getMethod() %></p>--%>
//<%--    <p>User-Agent header: <%= request.getHeader("user-agent") %></p>--%>
//
//<%--    <c:if test="<%= num == 20%>">--%>
//<%--        <h1>Variable names should be very descriptive</h1>--%>
//<%--    </c:if>--%>
//<%--    <c:if test="${19 > 20}">--%>
//<%--        <h1>Variable names</h1>--%>
//<%--    </c:if>--%>
//<%--    <c:if test="${19 < 20}">--%>
//<%--        <h1>Variable names 1</h1>--%>
//<%--    </c:if>--%>
//<%--    <c:if test="false">--%>
//<%--        <h1>single letter variable names are good</h1>--%>
//<%--    </c:if>--%>
//
//</body>
//</html>
