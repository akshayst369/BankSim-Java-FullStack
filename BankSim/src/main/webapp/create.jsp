<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Account</title>
</head>
<body>
    <h1>Create Bank Account</h1>
    <form action="CreateAccountServlet" method="post">
        Enter 4-digit PIN: <input type="password" name="pin" pattern="\d{4}" required /><br/><br/>
        <input type="submit" value="Create Account" />
    </form>
</body>
</html>
