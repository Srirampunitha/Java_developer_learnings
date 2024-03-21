<html>
<head>
<link href = "webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel ="stylesheet" >
 <title>LogIn Page</title>
</head>
<body>
<div class  ="container">
<h2> Login Page Enter your credentials </h2>
<pre> ${errormessage}</pre>
<form method = "post" class ="login">
UserName:<input type ="text" name = "name">
<br><br>
Password:<input type ="password" name = "password">
<br><br>
<input type="submit" value ="Login" class="btn btn-success">
</form>
</div>
<script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
</body>

</html>