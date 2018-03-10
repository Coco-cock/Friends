<%--
  Created by IntelliJ IDEA.
  User: YYF
  Date: 2018/1/23
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="favicon.ico">
    <title>Signin Template for Bootstrap</title>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/signin.css" rel="stylesheet">
    <script src="/js/jquery.js"></script>
</head>

<body>
<div id="particles-js">
    <div id="sigin">
<form class="form-signin">
    <img class="mb-4" src="/img/kaola.ico" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal">校友社交</h1>
    <label for="inputId" class="sr-only">Email address</label>
    <input type="text" id="inputId" class="form-control" placeholder="学号" required autofocus>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="密码" required>
    <div style="margin-bottom: 15px">
        <label for="inputNu" class="sr-only">Code</label>
        <input type="text" id="inputNu" placeholder="验证码">
        <img id="randomcode_img" alt="" width="56" height="20" align='absMiddle' src="/getValidateCode"/>
        <a id="re">看不清</a><br>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
</form>
    </div>
</div>
<script src="/js/particles.min.js"></script>
<script src="/js/app.js"></script>
</body>
<script type="text/javascript">
    $(document).ready(function () {
        $("#re").click(function () {
            $("#randomcode_img").attr({src: "http://localhost:8080/getValidateCode?time=" + new Date()});
        });
    });
</script>

</html>
