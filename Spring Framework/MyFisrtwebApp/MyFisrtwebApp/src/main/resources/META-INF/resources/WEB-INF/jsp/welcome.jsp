<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
<body>
<div class  ="container">
<h2>Welcome  ${name}</h2>
  
hey ${name}! Want to manages your todos Click below button ! 
 <br>
 <a href = "listtodos" class="btn btn-success">ListTodos</a>
 </div>
 <br><br>
 <%@ include file = "common/footer.jspf" %>