<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
<body>
<div class  ="container">
<h1>Welcome to the Todos page ${name}</h1>
<br>
<table border="1" class = "table">
<thead>
<tr>
<th>ID</th>
<th>USERNAME</th>
<th>TODOS</th>
<th>TARGET DATE</th>
<th>IS IT DONE ?</th>
<th>DELETE</th>
<th>UPDATE</th>
</tr>
</thead>
<tbody>
<c:forEach var= "todolist" items="${todos}" >
<tr>
<td>${todolist.id}</td>
<td>${todolist.username }</td>
<td>${todolist.todos }</td>
<td>${todolist.date }</td>
<td>${todolist.done}</td>
<td><a href="delete-todo?id=${todolist.id}" class = "btn btn-warning">DELETE</a></td>
<td><a href="update-todo?id=${todolist.id }" class = "btn btn-success">UPDATE</a></td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="add-todo" class = "btn btn-success">ADD-TODO</a>
</div>
<%@ include file = "common/footer.jspf" %>