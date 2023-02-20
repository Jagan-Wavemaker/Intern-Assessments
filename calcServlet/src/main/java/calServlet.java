import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcServlet")
public class calServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
//     This is the number that will help the JVM to identify the state of an object when it reads the state of the object from a file

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operation = request.getParameter("operation");

        int result = 0;

        if (operation.equals("add")) {
            result = num1 + num2;
        } else if (operation.equals("sub")) {
            result = num1 - num2;
        } else if (operation.equals("mul")) {
            result = num1 * num2;
        } else if (operation.equals("div")) {
            result = num1 / num2;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Result is: " + result + "</h1>");
//        out.println("</body></html>");
    }

}

