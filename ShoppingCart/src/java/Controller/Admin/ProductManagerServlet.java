package Controller.Admin;

import Model.DAO.ProductDAO;
import Model.Entities.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProductManagerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
//        ProductDAO productDao = new ProductDAO();
//        ArrayList<Product> products = null;
//
//        if (request.getParameter("cate") != null) {
//            products = productDao.getProductByCategoryName(request.getParameter("cate"));
//        }

//        HttpSession session = request.getSession();
//        session.setAttribute("products", products);
        response.sendRedirect("adminproduct.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
