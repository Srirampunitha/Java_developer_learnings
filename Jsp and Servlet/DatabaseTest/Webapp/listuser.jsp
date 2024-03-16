<%@ page import="java.util.List" %>
<%@ page import="com.database.Entity.UserDetail" %>
<html>
<title>Home Page</title>
<body>

 <h2>User Info</h2>
 <hr>
<form action = "<%= request.getContextPath()%>/SiteController">
  <input type ="hidden" name = "page" value ="addusers" >
  <input type ="submit" value = "Add Users">
  </form>
 <br><br>
 <table border="1">
 <tr>
 <th>ID</th>
 <th>Name</th>
 <th>Email</th>
 <th>Update</th>
 <th>Delete</th>
 </tr>
 <% 
List<UserDetail> user = (List) request.getAttribute("users");
 
 for(UserDetail userdetail : user){
	 
	 out.print("<tr>");
	 out.print("<td>" + userdetail.getID()+"</td>");
	 out.print("<td>" + userdetail.getName()+"</td>");
	 out.print("<td>" + userdetail.getEmail()+"</td>");
	 out.print("<td> <a href="+request.getContextPath()+"/SiteController?page=update&id="+userdetail.getID()+">Update</a>");
	 out.print("<td> <a href="+request.getContextPath()+"/SiteController?page=delete&id="+userdetail.getID()+">Delete</a>");
	 out.print("</tr>");
 }
 
 
 %>
 </table>
 <br><br>
 <a href = "index.jsp">HOME PAGE</a>
</body>
</html>