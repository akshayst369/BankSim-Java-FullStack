package com.bank;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accNumber = request.getParameter("acc_number");
        String pin = request.getParameter("pin");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BankSim", "", "");

            String sql = "SELECT * FROM accounts WHERE acc_number = ? AND pin = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, accNumber);
            ps.setString(2, pin);
            ResultSet rs = ps.executeQuery();

            PrintWriter out = response.getWriter();
            response.setContentType("text/html");

            if (rs.next()) {
                double balance = rs.getDouble("balance");
                out.println("<h2>Welcome " + accNumber + "!</h2>");
                out.println("<p>Your Balance: " + balance + "</p>");
            } else {
                out.println("<h3>Invalid account number or PIN!</h3>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
