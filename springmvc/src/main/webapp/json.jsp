<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Json</title>
</head>
<body>
    <input type="button" value="JSON请求" onclick="test()">
    <script type="text/javascript" src="">
        function test(){
            $.ajax({
                type:"post",
                url:"query04",
                data:'{"userName":"admin","userPwd":"123456"}',
                contentType:"application/json;charset=UTF-8",//传递json格式的数据
                success:function(data){
                    console.log(data);
                }

            });

        }
    </script>
</body>
</html>