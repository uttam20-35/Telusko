package com.telusko;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlets extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("In Service");
//        response.getWriter().println("Hello World");
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        out.println("<b>Hello User</b>");
    }
}
