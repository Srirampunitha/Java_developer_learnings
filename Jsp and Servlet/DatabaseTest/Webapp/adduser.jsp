<html>
<title>Add Users</title>
<body>

 <h2>Want To Add new User ! Fill below forms </h2>
 <br><br>
<form action="<%=request.getContextPath()%>/SiteController">
    Name :<input type = "text" name = "Name" >
    <br><br>
    Email:<input type = "text" name = "Email" >
    <input type ="hidden" name = "page" value ="useradded" >
    <br><br>
    <input type ="submit" value = "Submit">
</form>
</body>
</html>
