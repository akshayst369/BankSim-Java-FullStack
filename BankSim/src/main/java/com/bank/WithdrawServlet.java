package com.bank;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class WithdrawServlet extends HttpServlet {
    private static final long serialVersionUID = 2L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accNumber = request.getParameter("acc_number");
        double amount = Double.parseDouble(request.getParameter("amount"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BankSim", "root", "rootakshay");

            // First, check balance
            String checkSql = "SELECT balance FROM accounts WHERE acc_number = ?";
            PreparedStatement checkPs = conn.prepareStatement(checkSql);
            checkPs.setString(1, accNumber);
            ResultSet rs = checkPs.executeQuery();

            PrintWriter out = response.getWriter();
            response.setContentType("text/html");

            if (rs.next()) {
                double currentBalance = rs.getDouble("balance");

                if (currentBalance >= amount) {
                    // Proceed with withdrawal
                    String withdrawSql = "UPDATE accounts SET balance = balance - ? WHERE acc_number = ?";
                    PreparedStatement withdrawPs = conn.prepareStatement(withdrawSql);
                    withdrawPs.setDouble(1, amount);
                    withdrawPs.setString(2, accNumber);
                    withdrawPs.executeUpdate();

                    out.println("<h3>" + amount + " withdrawn from account " + accNumber + "</h3>");
                } else {
                    out.println("<h3>Insufficient balance.</h3>");
                }
            } else {
                out.println("<h3>Account not found.</h3>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
