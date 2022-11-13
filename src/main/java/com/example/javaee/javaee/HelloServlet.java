package com.example.javaee.javaee;

import java.io.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        //localhost:8080/hello-world?name=Akzhol
        //порядок задания не важен
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + " "+ name + " " + surname + "</h1>");
        out.println("</body></html>");
//        response.sendRedirect("firstJSP.jsp");
    }

    public void destroy() {
    }
}