package com.servlet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServletOne extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        ServletContext context = getServletContext();
        String country = context.getInitParameter("country");

        response.setContentType("text/html");
        try {
            PrintWriter out = response.getWriter();
            out.println("<h3>Hi there</h3>");
            out.println("<h4>" + country + "</h4>");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}