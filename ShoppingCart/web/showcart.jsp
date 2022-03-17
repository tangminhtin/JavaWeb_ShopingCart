<%@page import="Model.Entities.CartItem"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Cart</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
    </head>
    <body>
        <%@include file="./panner.jsp"%>
        <%
            ArrayList<CartItem> cart = (ArrayList<CartItem>) session.getAttribute("cart");
        %>

        <div class="container">
            <div class="d-flex justify-content-center m-5">
                <h1>My Cart</h1>
            </div>
            <form action="CartController">
                <div class="d-flex justify-content-center">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Name</th>
                                <th scope="col">Quantity</th>
                                <th scope="col">Price</th>
                                <th scope="col">Total</th>
                                <th scope="col">Remove</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% if (cart != null) {
                                    for (CartItem i : cart) {
                            %>
                            <tr>
                                <th scope="row">1</th>
                                <td><%=i.getProduct().getProductName()%></td>
                                <td><input type="text" class="form-control w-25 p-1" placeholder="" value="<%=i.getQuantity()%>"></td>
                                <td><%=i.getProduct().getListPrice()%></td>
                                <td><%=i.getTotalPrice()%></td>
                                <td><button class="btn btn-danger" type="submit" name="removeCartId" value="<%=i.getProduct().getProductId()%>">Remove</button></td>
                            </tr>
                            <%}
                                }%>
                            <tr>
                                <th scope="row" colspan="3"><button class="btn btn-success" type="submit" name="" value="<%%>">Checkout</a></th>
                                <td>Total</td>
                                <%if (cart != null) {
                                        double total = 0.0;
                                        for (CartItem i : cart) {
                                            total += i.getQuantity() * i.getProduct().getListPrice();
                                        }%>
                                <td><%=total%></td>

                                <%                                    } else {%>
                                <td></td>
                                <%}
                                %>
                                <td><button type="submit" class="btn btn-danger" name="removeAll" value="">Remove All</button></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </form>
        </div>
    </body>
</html>
