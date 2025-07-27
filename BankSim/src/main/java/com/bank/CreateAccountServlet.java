package com.bank;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class CreateAccountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pin = request.getParameter("pin");
        String accNumber = "ACC" + System.currentTimeMillis();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/BankSim", "root", "rootakshay");

            String sql = "INSERT INTO accounts (acc_number, pin, balance) VALUES (?, ?, 0)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, accNumber);
            ps.setString(2, pin);
            ps.executeUpdate();

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>Account Created!</h2>");
            out.println("<p>Your Account Number is: " + accNumber + "</p>");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
