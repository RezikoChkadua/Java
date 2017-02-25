/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author neodze
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String userName = request.getParameter("userName");
            String password = request.getParameter("userPassword");
            
            if(userName.equals("admin") && password.equals("pass")){
                HttpSession session = request.getSession();
                session.setAttribute("username",userName);
                response.sendRedirect("welcome.jsp");
        }
            else{ 
                response.sendRedirect("login.jsp");
            }
    }
}
