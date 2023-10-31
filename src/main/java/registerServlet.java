import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegesterServlet", urlPatterns = "/register")
public class registerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String email= request.getParameter("email");
        System.out.println("the user's email was " + email);

        response.setContentType("text/html");
        PrintWriter output = response.getWriter();
        output.println("<h1>User's email is " + email + "!</h1>");
    }

}
