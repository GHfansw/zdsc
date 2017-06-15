<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/6/15
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>中医适宜技术培训</title>
</head>
<body>
<h3 style="text-align: center">培训课程介绍</h3>
<p>初级课程</p>
<c:forEach var="courseitem"   items="${courses1}" >
    标题：${courseitem.name}<br>
</c:forEach>
<p>中级课程</p>
<c:forEach var="courseitem"   items="${courses2}" >
    标题：${courseitem.name}<br>
</c:forEach>
<p>高级课程</p>
<c:forEach var="courseitem"   items="${courses3}" >
    标题：${courseitem.name}<br>
</c:forEach>
</body>
</html>
