import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class LibraryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("!!!!!!!!!!!! :(");
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/first_java_db",
                    "postgres", "admin");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from books");

            PrintWriter writer = response.getWriter();
            while (resultSet.next()) {
                writer.println(resultSet.getString("title"));
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
