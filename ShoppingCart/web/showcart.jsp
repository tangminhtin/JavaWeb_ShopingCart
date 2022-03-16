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
        <%@include file="./panner.jsp" %>

        <div class="container">
            <div class="d-flex justify-content-center m-5">
                <h1>My Cart</h1>
            </div>
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
                        <tr>
                            <th scope="row">1</th>
                            <td>Dell</td>
                            <td><input type="text" class="form-control w-25 p-1" placeholder="" value="2"></td>
                            <td>300</td>
                            <td>600</td>
                            <td><a href="#">Remove</a></td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td>Dell</td>
                            <td><input type="text" class="form-control w-25 p-1" placeholder="" value="2"></td>
                            <td>300</td>
                            <td>600</td>
                            <td><a href="#">Remove</a></td>
                        </tr>
                        <tr>
                            <th scope="row" colspan="3"><a href="#">Update</a></th>
                            <td>Total</td>
                            <td>1200</td>
                            <td><a href="#">Remove All</a></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
