<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/30
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="test/base.do" method="post">
    用户：<<input type="text" name="username">
    密码：<<input type="password" name="password">
    邮箱：<<input type="email" name="email">
    <input type="submit" value="注册"/>
</form>--%>
<hr/>
<form action="cha/select.do" method="post">
    用户：<<input type="text" name="username">
    密码：<<input type="text" name="password">
    邮箱：<<input type="text" name="email">
    <input type="submit" value="查询"/>
</form>
<form action="cha/select2.do" method="post">
    用户：<<input type="text" name="username">
    密码：<<input type="text" name="password">
    邮箱：<<input type="text" name="email">
    <input type="submit" value="查询"/>
</form>
</body>
</html>
