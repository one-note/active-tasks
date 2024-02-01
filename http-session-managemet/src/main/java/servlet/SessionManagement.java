package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SessionManagement", urlPatterns = "/SessionManagement")
public class SessionManagement extends HttpServlet {

String username = "user-session";
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HttpSession session = request.getSession();

        session.setAttribute("sessionId", session.getId());
        session.setAttribute("sessionUser", username);
        session.setAttribute("creationTime", session.getCreationTime());
        session.setMaxInactiveInterval(10000);

        Cookie cookie = new Cookie("sessionId", session.getId());
        cookie.setMaxAge(session.getMaxInactiveInterval());
        cookie.setPath("/");
        response.addCookie(cookie);

        response.setHeader("Server", "Apache-Tomcat 10.1.13");
        response.setDateHeader("Date", System.currentTimeMillis());
        response.setHeader("Content-Type", "text/html; charset=UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Expires", "Fri, 04 Jan 2024 16:00:00 GMT");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Content-Disposition", "inline; filename=\"data.txt\"");
        response.setHeader("Location", "/new-page");
        response.setHeader("Set-Cookie", "username=user1; Expires=Thu, 01 Jan 2025 00:00:00 GMT");


        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Session Management</title></head>");
        out.println("<body>");
        out.println("<h2>Session Information</h2>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Session ID: " + session.getId() + "</p>");
        out.println("<p>Session Creation Time: " + session.getCreationTime() + "</p>");
        out.println("<p>Session Max Inactive Interval: " + session.getMaxInactiveInterval() + "</p>");
        out.println("<p>Cookie Max Age: " + 1000 + "</p>");


        out.println("<h2>Response Headers</h2>");
        out.println("<p>Server: " + response.getHeader("Server") + "</p>");
        out.println("<p>Date: " + response.getHeader("Date") + "</p>");
        out.println("<p>Content-Type: " + response.getHeader("Content-Type") + "</p>");
        out.println("<p>Cache-Control: " + response.getHeader("Cache-Control") + "</p>");
        out.println("<p>Expires: " + response.getHeader("Expires") + "</p>");
        out.println("<p>Pragma: " + response.getHeader("Pragma") + "</p>");

        out.println("</body>");
        out.println("</html>");

        out.close();


    }

}
