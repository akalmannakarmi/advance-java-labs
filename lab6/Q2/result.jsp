<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result Page</title>
</head>
<body>
    <h2>Hello, ${param.name}!</h2>
    <p>The sum of ${param.num1} and ${param.num2} is: 
    <%= Integer.parseInt(request.getParameter("num1")) + Integer.parseInt(request.getParameter("num2")) %></p>
</body>
</html>
