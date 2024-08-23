/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
@WebServlet(urlPatterns = {"/MiServerlet"})
public class MiServerlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String titulo = "Su Información";
        
        try (PrintWriter out = response.getWriter()) {
            /*out.println("<html>");
            out.println("<body bgcolor=\"#f4f4f4\">\n");
            out.println("<h1 align=center>" + titulo + "</h1>\n");
            out.println("<ul>\n");
            out.println(" <li><b>Nombre</b>: " + request.getParameter("name") + "\n");
            out.println(" <li><b>Correo</b>: " + request.getParameter("email") + "\n");
            out.println(" <li><b>Password</b>: " + request.getParameter("password") + "\n");
            out.println("</ul>\n");
            out.println("</body></html>");*/
            
            
            out.println("<html>");
            out.println("<head>");
            
            out.println("<style>");
            out.println("body {");
            out.println("    font-family: Arial, sans-serif;");
            out.println("    background-color: #f4f4f4;");
            out.println("    margin: 0;");
            out.println("    padding: 0;");
            out.println("}");
            out.println(".container {");
            out.println("    max-width: 500px;");
            out.println("    margin: 50px auto;");
            out.println("    padding: 20px;");
            out.println("    background-color: #fff;");
            out.println("    box-shadow: 0 0 10px rgba(0,0,0,0.1);");
            out.println("}");
            out.println("</style>");
            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container\">");
            out.println("<h1 align=\"center\">" + titulo + "</h1>");
            out.println("<ul>");
            out.println(" <li><b>Nombre</b>: " + request.getParameter("name") + "</li>");
            out.println(" <li><b>Correo</b>: " + request.getParameter("email") + "</li>");
            out.println(" <li><b>Password</b>: " + request.getParameter("password") + "</li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
