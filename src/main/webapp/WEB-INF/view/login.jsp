<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<form action="login.do" method="post">
    <p><font color="red">${errorMessage}</font> </p>
    Enter Name <input type="text" name="name">
</br>
    Enter Password <input type="text" name="password">
    <input type="submit" value="Submit"/>
</form>
</body>
</html>