<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/6/15
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>师承培训</title>
</head>
<body>
介绍：${scpx.introduction}<br>
考纲: ${scpx.exam}<br>
新闻：<c:forEach var="newsitem"   items="${news}" >
    标题：${newsitem.title}&nbsp;&nbsp;&nbsp;&nbsp;内容：${newsitem.content}<br>
</c:forEach><br>
政策：<c:forEach var="policyitem"   items="${policy}" >
    标题：${policyitem.title}&nbsp;&nbsp;&nbsp;&nbsp;内容：${policyitem.content}<br>
</c:forEach><br>
</body>
</html>
