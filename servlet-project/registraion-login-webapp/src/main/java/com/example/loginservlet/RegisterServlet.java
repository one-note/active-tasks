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

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            PrintWriter out = response.getWriter();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginInfo", "root", "root");

            String username = request.getParameter("username1");
            String password = request.getParameter("password1");

            PreparedStatement checkUserExists = con.prepareStatement("SELECT * FROM users WHERE username = ?");
            checkUserExists.setString(1, username);
            ResultSet resultSet = checkUserExists.executeQuery();

            if (resultSet.next()) {
                out.println("Registration unsuccessful. User already exists.");

            } else {
                PreparedStatement registerUser = con.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)");
                registerUser.setString(1, username);
                registerUser.setString(2, password);
                int rowsAffected = registerUser.executeUpdate();

                if (rowsAffected > 0) {
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("okregister.jsp");
                    requestDispatcher.forward(request, response);
                } else {
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("error.jsp");
                    requestDispatcher.forward(request, response);
                }
            }
        } catch (ClassNotFoundException | SQLException | ServletException e) {
            throw new RuntimeException(e);
        }
    }
}
