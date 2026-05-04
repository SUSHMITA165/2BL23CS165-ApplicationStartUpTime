package com.sush;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/startup")
public class StartupTimeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = getServletContext();

        Long startTime = (Long) context.getAttribute("startTime");

        if (startTime == null) {
            startTime = System.currentTimeMillis();
            context.setAttribute("startTime", startTime);
        }

        long currentTime = System.currentTimeMillis();
        long uptime = currentTime - startTime;

        long totalMinutes = uptime / (1000 * 60);
        long hours = totalMinutes / 60;
        long minutes = totalMinutes % 60;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Application Startup Time Display</h2>");
        out.println("<p>Application Startup Time: " + new Date(startTime) + "</p>");
        out.println("<p>Current Time: " + new Date(currentTime) + "</p>");
        out.println("<p>Application Uptime: " + hours + " hrs " + minutes + " min</p>");
        out.println("<br><a href='startup'>Refresh</a>");
        out.println("<br><br><a href='index.html'>Back</a>");
        out.println("</body></html>");
    }
}