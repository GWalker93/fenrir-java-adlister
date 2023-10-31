import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Craps", urlPatterns = "/craps")
public class Craps extends HttpServlet {

    int count = 0;
    int count2 = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter output = response.getWriter();

        output.println("<h1>Who wants to roll today?????</h1>");

        output.println("<h3>Rules are simple. Refresh the page to roll the dice. Keep rolling till you hit 7 or Skake Eyes.</h3>");

        output.println("<h3>If you want in it's simple. Roll the dice (refresh page).</h3>");

//        count++;
//        count2++;

        output.println(Math.random() + count);


//        output.println("<h1>The count is = " + count + ".</h1>");
//
//        if (count >= 4 & count <= 6)  {
//            output.println("<h1>Wow</h1>");
//        } else if ( count >=7 & count <=9) {
//            output.println("<h1>Wow almost to big.</h1>");
//        } else if ( count == 10) {
//            output.println("<h1> RESET!!!!!</h1>");
//            count -= 10;
//        }


    }

}
