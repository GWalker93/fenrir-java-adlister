import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageCount", urlPatterns = "/count")
public class PageCount extends HttpServlet {

    int count = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter output = response.getWriter();

        count++;
        output.println("<h1>The count is = " + count + ".</h1>");

        if (count >= 4 & count <= 6)  {
            output.println("<h1>Wow</h1>");
        } else if ( count >=7 & count <=9) {
            output.println("<h1>Wow almost to big.</h1>");
        } else if ( count == 10) {
            output.println("<h1> RESET!!!!!</h1>");
            count -= 10;
        }


    }

}
