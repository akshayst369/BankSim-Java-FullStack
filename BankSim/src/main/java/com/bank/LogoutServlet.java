package com.bank;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(false); // get current session
        if (session != null) {
            session.invalidate(); // end the session
        }
        response.sendRedirect("index.jsp"); // redirect to login page
    }
}