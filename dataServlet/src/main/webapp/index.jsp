<!DOCTYPE html>
<html>
<head>
    <title>User Registration and Display</title>
</head>
<body>
    <h1>User Registration and Display</h1>
    <form action="RegistrationServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" name="name"><br><br>
        <label for="email">Email:</label>
        <input type="email" name="email"><br><br>
        <label for="password">Password:</label>
        <input type="password" name="password"><br><br>
        <input type="submit" value="Register">
    </form>
    <br>
    <form action="DisplayServlet" method="post">
        <input type="submit" value="Display">
    </form>
</body>
</html>
