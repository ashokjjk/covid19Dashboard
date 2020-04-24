<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Covid-19 Dashboard</title>
<link rel="shortcut icon" href="images/favicon.png" type="image/x-icon" />
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">COVID-19 Dashboard</a>
    </div>
    <ul class="nav navbar-nav navbar-right">
      <li class="active "><a href="#">Brought to you by- Ashok Kumar</a></li>
      
    </ul>
  </div>
</nav>
<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="text-warning">${totalRepCase}</h1>      
    <p>Global Reported Cases</p>
  </div>
</div>
<div class="container">
<table class="table">
  
    <tr>
        <th>Province/State</th>
        <th>Country/Region</th>
        <th>Total Case</th>
        <th>New Case</th>
    </tr>
    <c:forEach items="${stats}" var="stat">
    <tr>
        <td>
            ${stat['State']}
        </td>
        <td>
            ${stat['Country']}
        </td>
        <td>
            ${stat['TotalCase']}
        </td>
        <td>${stat['OldCase']}</td>
    </tr>
    </c:forEach>
</table>
</div>
<!-- Footer -->
<footer class="page-footer font-small bg-primary">

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3">© 2020 Copyright:</div>
  <!-- Copyright -->
<div class="text-center">Data fetched from John Hopkins. Credits- CSSEGISandData/Github Repo</div>
</footer>
<!-- Footer -->


</body>
</html>