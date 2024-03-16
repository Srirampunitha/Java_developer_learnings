<html>
<title>Update Users</title>
<body>

 <h2>Want To update  User ! Fill below forms </h2>
 <br><br>
<form action="<%=request.getContextPath()%>/SiteController">
     ID  : <input type = "text" name = "ID" value = "<%=request.getParameter("id") %>" >
     <br><br>
    Name :<input type = "text" name = "Name" >
    <br><br>
    Email:<input type = "text" name = "Email" >
    <input type ="hidden" name = "page" value ="userupdated" >
    <br><br>
    <input type ="submit" value = "Submit">
</form>
</body>
</html>
