<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
<body>
<div class  ="container">
<h2>Welcome to the Login page </h2>
<br>
 your name :${name}
 <br> 
 your password : ${password}
 <br>
 Want to manages your todos Click below button ! 
 <br>
 <a href = "listtodos" class="btn btn-success">Todos</a>
 </div>
 <%@ include file = "common/footer.jspf" %>