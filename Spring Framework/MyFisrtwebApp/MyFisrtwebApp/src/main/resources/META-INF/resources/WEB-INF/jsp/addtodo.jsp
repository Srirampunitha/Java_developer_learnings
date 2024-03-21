<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
<body>
<div class  ="container">
<h1>Want to add your todos! ${name} Fill below forms!</h1>
<br>
<form:form method ="post" modelAttribute="todo">
<fieldset class ="mb-3">
  <form:label path="todos">Todos Description</form:label>
  <form:input type = "text" value ="${todos}" path="todos"/> 
  <form:errors path ="todos" cssClass="alert alert-warning" />
</fieldset> 

<fieldset class ="mb-3">
  <form:label path="date">Target Date</form:label>
  <form:input value ="${date}" path="date"  required = "required"/> 
  <form:errors path ="date" cssClass="alert alert-warning" />
</fieldset>

<form:input type ="hidden" path="id"/>

<form:input type ="hidden" path="done"/>
<input type = "submit" class = "btn btn-success">
</form:form>
</div>
<%@ include file = "common/footer.jspf" %>