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
                        <a href="#" class="alert alert-secondary d-block m-0 mb-2">Customer</a>
                        <a href="#" class="alert alert-secondary d-block m-0 mb-2">Product manager</a>
                        <a href="#" class="alert alert-secondary d-block m-0 mb-2">Bill Manager</a>
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
                                    <td>    
                                        <div class="dropdown">
                                            <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownStatus" data-bs-toggle="dropdown" aria-expanded="false"><span class="bi bi-hourglass-split"></span> <span>Wait</span></button>
                                            <ul class="dropdown-menu" aria-labelledby="dropdownStatus">
                                                <li>
                                                    <a class="dropdown-item active" href="#"><span class="bi bi-hourglass-split"></span> <span>Wait</span></a>
                                                </li>
                                                <li>
                                                    <a class="dropdown-item" href="#"><span class="bi bi-arrow-clockwise"></span> <span>Process</span></a>
                                                </li>
                                                <li>
                                                    <a class="dropdown-item" href="#"><span class="bi bi-check-circle-fill"></span> <span>Done</span></a>
                                                </li>
                                            </ul>
                                        </div>
                                    </td>
                                    <td><a href="./billdetail.jsp">Details</a></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script src="./status.ajax"></script>

</html>
