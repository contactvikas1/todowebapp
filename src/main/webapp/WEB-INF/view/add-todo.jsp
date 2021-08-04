<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

<div class="container">
    <H1>Welcome ${name}</H1>
<form method="POST" action="/add-todo.do">
    <fieldset class="form-group">
        <label>Description</label>
	    <input name="name"  type="text" class="form-control"/> </br>
    </fieldset>
    <fieldset class="form-group">
        <label>Category</label>
	    <input name="category"  type="text" class="form-control"/></br>
	</fieldset>
<input name="add" type="submit" value="Submit" class="btn btn-success" />
</form>
</div>
<%@ include file="../common/footer.jspf" %>