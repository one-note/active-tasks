package com.example.loginservlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            PrintWriter out = response.getWriter();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginInfo","root","root");


            String namee = request.getParameter("username1");
            String pass = request.getParameter("password1");

            PreparedStatement pst = con.prepareStatement("SELECT *  from users where username =? and password = ?");
            pst.setString(1,namee);
            pst.setString(2,pass);
             ResultSet re =  pst.executeQuery();
            out.println(re.next());

             if(re.next()){
                 RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
                 requestDispatcher.forward(request,response);


             }else {
                 RequestDispatcher requestDispatcher = request.getRequestDispatcher("error.jsp");
                 requestDispatcher.forward(request,response);
             }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
}
