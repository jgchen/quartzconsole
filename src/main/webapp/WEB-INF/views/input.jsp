<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Sign in &middot; Twitter Bootstrap</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }

      .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
           -moz-border-radius: 5px;
                border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
      }
      .form-signin .form-signin-heading,
      .form-signin .checkbox {
        margin-bottom: 10px;
      }
      .form-signin input[type="text"],
      .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
      }

    </style>
    <link href="static/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">

  </head>

  <body>

    <div class="container">
    
      <form class="form-signin" method="post" action="<%=request.getContextPath()%>/">   
      <c:if test="${!empty  errorMessage}">
       <div class="alert alert-error">
       <a href="#" class="close" data-dismiss="alert">&times;</a>
         ${errorMessage}
       </div> 
       </c:if>
        <h2 class="form-signin-heading">请输入远程机器信息</h2>
        <input type="text"  name="name" class="input-block-level" placeholder="连接名称">
        <input type="text" name="host" class="input-block-level" placeholder="host地址">
        <input type="text"  name="port" class="input-block-level" placeholder="远程端口">
        <input type="text"  name="userName" class="input-block-level" placeholder="用户名称">
        <input type="password" name="password" class="input-block-level" placeholder="远程密码">

        <button class="btn btn-large btn-primary" type="submit" >连接</button>
      </form>

    </div> <!-- /container -->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  
    <script src="static/bootstrap/js/bootstrap.min.js"></script>

  </body>
</html>