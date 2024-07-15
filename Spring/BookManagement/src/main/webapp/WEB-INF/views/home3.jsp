<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<html>
<head>
   <title>RESTful API 평가</title>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
<div class="container mt-5">
  <h1 class="mb-4">KPI Pool</h1>
  <input type="text" id="mainKpi" placeholder="mainKpi를 입력해주세요.">
  <button type="button" onclick="kpiList()">제출</button>
  
  <!--
     http://localhost/api/kpi/입력된값
     위의 URL로 비동기 통신하여 입력된 값(mainKpi)에 맞는
     정보(subKpi, kpiName, mainKpi)를 콘솔 로그로 출력하세요.
  -->
     <script>
   function kpiList() {
	   const mainKpi = document.getElementById("mainKpi").value;
	   
	   $.ajax({
		   type: "GET",
		   url: "/api/kpi/" + mainKpi,
		   contentType: "application/json",
		   success: function(res) {
			  console.log(res); 
			  console.log(JSON.parse(res.body)); 
		   },                                               
	   	   error: function(err) {
	   	   }
	   })
   }
   </script>
  
</div>
</body>
</html>