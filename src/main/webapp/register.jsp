<%--
  Created by IntelliJ IDEA.
  User: mhpsy
  Date: 6/21/22
  Time: 10:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<form action="/hello/save" method="post">
  用户id:<input type="text" name="id"><br>
  用户名:<input type="text" name="name"><br>
<%--  如果要给对象里面嵌套的对象赋值 就要使用这种对象.值的方式了--%>
    用户邮编:<input type="text" name="address.adCode"><br>
    用户地址:<input type="text" name="address.value"><br>
  <input type="submit" value="注册">
</form>

</body>
</html>
