<%--
  Created by IntelliJ IDEA.
  User: mhpsy
  Date: 6/22/22
  Time: 12:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/hind/map" method="post">
<%--    因为这里后台使用的是map所以这里直接存一个string就可以了--%>
    用户1 id:<input type="text" name="users['a'].id"><br>
    用户1姓名:<input type="text" name="users['a'].name"><br>
<%--    这里这样传入name="userList[0].address.adCode"是会报错的 我先等会在研究怎么传这种集合对象里面对象的对象--%>
<%--    用户1邮编:<input type="text" name="userList[0].address.adCode"><br>--%>
<%--    用户1地址:<input type="text" name="userList[0].address.value"><br>--%>
    用户2 id:<input type="text" name="users['b'].id"><br>
    用户2姓名:<input type="text" name="users['b'].name"><br>
<%--    用户2邮编:<input type="text" name="userList[1].address.adCode"><br>--%>
<%--    用户2地址:<input type="text" name="userList[1].address.value"><br>--%>
    <input type="submit" value="提交">
</form>

</body>
</html>
