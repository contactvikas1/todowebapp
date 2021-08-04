package com.technovihaan.jee.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 *
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 *
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class
//used to extend the capabilities of servers
//that host applications accessed by means of
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    /**
     * This is going to called for first time fom welcome page with get request
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
      //  super.doPost(httpServletRequest, httpServletResponse);
        String name = httpServletRequest.getParameter("name");
        String password = httpServletRequest.getParameter("password");
        Boolean isValid = UserValidation.validateCrediential(name, password);
//        String returnPage="/WEB-INF/view/";
       if (isValid) {
           httpServletRequest.getSession().setAttribute("name",name);

        httpServletRequest.setAttribute("msg","login success");
         httpServletResponse.sendRedirect("/list-todo.do");
       } else {
            httpServletRequest.setAttribute("errorMessage","Invalid Credential");
            httpServletRequest.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(httpServletRequest, httpServletResponse);
        }

    }
}