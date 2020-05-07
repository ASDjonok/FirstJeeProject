import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("user_id", "123");
        Cookie cookie2 = new Cookie("user_name", "Oleksii");
        Cookie cookie3 = new Cookie("user_locale", "ua");

        cookie.setMaxAge(24 * 60 * 60);

        response.addCookie(cookie);
        response.addCookie(cookie2);
        response.addCookie(cookie3);
    }
}
