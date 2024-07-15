<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<html>
<head>
   <title>Spring 평가</title>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
<div class="container mt-5">
  <h1 class="mb-4">KPI Pool</h1>
  <table class="table">
    <thead>
      <tr onclick="location.href='/kpi/list.do'">
        <th>SUBKPI</th>
        <th>KPINAME</th>
        <th>MAINKPI</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="kpi" items="${list}">
   	  <tr>
        <td>${kpi.subKpi}</td>
        <td>${kpi.kpiName}</td>
        <td>${kpi.mainKpi}</td>
      <tr>
      </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>
