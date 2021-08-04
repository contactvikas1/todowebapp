package com.technovihaan.jee.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("*.do")
public class LoginRequiredFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(filterConfig.getServletContext().getServerInfo());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) servletRequest;
        String name=(String) req.getSession().getAttribute("name");
        if(name!=null && name.length()>0){
            System.out.println("in Filter name "+name);
           filterChain.doFilter(servletRequest,servletResponse);
        }else
        {
            req.getSession().invalidate();
            req.getRequestDispatcher("/login.do").forward(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy() {
        System.out.println("In Filter destroy 1");
    }
}
