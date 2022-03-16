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
        <div class="container-fluid bg-secondary text-white">
            <div class="d-flex justify-content-center">
                <p class="pe-5">Roll Number: </p>
                <p class="pe-5">Full name: </p>
                <p class="pe-5">Welcome: </p>
            </div>
        </div>
        <div class="container-fluid mt-3">
            <div class="row">
                <div class="col-2">
                    <div class="container">
                        <a href="#" class="alert alert-secondary d-block m-0">Customer</a>
                        <a href="#" class="alert alert-secondary d-block m-0">Product manager</a>
                        <a href="#" class="alert alert-secondary d-block m-0">Bill Manager</a>
                    </div>
                </div>
                <div class="col-10">
                    <div class="d-flex justify-content-center">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col">Bill ID</th>
                                    <th scope="col">Customer Name</th>
                                    <th scope="col">Date</th>
                                    <th scope="col">Total</th>
                                    <th scope="col">Status</th>
                                    <th scope="col">View</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <th scope="row">10</th>
                                    <td>Tung</td>
                                    <td>07/08/2015</td>
                                    <td>200</td>
                                    <td>Wait</td>
                                    <td><a href="#">Details</a></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
