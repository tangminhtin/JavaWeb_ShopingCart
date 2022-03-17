<%@page import="Model.Entities.Product"%>
<%@page import="Model.DAO.ProductDAO"%>
<%@page import="Model.Entities.Bill"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.DAO.BillDAO"%>
<%@page import="Model.Entities.Staff"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Cart</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css" rel="stylesheet" />
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" rel="stylesheet" />
        <link href="https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.5.0/css/flag-icon.min.css" rel="stylesheet" />
    </head>
    <body>
         <%@include file="./panner.jsp" %>
        <%
            Staff staff = (Staff) session.getAttribute("staff");
        %>
        <% if (staff != null) {%>
        <div class="container-fluid bg-secondary text-white">
            <div class="d-flex justify-content-center">
                <p class="pe-5">Roll Number: <%=staff.getStaffId()%></p>
                <p class="pe-5">Full name: <%=staff.getFirstName() + " " + staff.getLastName()%></p>
                <p class="pe-5">Welcome: <%=staff.getUsername()%></p>
            </div>
        </div>
        <%}%>

        <%
            BillDAO bdao = new BillDAO();
            ArrayList<Bill> bills = bdao.getBills();
            
            ProductDAO productDAO = new ProductDAO();
            ArrayList<Product> listProduct = productDAO.getAll();

        %>
        <div class="container-fluid mt-3">
            <div class="row">
                <div class="col-2">
                    <div class="container">
                        <div class="d-grid">
                             <a href="./admincustomer.jsp" class="alert alert-secondary d-block m-0 mb-2">Customer</a>
                            <a href="./adminproduct.jsp" class="alert alert-secondary d-block m-0 mb-2">Product manager</a>
                            <a href="./admin.jsp" class="alert alert-secondary d-block m-0 mb-2">Bill Manager</a>
                        </div>
                    </div>
                </div>
                <div class="col-10">
                    <div class="d-flex justify-content-center">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col">Product ID</th>
                                    <th scope="col">Product Name</th>
                                    <th scope="col">Model Year</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">Brand Name</th>
                                    <th scope="col">Category</th>
                                </tr>
                            </thead>
                            <tbody>
                                <% for (Product b : listProduct) {%>
                                <tr>
                                    <th scope="row"><%=b.getProductId()%></th>
                                    <td><%=b.getProductName()%></td>
                                    <td><%=b.getModelYear()%></td>
                                    <td><%=b.getListPrice()%></td>
                                    <td><%=b.getBrandName()%></td>
                                    <td><%=b.getCategoryName() %></td>
                                    
                                    
        
                                </tr>
                                <%}%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script src="./status.ajax"></script>

</html>
