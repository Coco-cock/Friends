<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello YYF</h1>

<span> ID:${user.toString()} </span>
<<br>
<span> Name: ${user.name}</span>
<span> passwd: ${user.passwd}</span>
</body>
</html>
