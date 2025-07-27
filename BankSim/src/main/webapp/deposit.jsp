import javax.servlet.http.HttpServlet;   
<html>
<head><title>Deposit</title></head>
<body>
    <h2>Deposit Money</h2>
    <form action="DepositServlet" method="post">
        Account Number: <input type="text" name="acc_number" required /><br/><br/>
        Enter Amount: <input type="number" name="amount" min="1" required /><br/><br/>
        <input type="submit" value="Deposit" />
    </form>
</body>
</html>
