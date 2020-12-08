<!-- <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
FOR TESTING
jsp从被请求到响应经历的三个阶段：
第一阶段：  根据pageEncoding指定的编码方案将jsp编译成Servlet（.java）文件
第二阶段：  从Servlet文件（.java）到Java字节码文件（.class）
第三阶段：  从服务器到浏览器由contentType属性中的charset来指定输出。
            默认的是ISO-8859-1 -->
<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>This is a jsp.</h1>
</body>
</html>