<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Delete Account</title></head>
<body>
    <h2>Delete Your Account</h2>
    <form action="DeleteAccountServlet" method="post">
        Account Number: <input type="text" name="acc_number" required /><br/><br/>
        PIN: <input type="password" name="pin" required /><br/><br/>
        <input type="submit" value="Delete Account" />
    </form>
</body>
</html>
