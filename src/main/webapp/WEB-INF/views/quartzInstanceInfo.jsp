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
    <link href="static/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">

  </head>

  <body>
      
    <div class="container">
    <p class="lead">quartz实例列表</p>    
        <table class="table  table-bordered table-hover table-striped">
           <tr>
             <th>实例Id</th>
             <th>实例名称</th>        
             <th>线程池大小</th>
             <th>线程管理</th>
             <th>存储方式</th>        
             <th>quartz版本</th>
             <th>状态</th>
             <th>操作</th>
           <tr>
          <c:forEach var="schedulerInfo" items="${quartzInstanceInfo.schedulerInfos}">
             <td>${schedulerInfo.schedulerInstanceId}</td>
             <td>${schedulerInfo.schedulerName}</td>
              <td>${schedulerInfo.threadPoolSize}</td>
               <td>${schedulerInfo.threadPoolClassName}</td>
              <td>${schedulerInfo.jobStoreClassName}</td>
              <td>${schedulerInfo.version}</td>
              <td>  <c:if test="${schedulerInfo.started}">运行</c:if>
                    <c:if test="${schedulerInfo.standbyMode}">暂停</c:if>
              </td>
             <td>
                <c:if test="${schedulerInfo.started}">暂停  终止</c:if>
                 <c:if test="${schedulerInfo.standbyMode}">启动   终止</c:if>
             </td>
          </c:forEach>
       </table>
        

    </div> <!-- /container -->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  
    <script src="static/bootstrap/js/bootstrap.min.js"></script>

  </body>
</html>