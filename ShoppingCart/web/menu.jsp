<%@page import="java.util.ArrayList"%>
<%@page import="Model.DAO.ProductDAO"%>
<%
    ProductDAO pdao = new ProductDAO();
    ArrayList<String> categories = pdao.getCategories();
%>
<% if (categories != null) {
        for (String cate : categories) {%>
<div class="container">
    <form action="ProductController">
        <div class="d-grid">
            <button href="" type="submit" class="alert alert-secondary d-block m-0 mb-2" name="cate" value="<%=cate%>"><%=cate%></button>
        </div>
    </form>
</div>
<% }
    }%>
