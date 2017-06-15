<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/6/15
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>政策法规</title>
</head>
<body>
政策：<c:forEach var="policyitem"   items="${policy}" >
    标题：${policyitem.title}&nbsp;&nbsp;&nbsp;&nbsp;内容：${policyitem.content}<br>
</c:forEach><br>
</body>
</html>
