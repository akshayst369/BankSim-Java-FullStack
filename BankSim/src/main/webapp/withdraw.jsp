<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Withdraw</title></head>
<body>
    <h2>Withdraw Money</h2>
    <form action="WithdrawServlet" method="post">
        Account Number: <input type="text" name="acc_number" required /><br/><br/>
        Enter Amount: <input type="number" name="amount" min="1" required /><br/><br/>
        <input type="submit" value="Withdraw" />
    </form>
</body>
</html>
