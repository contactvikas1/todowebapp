<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

	<div class="container">
		<H1>Welcome ${name}</H1>

		Your Todos are
		<table class="table table-striped">
		    <thead>
		        <th>Description</th>
		        <th>Category</th>
		        <th>Action</th>
		    </thead>

		    <tbody>
		    <c:forEach items="${todos}" var="todo">
		          <tr>

		            <td>${todo.name}</td>
		            <td>${todo.category}</td>
		            <td>&nbsp; <a class="btn btn-danger" href="/deletetodo.do?todo=${todo.name}&category=${todo.category}">Delete</a></td>

		          </tr>
            </c:forEach>
		    </tbody>

		</table>

			<a class="btn btn-success"	href="/add-todo.do">Add Todo</a>


		<p>
			<font color="red">${errorMessage}</font>
		</p>

	</div>

<%@ include file="../common/footer.jspf" %>