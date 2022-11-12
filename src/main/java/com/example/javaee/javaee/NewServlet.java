package com.example.javaee.javaee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NewServlet", value = "/NewServlet")
public class NewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h1>Hello world!</h1>");
        pw.println("</body>");
        pw.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
