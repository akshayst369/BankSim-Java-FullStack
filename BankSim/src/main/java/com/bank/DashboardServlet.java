package com.bank;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DashboardServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("acc_number") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        String accNumber = (String) session.getAttribute("acc_number");
        double balance = 0.0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/BankSim", "root", "rootakshay");

            String sql = "SELECT balance FROM accounts WHERE acc_number = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, accNumber);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                balance = rs.getDouble("balance");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set data for JSP
        request.setAttribute("balance", balance);
        request.setAttribute("acc_number", accNumber);

        RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
        rd.forward(request, response);
    }
}
