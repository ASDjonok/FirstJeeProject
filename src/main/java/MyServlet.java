import myPackage.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();

        String userName = request.getParameter("regUserName");
        if (userName != null) {
            session.setAttribute("user_" + userName, "" + Math.random());
        }

        Cart cart = (Cart) session.getAttribute("cart");
        String name = request.getParameter("name");
        String quantityString = request.getParameter("quantity");
        if (null != name && null != quantityString) {
            int quantity = Integer.parseInt(quantityString);

            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }
        session.setAttribute("cart", cart);

        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            session.setAttribute("count", 1);
//            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }

        /*String name = request.getParameter("name");
        String surname = request.getParameter("surname");*/

        /*PrintWriter pw = response.getWriter();

        pw.println("<html>");
//        pw.println("<h1> Hello " + name + " " + surname + " </h1>");
        pw.println("<h1> Count = " + count + " </h1>");
        pw.println("</html>");*/

//        response.sendRedirect("first-jsp");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("first-jsp");
        requestDispatcher.forward(request, response);

    }
}
