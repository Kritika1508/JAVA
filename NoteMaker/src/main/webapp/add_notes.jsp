<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_css_jsp.jsp"   %>
</head>
<body>
 <div class="container-fluid" p-0 m-0 >
   <%@include file="NavBar.jsp" %>
   
   
   <br>
   <h2> Fill your Details...</h2>
   <!-- this is add form -->
   
   <form action="SaveNoteServlet" method="post">
  <div class="form-group">
    <label for="title">Enter Title</label>
    <input type="text" name="title"  class="form-control"  placeholder= " write title here"id="title" aria-describedby="emailHelp" required>
    <small id="title" class="form-text text-muted">Give suitable title for easy access</small>
  </div>
  <div class="form-group">
    <label for="content">Enter Content</label>
    <textarea id="content"  name="content" placeholder="write content here" class="form-control" style="height:300px" required></textarea>
  </div>
  <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <div class="container text-center">
  <button type="submit" class="btn btn-primary">Add</button>
</form>
   
   
   
   </div>

</body>
</html>