<%@page import="Model.DAO.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Entities.Product"%>
<%
    ArrayList<Product> products = (ArrayList<Product>) session.getAttribute("products");
    if (products == null) {
        products = new ProductDAO().getAll();
    }
%>
<% if (products != null) {
        for (Product p : products) {
%>

<form action="CartController">
    <div class="list-group" >
        <div href="#" class="list-group-item list-group-item-action">
            <div class="d-flex justify-content-start">
                <p class="me-5"><%=p.getProductName()%></p>
                <p class="me-5"><%=p.getListPrice()%></p>
                <p class="me-5"><%=p.getBrandName()%></p>
                <button type="submit" name="addCart" class="btn btn-success me-5" value="<%=p.getProductId()%>"><i class="bi bi-cart-plus text-white"></i></button>
            </div>
        </div>
    </div>  
</form>


<% }
    }%>