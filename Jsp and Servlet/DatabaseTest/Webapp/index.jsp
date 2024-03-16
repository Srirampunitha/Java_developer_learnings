<html>
<title>Home Page</title>
<body>

 <h2>Want To see User Details click below button ! </h2>
 <br><br>
<form action="<%=request.getContextPath()%>/SiteController">
    <input type="hidden" name = "page" value = "listusers">
    <input type ="submit" value = "List Users">
</form>
</body>
</html>
