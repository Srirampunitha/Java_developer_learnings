<html>
<head>
 <title>LogIn Page</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/sayhello">
UserName:<input type ="text" name = "name">
<br><br>
Password:<input type ="text" name = "pwd">
<br><br>
<input type="submit" value ="Login">
</form>
</body>

</html>