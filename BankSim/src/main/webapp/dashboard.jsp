<%@ page import="java.sql.*, javax.servlet.http.*, javax.servlet.*" %>
<%@ page session="true" %>
<%
    String accNumber = (String) session.getAttribute("acc_number");
    if (accNumber == null) {
        response.sendRedirect("login.jsp");
        return;
    }
    
    double balance = 0.0;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSim", "root", "rootakshay");
        PreparedStatement ps = conn.prepareStatement("SELECT balance FROM accounts WHERE acc_number = ?");
        ps.setString(1, accNumber);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            balance = rs.getDouble("balance");
        }
        conn.close();
    } catch (Exception e) {
        out.println("Error fetching balance: " + e.getMessage());
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <h2>Welcome <%= accNumber %>!</h2>
    <p>Current Balance: ₹<%= balance %></p>

    <form action="deposit.jsp" method="get">
        <input type="submit" value="Deposit">
    </form>
    <form action="withdraw.jsp" method="get">
        <input type="submit" value="Withdraw">
    </form>
    <form action="DeleteAccountServlet" method="post" onsubmit="return confirm('Are you sure you want to delete your account?');">
        <input type="submit" value="Delete Account">
    </form>
    <form action="LogoutServlet" method="post">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
