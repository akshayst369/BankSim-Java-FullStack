package com.bank;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DeleteAccountServlet extends HttpServlet {
    private static final long serialVersionUID = 3L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accNumber = request.getParameter("acc_number");
        String pin = request.getParameter("pin");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BankSim", "root", "rootakshay");

            String sql = "DELETE FROM accounts WHERE acc_number = ? AND pin = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, accNumber);
            ps.setString(2, pin);

            int rowsDeleted = ps.executeUpdate();

            PrintWriter out = response.getWriter();
            response.setContentType("text/html");

            if (rowsDeleted > 0) {
                out.println("<h3>Account " + accNumber + " deleted successfully.</h3>");
            } else {
                out.println("<h3>Invalid account number or PIN.</h3>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }
}
