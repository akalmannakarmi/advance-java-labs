import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InputServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Enter Your Info</h2>");
        out.println("<form action='result' method='post'>");
        out.println("Name: <input type='text' name='name'><br>");
        out.println("Number 1: <input type='number' name='num1'><br>");
        out.println("Number 2: <input type='number' name='num2'><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form></body></html>");
    }
}
