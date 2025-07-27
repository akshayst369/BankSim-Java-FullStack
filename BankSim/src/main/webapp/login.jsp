<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Login</title></head>
<body>
    <h1>Login to Your Account</h1>
    <form action="LoginServlet" method="post">
        Account Number: <input type="text" name="acc_number" required /><br/><br/>
        4-digit PIN: <input type="password" name="pin" pattern="[0-9]{4}" required />
        <input type="submit" value="Login" />
    </form>
</body>
</html>
