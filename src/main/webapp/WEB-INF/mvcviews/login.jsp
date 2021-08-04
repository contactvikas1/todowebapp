<html>
<title>
My First Spring MCV page
</title>
<head>
</head>
<body>
<form action="/spring-mvc/login" method="post">
    <p><font color="red">${errorMessage}</font> </p>
    Enter Name <input type="text" name="name">
</br>
    Enter Password <input type="password" name="password">
    <input type="submit" value="Submit"/>
</form>
</body>