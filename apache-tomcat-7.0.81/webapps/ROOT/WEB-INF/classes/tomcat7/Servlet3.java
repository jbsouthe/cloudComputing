package tomcat7;
import java.io.IOException; import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet; import javax.servlet.http.*;
@WebServlet("/Servlet3") public class Servlet3 extends HttpServlet {
    public Servlet3() {
        super();
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Hello from Servlet 3.0!");
    }
}


