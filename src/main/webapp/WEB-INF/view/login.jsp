<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
<form action="login.do" method="post">
    <p><font color="red">${errorMessage}</font> </p>
    Enter Name <input type="text" name="name">
</br>
    Enter Password <input type="password" name="password">
    <input type="submit" value="Submit"/>
</form>
<%@ include file="../common/footer.jspf" %>
