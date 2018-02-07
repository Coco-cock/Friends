<%--
  Created by IntelliJ IDEA.
  User: YYF
  Date: 2018/1/23
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1></h1>
<form action="/login" method="post">
    <input type="text" name="name"  value="User"><br>
    <input type="password" name="passwd" value="passwd"><br>

    <input type="submit" value="登陆">

</form>
</body>
</html>
