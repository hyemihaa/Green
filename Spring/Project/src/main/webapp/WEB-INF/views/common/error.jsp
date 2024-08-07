<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<style>
body {
    background: #2E95EF;
    background-image: -moz-radial-gradient(center 45deg,circle cover, #9BD1FF, #2E95EF);
    background-image: -webkit-gradient(radial, 50% 50%, 0, 50% 50%,800, from(#9BD1FF), to(#2E95EF));
    padding-top: 15%;
}
.img-error{
width:220px;
height:220px;
}
</style>
</head>
<body>
<div class="container bootstrap snippets bootdey">
    <div class="row">
        <div class="col-md-12">
            <div class="pull-right" style="margin-top:10px;">
                <div class="col-md-10 col-md-offset-1 pull-right">
                    <img class="img-error" src="https://bootdey.com/img/Content/fdfadfadsfadoh.png">
                    <h2>404 Not Found</h2>
                    <p>Sorry, an error has occured, Requested page not found!</p>
                    <div class="error-actions">
                        <a href="${referer}" class="btn btn-primary btn-lg">
                            <span class="glyphicon glyphicon-arrow-left"></span>
                            Back Home 
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
