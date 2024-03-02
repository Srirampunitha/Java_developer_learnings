<html>
<title>User Info</title>
<body>

<button onclick="window.location.href='<%= request.getContextPath()%>/Controller';">
      Add User
    </button>
<br><br>
<table border ="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Update user</th>
<th>Delete User</th>
</tr>
<tr>
<td>ID</td>
<td>Name</td>
<td>Email</td>
<td> <a href = "Updateuser.jsp">Update</a></td>
<td> <a href = "<%= request.getContextPath()%>/Controller?action=delete">Delete</a></td>
</tr>

</table>
</body>
</html>