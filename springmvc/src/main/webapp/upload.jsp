<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    文件上传
        1.表单的提交类型是post
        2.表单的类型 enctype="multipart/form-data"
--%>
    <form action="uploadFile.do" method="post" enctype="multipart/form-data">
        <input type="file" name="file"/>
        <button>上传</button>
    </form>
</body>
</html>