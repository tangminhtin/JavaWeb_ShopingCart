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
        <div class="d-flex justify-content-center m-5">
            <h1>Register</h1>
        </div>
        <div class="d-flex justify-content-center m-5 pb-5">
            <form action="RegisterController" class="col-3" method="POST">
                <div class="mb-3">
                    <label for="firstName" class="form-label">First name</label>
                    <input name="firstName" type="text"  class="form-control" id="firstName" aria-describedby="firstName">
                </div>
                <div class="mb-3">
                    <label for="lastName" class="form-label">Last name</label>
                    <input name="lastName" type="text"  class="form-control" id="lastName" aria-describedby="lastName">
                </div>
                <div class="mb-3">
                    <label for="phone" class="form-label">Phone</label>
                    <input name="phone" type="text"  class="form-control" id="phone" aria-describedby="phone">
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input name="email" type="text"  class="form-control" id="email" aria-describedby="email">
                </div>
                <div class="mb-3">
                    <label for="street" class="form-label">Street</label>
                    <input name="street" type="text"  class="form-control" id="street" aria-describedby="street">
                </div>
                <div class="mb-3">
                    <label for="city" class="form-label">City</label>
                    <input name="city" type="text"  class="form-control" id="city" aria-describedby="city">
                </div>
                <div class="mb-3">
                    <label for="state" class="form-label">State</label>
                    <input name="state" type="text"  class="form-control" id="state" aria-describedby="state">
                </div>
                <div class="mb-3">
                    <label for="zipCode" class="form-label">Zip code</label>
                    <input name="zipCode" type="text"  class="form-control" id="zipCode" aria-describedbyzipCode">
                </div>
                <div class="mb-3">
                    <label for="username" class="form-label">Username</label>
                    <input name="username" type="text"  class="form-control" id="username" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input name="password" type="password" class="form-control" id="password">
                </div>
                <div class="d-grid">
                    <button value="register" type="submit" class="btn btn-primary">Register</button>
                </div>
            </form>
        </div>
    </body>
</html>
