<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    ${SPRING_SECURITY_LAST_EXCEPTION.message}
    <form action="${pageContext.request.contextPath}/login" method="post">
        <label for="username">User Name</label>
        <label>
            <input type="text" name="username"/>
        </label>
        <br>
        <label for="password">Password</label>
        <label>
            <input type="password" name="password"/>
        </label>
        <input type="submit" value="login">
    </form>
</body>
</html>