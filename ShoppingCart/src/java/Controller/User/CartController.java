/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.User;

import Model.DAO.ProductDAO;
import Model.Entities.CartItem;
import Model.Entities.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CartController", urlPatterns = {"/CartController"})
public class CartController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CartController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CartController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        if (request.getParameter("addCart") != null) {
            int productId = Integer.valueOf(request.getParameter("addCart"));
            ProductDAO pdao = new ProductDAO();
            Product p = pdao.getProductById(productId);
            HttpSession session = request.getSession();
            if (session.getAttribute("cart") == null) {
                ArrayList<CartItem> cart = new ArrayList<>();
                cart.add(new CartItem(p, 1, p.getListPrice()));
                session.setAttribute("cart", cart);
            } else {
                ArrayList<CartItem> cart = (ArrayList<CartItem>) session.getAttribute("cart");
                int index = isExisting(productId, cart);
                if (index == -1) {
                    cart.add(new CartItem(p, 1, p.getListPrice()));
                } else {
                    int quantity = cart.get(index).getQuantity() + 1;
                    cart.get(index).setQuantity(quantity);
                }
                session.setAttribute("cart", cart);
            }
        }

//        int removeId = Integer.valueOf(request.getParameter("removeId"));
        if (request.getParameter("removeCartId") != null) {
            int cartId = Integer.parseInt(request.getParameter("removeCartId"));
            HttpSession session = request.getSession();
            ArrayList<CartItem> cart = (ArrayList<CartItem>) session.getAttribute("cart");
            int index = isExisting(cartId, cart);
            if (index != -1) {
                cart.remove(index);
            }
            session.setAttribute("cart", cart);
        }

        if (request.getParameter("removeAll") != null) {
            HttpSession session = request.getSession();
            session.setAttribute("cart", null);
        }

        response.sendRedirect("showcart.jsp");
    }

    private int isExisting(int id, ArrayList<CartItem> cart) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getProduct().getProductId() == id) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
