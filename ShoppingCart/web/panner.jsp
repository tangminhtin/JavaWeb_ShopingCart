<%@page import="Model.Entities.Customer"%>
<%
    Customer customer = (Customer) session.getAttribute("customer");
%>
<% if (customer != null) {%>
<div class="container-fluid bg-secondary text-white">
    <div class="d-flex justify-content-center">
        <p class="pe-5">Roll Number: <%=customer.getCustomerId()%></p>
        <p class="pe-5">Full name: <%=customer.getFirstName() + " " + customer.getLastName()%></p>
        <p class="pe-5">Welcome: <%=customer.getUserName()%></p>
    </div>
</div>
<%}%>

<div class="container-fluid" style="background-color: #e3f2fd;">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="./index.jsp">Shopping cart</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarScroll">
                <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                    <% if (customer == null) { %>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="./customerlogin.jsp">Login</a>
                    </li>
                    <%}%>
                    <% if (customer != null) { %>
                    <li class="nav-item">
                        <a class="nav-link" href="./LogoutController">Logout</a>
                    </li>
                    <%}%>

                    <% if (customer == null) { %>
                    <li class="nav-item">
                        <a class="nav-link" href="./register.jsp">Register</a>
                    </li>
                    <%}%>
                    <% if (customer != null) { %>
                    <li class="nav-item">
                        <a class="nav-link" href="./showcart.jsp">Show Cart</a>
                    </li>
                    <%}%>
                </ul>
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
</div>