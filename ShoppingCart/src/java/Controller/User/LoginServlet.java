package Controller.User;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n = request.getParameter("username");
        String p = request.getParameter("userpass");

//        if (LoginDao.validate(n, p)) {
//            RequestDispatcher rd = request.getRequestDispatcher("servlet2");
//            rd.forward(request, response);
//        } else {
//            out.print("Sorry username or password error");
//            RequestDispatcher rd = request.getRequestDispatcher("index.html");
//            rd.include(request, response);
//        }

        out.close();
    }
}

