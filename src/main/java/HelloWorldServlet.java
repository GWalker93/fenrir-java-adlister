import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("cohort");
        System.out.println("the parameter in our url said: " + name);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (name == null){
            out.println("<h1>Hello, World!</h1>");
        }
        else

            out.println("<h1>Hello " + name + "!</h1>");

        out.println("<h1>Welcome to my page!!!</h1>");

        out.println("<form method=\"POST\" action=\"/register\">\n" +
            "<label for=\"email\">Email:</label>\n" +
           "<input id=\"email\" name=\"email\" placeholder=\"Enter your email address\" />\n" +
            "</form>\n");

    }
}
