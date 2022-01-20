<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<body>
<h2>Hello World!</h2>
    <form action="data09.do" method="get">
        <input name="strList[0]" value="你好"/>
        <input name="strList[1]" value="旅行者"/>

        <input name="map['one']" value="你好"/>
        <input name="map['two']" value="旅行者"/>
        <button type="submit">提交</button>
    </form>
</body>
</html>
