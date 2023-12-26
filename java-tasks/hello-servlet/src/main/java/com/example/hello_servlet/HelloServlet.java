package com.example.hello_servlet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message,text;

    public void init() {
        message = "Hello World Web Application!";
        text = "This web app is deployed in the Tomcat server and remote debugging is done on it";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>" + text + "</h2>");
        out.println("</body></html>");
        System.out.println("This is test");
    }

    public void destroy() {
    }
}