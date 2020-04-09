import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> Hello " + name + " " + surname + " </h1>");
        pw.println("</html>");

//        response.sendRedirect("first-jsp");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("first-jsp");
        requestDispatcher.forward(request, response);

    }
}
