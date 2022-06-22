<%--
  Created by IntelliJ IDEA.
  User: mhpsy
  Date: 6/22/22
  Time: 9:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json</title>
    <script src="js/jquery-min-3.6.0.js"></script>
    <script>
        //使用jquery里面的ajax传一个json格式的user给后端 然后后端修改一下返回前端
        $(function (){
            var user={
                "id":1,
                "name":"张三"
            };
            $.ajax({
                url:"/hind/json",
                data:JSON.stringify(user),
                type:"POST",
                contentType:"application/json;charset=utf-8",
                dataType:"JSON",
                success:function (data){
                    alert(data.id+"==="+data.name);
                }
            })
        });
    </script>
</head>
<body>

</body>
</html>
