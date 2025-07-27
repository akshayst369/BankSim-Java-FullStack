package com.bank;

import java.io.*;
import javax.servlet.http.HttpServlet;   // ✅ correct for Tomcat 9
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DepositServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accNumber = request.getParameter("acc_number");
        double amount = Double.parseDouble(request.getParameter("amount"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BankSim", "root", "rootakshay");

            String sql = "UPDATE accounts SET balance = balance + ? WHERE acc_number = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, amount);
            ps.setString(2, accNumber);

            int rows = ps.executeUpdate();

            PrintWriter out = response.getWriter();
            response.setContentType("text/html");

            if (rows > 0) {
                out.println("<h3>" + amount + " deposited successfully to " + accNumber + "</h3>");
            } else {
                out.println("<h3>Account not found.</h3>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
