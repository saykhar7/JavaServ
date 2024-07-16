<%--
  Created by IntelliJ IDEA.
  User: Rma_Dept_Plustek
  Date: 7/15/2024
  Time: 3:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="login.css">
</head>
<body>

<!-- Container for the login form, centered on the page -->
<div class="container d-flex justify-content-center align-items-center min-vh-100">
    <div class="card p-4" style="width: 20rem;">
        <h2 class="text-center mb-4">Login</h2>
        <form action="LoginServ" method="post">
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Login</button>
            <br>
            <p>New User? <a href="register.jsp">Click here to register</a></p>
        </form>
    </div>
</div>

</body>
</html>
