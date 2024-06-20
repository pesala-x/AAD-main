package lk.ijse;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Incoming request " + req.getRemoteAddr());
        resp.getWriter().println("Hello I'm from MyServlet");

        ServletConfig config = getServletConfig();
        String city = config.getInitParameter("City");
        System.out.println("MyServlet " + city);

        ServletContext context = getServletContext();
        String country = context.getInitParameter("Country");
        System.out.println("MyServlet " + country);
    }
}
